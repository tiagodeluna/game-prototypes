package com.dragonhunters.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonhunters.infrastructure.MonsterActionRepository;
import com.dragonhunters.model.card.monster.MonsterActionCard;
import com.dragonhunters.model.card.monster.MonsterCard;
import com.dragonhunters.model.card.monster.MonsterTypeEnum;
import com.dragonhunters.util.RandomnessUtil;

@Service
public class MonsterActionSelectorService implements SelectorService<MonsterCard> {

	private MonsterActionRepository monsterActionRepository;

	@Autowired
	public MonsterActionSelectorService(MonsterActionRepository actionRepository) {
		super();
		this.monsterActionRepository = actionRepository;
	}

	@Override
	public void select(MonsterCard monster) {
		Map<MonsterTypeEnum, Integer> setup = monster.getSetup();
		List<MonsterActionCard> selected = new ArrayList<>();
		
		for (MonsterTypeEnum type : setup.keySet()) {
			List<MonsterActionCard> available = this.monsterActionRepository.findBySelector(type);
			
			for(int i = 0; i < setup.get(type); i++) {
				selected.add((MonsterActionCard) RandomnessUtil.drawCard(available));
			}
		}
		
		monster.setMovements(selected);
	}

}
