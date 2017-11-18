package com.dragonhunters.model.gameplay;

import java.util.List;

import com.dragonhunters.model.card.monster.MonsterCard;

public class GameSetup {

	public static final int NUMBER_OF_ANIMALS = 2;
	public static final int NUMBER_OF_BEASTS = 2;
	public static final int NUMBER_OF_MYTHICAL_MONSTERS = 1;
	
	private List<MonsterCard> animals;
	private List<MonsterCard> beasts;
	private MonsterCard dragon;
	
	public GameSetup() {
		super();
	}

	public List<MonsterCard> getAnimals() {
		return animals;
	}

	public void setAnimals(List<MonsterCard> animals) {
		this.animals = animals;
	}

	public List<MonsterCard> getBeasts() {
		return beasts;
	}

	public void setBeasts(List<MonsterCard> beasts) {
		this.beasts = beasts;
	}

	public MonsterCard getDragon() {
		return dragon;
	}

	public void setDragon(MonsterCard dragon) {
		this.dragon = dragon;
	}
}
