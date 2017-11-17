package com.dragonhunters.model.card.action;

import java.util.List;

import com.dragonhunters.model.card.Card;
import com.dragonhunters.model.card.CardTypeEnum;

public class ActionCard extends Card {

	private int bonus;
	private List<ActionTypeEnum> prerequisites;
	private ActionTypeEnum[] types;
	private CardEffect effect;
	
	public ActionCard(long id, String name, ActionTypeEnum[] types, int bonus) {
		super(id, name);
		this.types = types;
		this.bonus = bonus;
		this.prerequisites = null;
		this.effect = null;
	}

	public ActionCard(long id, String name, ActionTypeEnum[] types, int bonus, List<ActionTypeEnum> prerequisites, CardEffect effect) {
		super(id, name);
		this.types = types;
		this.bonus = bonus;
		this.prerequisites = prerequisites;
		this.effect = effect;
	}

	@Override
	public CardTypeEnum getType() {
		return CardTypeEnum.ACTION;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public CardEffect getEffect() {
		return effect;
	}

	public void setEffect(CardEffect effect) {
		this.effect = effect;
	}

	public List<ActionTypeEnum> getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(List<ActionTypeEnum> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public ActionTypeEnum[] getTypes() {
		return types;
	}

	public void setTypes(ActionTypeEnum[] types) {
		this.types = types;
	}

}
