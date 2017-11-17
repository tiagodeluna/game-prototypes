package com.dragonhunters.infrastructure;

import java.util.ArrayList;
import java.util.List;

import com.dragonhunters.model.card.action.ActionCard;
import com.dragonhunters.model.card.action.ActionTypeEnum;

public class PlayerActionRepository implements Repository<ActionCard> {

	private List<ActionCard> elements;
	
	public PlayerActionRepository() {
		super();
		this.elements = new ArrayList<>();
		this.elements.add(new ActionCard(1, "Blow", new ActionTypeEnum[]{ActionTypeEnum.GENERIC}, 0));
		this.elements.add(new ActionCard(2, "Dodge", new ActionTypeEnum[]{ActionTypeEnum.DODGE}, 0));
		this.elements.add(new ActionCard(3, "Sneak Attack", new ActionTypeEnum[]{ActionTypeEnum.GENERIC, ActionTypeEnum.MOVEMENT}, 1));
		this.elements.add(new ActionCard(4, "Block", new ActionTypeEnum[]{ActionTypeEnum.BLOCKING}, 0));
		this.elements.add(new ActionCard(5, "Flip-flap", new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT}, 0));
		this.elements.add(new ActionCard(6, "Fierce Blow", new ActionTypeEnum[]{ActionTypeEnum.GENERIC}, 1));
		this.elements.add(new ActionCard(7, "Stunt", new ActionTypeEnum[]{ActionTypeEnum.DODGE}, 1));
		this.elements.add(new ActionCard(8, "Deflect", new ActionTypeEnum[]{ActionTypeEnum.BLOCKING}, 1));
		this.elements.add(new ActionCard(9, "Run!", new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT}, 1));
	}

	@Override
	public List<ActionCard> findAll() {
		return this.elements;
	}

	@Override
	public ActionCard findById(int id) {
		return this.elements.stream()
				.filter(a -> a.getId() == id)
				.findFirst()
				.orElse(null);
	}

}
