package com.dragonhunters.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonhunters.infrastructure.MonsterRepository;
import com.dragonhunters.model.card.monster.MonsterCard;
import com.dragonhunters.model.card.monster.MonsterLevelEnum;
import com.dragonhunters.model.gameplay.GameSetup;
import com.dragonhunters.util.RandomnessUtil;

@Service
public class MonsterSelectorService implements SelectorService<GameSetup> {

	private MonsterActionSelectorService actionSelectorService;
	private MonsterRepository monsterRepository;
	
	@Autowired
	public MonsterSelectorService(MonsterRepository monsterRepository, MonsterActionSelectorService monsterActionSelectorService) {
		super();
		this.monsterRepository = monsterRepository;
		this.actionSelectorService = monsterActionSelectorService;
	}
	
	@Override
	public void select(GameSetup game) {
		//Get ANIMALS
		game.setAnimals(this.drawMonsters(MonsterLevelEnum.ANIMAL, GameSetup.NUMBER_OF_ANIMALS));
		//Get BEASTS
		game.setBeasts(this.drawMonsters(MonsterLevelEnum.BESTIAL, GameSetup.NUMBER_OF_BEASTS));
		//Get DRAGON
		game.setDragon(this.drawMonsters(MonsterLevelEnum.MYTHICAL, GameSetup.NUMBER_OF_MYTHICAL_MONSTERS).get(0));
	}

	private List<MonsterCard> drawMonsters(MonsterLevelEnum level, int quantity) {
		List<MonsterCard> available = this.monsterRepository.findBySelector(level);
		List<MonsterCard> selected = new ArrayList<>();
		
		for(int i = 0; i < quantity; i++) {
			MonsterCard monster = (MonsterCard) RandomnessUtil.drawCard(available);
			
			if (monster == null) {
				break;
			}
			
			this.actionSelectorService.select(monster);
			selected.add(monster);
		}
		
		return selected;
	}
}
