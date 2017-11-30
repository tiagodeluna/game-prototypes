package com.dragonhunters.model.card.action;

import com.dragonhunters.model.card.Card;
import com.dragonhunters.model.card.CardTypeEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActionCard extends Card {

	private int bonus;
	private int actionPoints;
	private ActionTypeEnum[] types;
	private CardEffect effect;
	private boolean initialAction;
	
	public ActionCard(long id, String name, ActionTypeEnum[] types, int bonus, boolean initialAction) {
		super(id, name);
		this.types = types;
		this.bonus = bonus;
		this.initialAction = initialAction;
		this.effect = null;
	}

	public ActionCard(long id, String name, ActionTypeEnum[] types, int bonus, CardEffect effect) {
		super(id, name);
		this.types = types;
		this.bonus = bonus;
		this.effect = effect;
	}

	@Override
	public CardTypeEnum getType() {
		return CardTypeEnum.ACTION;
	}

}
