package com.dragonhunters.model.card.equipment;

import java.util.List;

import com.dragonhunters.model.card.Card;
import com.dragonhunters.model.card.CardTypeEnum;
import com.dragonhunters.model.card.action.ActionTypeEnum;
import com.dragonhunters.model.resource.Resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EquipmentCard extends Card {

	private int bonus;
	private EquipmentTypeEnum type;
	private ActionTypeEnum linkedAction;
	private List<Resource> cost;
	private boolean initialEquipment;
	
	public EquipmentCard(long id, String name, int bonus, EquipmentTypeEnum type, ActionTypeEnum linkedAction,
			List<Resource> cost, boolean initialEquipment) {
		super(id, name);
		this.bonus = bonus;
		this.type = type;
		this.linkedAction = linkedAction;
		this.cost = cost;
		this.initialEquipment = initialEquipment;
	}

	@Override
	public CardTypeEnum getType() {
		return CardTypeEnum.EQUIPMENT;
	}

}
