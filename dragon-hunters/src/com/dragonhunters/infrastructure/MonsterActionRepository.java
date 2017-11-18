package com.dragonhunters.infrastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.dragonhunters.model.card.action.ActionTypeEnum;
import com.dragonhunters.model.card.monster.MonsterActionCard;
import com.dragonhunters.model.card.monster.MonsterTypeEnum;

@Component
public class MonsterActionRepository implements Repository<MonsterActionCard, ActionTypeEnum> {

	private List<MonsterActionCard> elements;
	
	public MonsterActionRepository() {
		this.elements = new ArrayList<>();
		this.elements.add(new MonsterActionCard(1, "Blow", MonsterTypeEnum.GENERAL, new ActionTypeEnum[]{ActionTypeEnum.CONTUSIVE}, 0));
		this.elements.add(new MonsterActionCard(2, "Block", MonsterTypeEnum.GENERAL, new ActionTypeEnum[]{ActionTypeEnum.BLOCKING}, 0));
		this.elements.add(new MonsterActionCard(3, "Hustle", MonsterTypeEnum.GENERAL, new ActionTypeEnum[]{ActionTypeEnum.CONTUSIVE}, 1));
		this.elements.add(new MonsterActionCard(4, "Crushing Attack", MonsterTypeEnum.GENERAL, new ActionTypeEnum[]{ActionTypeEnum.CONTUSIVE}, 2));
		this.elements.add(new MonsterActionCard(5, "Fierce Blow", MonsterTypeEnum.GENERAL, new ActionTypeEnum[]{ActionTypeEnum.GENERIC}, 1));
		
		this.elements.add(new MonsterActionCard(6, "Bite", MonsterTypeEnum.BEAST, new ActionTypeEnum[]{ActionTypeEnum.PIERCING}, 1));
		this.elements.add(new MonsterActionCard(7, "Claws", MonsterTypeEnum.BEAST, new ActionTypeEnum[]{ActionTypeEnum.PIERCING, ActionTypeEnum.CUTTING}, 1));
		this.elements.add(new MonsterActionCard(8, "Predator Rush", MonsterTypeEnum.BEAST, new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT, ActionTypeEnum.CUTTING}, 2));
		this.elements.add(new MonsterActionCard(9, "Jump", MonsterTypeEnum.BEAST, new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT, ActionTypeEnum.DODGE}, 1));

		this.elements.add(new MonsterActionCard(10, "Sting", MonsterTypeEnum.INSECT, new ActionTypeEnum[]{ActionTypeEnum.PIERCING}, 1));
		this.elements.add(new MonsterActionCard(11, "Defensive Shell", MonsterTypeEnum.INSECT, new ActionTypeEnum[]{ActionTypeEnum.BLOCKING}, 2));
		this.elements.add(new MonsterActionCard(12, "Paralyzing Fluid", MonsterTypeEnum.INSECT, new ActionTypeEnum[]{ActionTypeEnum.RANGE, ActionTypeEnum.PARALYZING}, 1));
		this.elements.add(new MonsterActionCard(13, "Venomous Sting", MonsterTypeEnum.INSECT, new ActionTypeEnum[]{ActionTypeEnum.PIERCING, ActionTypeEnum.POISONOUS}, 1));

		this.elements.add(new MonsterActionCard(14, "Tail Whip", MonsterTypeEnum.LIZARD, new ActionTypeEnum[]{ActionTypeEnum.CONTUSIVE}, 1));
		this.elements.add(new MonsterActionCard(15, "Thorns", MonsterTypeEnum.LIZARD, new ActionTypeEnum[]{ActionTypeEnum.PIERCING}, 1));
		this.elements.add(new MonsterActionCard(16, "Constriction", MonsterTypeEnum.LIZARD, new ActionTypeEnum[]{ActionTypeEnum.CONTUSIVE, ActionTypeEnum.PARALYZING}, 2));
		this.elements.add(new MonsterActionCard(17, "Elemental Breath", MonsterTypeEnum.LIZARD, new ActionTypeEnum[]{ActionTypeEnum.RANGE, ActionTypeEnum.ELEMENTAL}, 3));

		this.elements.add(new MonsterActionCard(18, "Take Flight", MonsterTypeEnum.FLYING, new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT, ActionTypeEnum.DODGE}, 2));
		this.elements.add(new MonsterActionCard(19, "Wind Storm", MonsterTypeEnum.FLYING, new ActionTypeEnum[]{ActionTypeEnum.PARALYZING}, 1));
		this.elements.add(new MonsterActionCard(20, "Throw Away", MonsterTypeEnum.FLYING, new ActionTypeEnum[]{ActionTypeEnum.CONTUSIVE}, 1));
		this.elements.add(new MonsterActionCard(21, "Lacerating Attack", MonsterTypeEnum.FLYING, new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT, ActionTypeEnum.CUTTING}, 2));

		this.elements.add(new MonsterActionCard(22, "Creepers attack", MonsterTypeEnum.PLANT, new ActionTypeEnum[]{ActionTypeEnum.RANGE, ActionTypeEnum.PARALYZING}, 1));
		this.elements.add(new MonsterActionCard(23, "Poisonous Thorns", MonsterTypeEnum.PLANT, new ActionTypeEnum[]{ActionTypeEnum.PIERCING, ActionTypeEnum.POISONOUS}, 2));
		this.elements.add(new MonsterActionCard(24, "Poisonous Gas", MonsterTypeEnum.PLANT, new ActionTypeEnum[]{ActionTypeEnum.RANGE, ActionTypeEnum.POISONOUS}, 3));
	}

	@Override
	public List<MonsterActionCard> findAll() {
		return this.elements;
	}

	@Override
	public MonsterActionCard findById(int id) {
		return this.elements.stream()
				.filter(m -> m.getId() == id)
				.findFirst()
				.orElse(null);
	}

	@Override
	public List<MonsterActionCard> findBySelector(ActionTypeEnum selector) {
		return this.elements.stream()
				.filter(a -> Arrays.binarySearch(a.getTypes(), selector) >= 0)
				.collect(Collectors.toList());
	}

}
