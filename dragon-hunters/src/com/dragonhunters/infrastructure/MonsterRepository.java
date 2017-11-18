package com.dragonhunters.infrastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.dragonhunters.model.card.monster.MonsterCard;
import com.dragonhunters.model.card.monster.MonsterLevelEnum;
import com.dragonhunters.model.card.monster.MonsterTypeEnum;

@Component
public class MonsterRepository implements Repository<MonsterCard, MonsterLevelEnum> {

	private List<MonsterCard> elements;

	public MonsterRepository() {
		this.elements = new ArrayList<>();
		Map<MonsterTypeEnum, Integer> animalMoves = new HashMap<>();
		animalMoves.put(MonsterTypeEnum.GENERAL, 4);
		animalMoves.put(MonsterTypeEnum.BEAST, 2);
		this.elements.add(new MonsterCard(1, "Tauron", MonsterLevelEnum.ANIMAL, 1, 1, animalMoves));
		this.elements.add(new MonsterCard(2, "Leonix", MonsterLevelEnum.ANIMAL, 2, 0, animalMoves));
		Map<MonsterTypeEnum, Integer> insectAnimalMoves = new HashMap<>();
		insectAnimalMoves.put(MonsterTypeEnum.GENERAL, 3);
		insectAnimalMoves.put(MonsterTypeEnum.INSECT, 3);
		this.elements.add(new MonsterCard(3, "Larakna", MonsterLevelEnum.ANIMAL, 1, 0, insectAnimalMoves));

		Map<MonsterTypeEnum, Integer> beastMoves = new HashMap<>();
		beastMoves.put(MonsterTypeEnum.GENERAL, 2);
		beastMoves.put(MonsterTypeEnum.BEAST, 2);
		beastMoves.put(MonsterTypeEnum.FLYING, 2);
		beastMoves.put(MonsterTypeEnum.LIZARD, 2);
		this.elements.add(new MonsterCard(4, "Pterodark", MonsterLevelEnum.BESTIAL, 2, 1, beastMoves));
		Map<MonsterTypeEnum, Integer> plantBeastMoves = new HashMap<>();
		plantBeastMoves.put(MonsterTypeEnum.GENERAL, 2);
		plantBeastMoves.put(MonsterTypeEnum.INSECT, 2);
		plantBeastMoves.put(MonsterTypeEnum.PLANT, 2);
		this.elements.add(new MonsterCard(4, "Devioak", MonsterLevelEnum.BESTIAL, 0, 3, plantBeastMoves));
		Map<MonsterTypeEnum, Integer> lizardBeastMoves = new HashMap<>();
		lizardBeastMoves.put(MonsterTypeEnum.GENERAL, 3);
		lizardBeastMoves.put(MonsterTypeEnum.LIZARD, 3);
		this.elements.add(new MonsterCard(4, "Troglodite", MonsterLevelEnum.BESTIAL, 2, 2, lizardBeastMoves));


		Map<MonsterTypeEnum, Integer> dragonMoves = new HashMap<>();
		dragonMoves.put(MonsterTypeEnum.GENERAL, 2);
		dragonMoves.put(MonsterTypeEnum.FLYING, 2);
		dragonMoves.put(MonsterTypeEnum.LIZARD, 4);
		this.elements.add(new MonsterCard(6, "Blood Dragon", MonsterLevelEnum.MYTHICAL, 3, 2, dragonMoves));
	}
	
	@Override
	public List<MonsterCard> findAll() {
		return this.elements;
	}

	@Override
	public MonsterCard findById(int id) {
		return this.elements.stream()
				.filter(m -> m.getId() == id)
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<MonsterCard> findBySelector(MonsterLevelEnum selector) {
		return this.elements.stream()
				.filter(m -> m.getLevel().equals(selector))
				.collect(Collectors.toList());
	}

}
