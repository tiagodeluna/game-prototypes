package com.dragonhunters.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonhunters.infrastructure.MonsterActionRepository;
import com.dragonhunters.infrastructure.MonsterRepository;
import com.dragonhunters.model.card.monster.MonsterCard;
import com.dragonhunters.model.card.monster.MonsterLevelEnum;
import com.dragonhunters.model.gameplay.GameSetup;

@Service
public class MonsterPreparationService {

	private MonsterRepository monsterRepository;
	private MonsterActionRepository actionRepository;
	private RandomnessService randomnessService;
	
	@Autowired
	public MonsterPreparationService(MonsterRepository monsterRepository,
			MonsterActionRepository monsterActionRepository, RandomnessService randomnessService) {
		super();
		this.monsterRepository = monsterRepository;
		this.actionRepository = monsterActionRepository;
		this.randomnessService = randomnessService;
	}
	
	public void selectMonsters(GameSetup setup) {
		//Get ANIMALS
		setup.setAnimals(this.drawMonstersByLevel(MonsterLevelEnum.ANIMAL, 2));
		
		//Get BEASTS
		setup.setBeasts(this.drawMonstersByLevel(MonsterLevelEnum.BESTIAL, 2));
		
		//Get DRAGON
		setup.setDragon(this.drawMonstersByLevel(MonsterLevelEnum.MYTHICAL, 1).get(0));
	}
	
	private List<MonsterCard> drawMonstersByLevel(MonsterLevelEnum level, int quantity) {
		List<MonsterCard> available = this.monsterRepository.findBySelector(level);
		List<MonsterCard> selected = new ArrayList<>();
		
		for(int i = 0; i < quantity; i++) {
			MonsterCard monster = (MonsterCard) this.randomnessService.selectCard(available);
			//TODO Select actions
			
			selected.add(monster);
		}
		
		return selected;
	}
}
