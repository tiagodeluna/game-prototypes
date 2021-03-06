package com.dragonhunters.model.card.monster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dragonhunters.model.card.Card;
import com.dragonhunters.model.card.CardTypeEnum;

public class MonsterCard extends Card {

	private MonsterLevelEnum level;
	private int attack;
	private int defense;
	private Map<MonsterTypeEnum, Integer> setup;
	private List<MonsterActionCard> movements;
	
	public MonsterCard(long id, String name, MonsterLevelEnum level, int attack, int defense, Map<MonsterTypeEnum, Integer> setup) {
		super(id, name);
		this.movements = new ArrayList<>();
		this.level = level;
		this.attack = attack;
		this.defense = defense;
		this.setup = setup;
	}

	public MonsterCard(long id, String name, MonsterLevelEnum level, int attack, int defense) {
		super(id, name);
		this.setup = new HashMap<>();
		this.movements = new ArrayList<>();
		this.level = level;
		this.attack = attack;
		this.defense = defense;
	}

	@Override
	public CardTypeEnum getType() {
		return CardTypeEnum.MONSTER;
	}

	public MonsterLevelEnum getLevel() {
		return level;
	}

	public void setLevel(MonsterLevelEnum level) {
		this.level = level;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public Map<MonsterTypeEnum, Integer> getSetup() {
		return setup;
	}

	public void setSetup(Map<MonsterTypeEnum, Integer> setup) {
		this.setup = setup;
	}

	public List<MonsterActionCard> getMovements() {
		return movements;
	}

	public void setMovements(List<MonsterActionCard> movements) {
		this.movements = movements;
	}

}
