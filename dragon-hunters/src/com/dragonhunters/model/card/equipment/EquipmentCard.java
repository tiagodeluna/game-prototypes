package com.dragonhunters.model.card.equipment;

import com.dragonhunters.model.card.Card;
import com.dragonhunters.model.card.CardTypeEnum;
import com.dragonhunters.model.card.action.ActionTypeEnum;

public class EquipmentCard extends Card {

	private int bonus;
	private EquipmentTypeEnum type;
	private ActionTypeEnum linkedAction;
	private Object cost;
	
	public EquipmentCard(long id, String name) {
		super(id, name);
	}

	@Override
	public CardTypeEnum getType() {
		return CardTypeEnum.EQUIPMENT;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setType(EquipmentTypeEnum type) {
		this.type = type;
	}

	public ActionTypeEnum getLinkedAction() {
		return linkedAction;
	}

	public void setLinkedAction(ActionTypeEnum linkedAction) {
		this.linkedAction = linkedAction;
	}
	
}
