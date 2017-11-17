package com.dragonhunters.model.card.monster;

import java.util.List;

import com.dragonhunters.model.card.action.ActionCard;
import com.dragonhunters.model.card.action.ActionTypeEnum;
import com.dragonhunters.model.card.action.CardEffect;

public class MonsterActionCard extends ActionCard {

	private MonsterTypeEnum monsterType;
	
	public MonsterActionCard(long id, String name, MonsterTypeEnum monsterType, ActionTypeEnum[] actionTypes, int bonus,
			List<ActionTypeEnum> prerequisites, CardEffect effect) {
		super(id, name, actionTypes, bonus, prerequisites, effect);
		this.monsterType = monsterType;
	}

	public MonsterActionCard(long id, String name, MonsterTypeEnum monsterType, ActionTypeEnum[] actionTypes, int bonus) {
		super(id, name, actionTypes, bonus);
		this.monsterType = monsterType;
	}

	public MonsterTypeEnum getMonsterType() {
		return monsterType;
	}

	public void setMonsterType(MonsterTypeEnum monsterType) {
		this.monsterType = monsterType;
	}

}
