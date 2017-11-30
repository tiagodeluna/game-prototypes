package com.dragonhunters.infrastructure;

import java.util.ArrayList;
import java.util.List;

import com.dragonhunters.model.card.action.ActionCard;
import com.dragonhunters.model.card.action.ActionTypeEnum;

public class PlayerActionRepository implements Repository<ActionCard, ActionTypeEnum> {

	private List<ActionCard> elements;
	
	public PlayerActionRepository() {
		super();
		this.elements = new ArrayList<>();
		this.elements.add(new ActionCard(1, "Blow", new ActionTypeEnum[]{ActionTypeEnum.GENERIC_ATK}, 0, true));
		this.elements.add(new ActionCard(2, "Dodge", new ActionTypeEnum[]{ActionTypeEnum.DEFENSE}, 0, true));
		this.elements.add(new ActionCard(3, "Sneak Attack", new ActionTypeEnum[]{ActionTypeEnum.GENERIC_ATK, ActionTypeEnum.MOVEMENT}, 1, true));
		this.elements.add(new ActionCard(4, "Block", new ActionTypeEnum[]{ActionTypeEnum.DEFENSE}, 0, true));
		this.elements.add(new ActionCard(5, "Flip-flap", new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT}, 0, true));
		this.elements.add(new ActionCard(6, "Fierce Blow", new ActionTypeEnum[]{ActionTypeEnum.GENERIC_ATK}, 1, true));
		this.elements.add(new ActionCard(7, "Deflect", new ActionTypeEnum[]{ActionTypeEnum.DEFENSE}, 1, true));
		this.elements.add(new ActionCard(8, "Run!", new ActionTypeEnum[]{ActionTypeEnum.MOVEMENT}, 1, true));
		this.elements.add(new ActionCard(9, "Stunt", new ActionTypeEnum[]{ActionTypeEnum.DEFENSE}, 2, false));
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

	@Override
	public List<ActionCard> findBySelector(ActionTypeEnum selector) {
		// TODO Auto-generated method stub
		return null;
	}

}
