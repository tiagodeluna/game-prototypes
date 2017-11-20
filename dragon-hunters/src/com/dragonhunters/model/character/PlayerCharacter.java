package com.dragonhunters.model.character;

import java.util.ArrayList;
import java.util.List;

import com.dragonhunters.model.card.equipment.EquipmentCard;
import com.dragonhunters.model.resource.Resource;

/**
 * Represents a player character with its attributes, stats and items.
 * 
 * @author Tiago Luna
 */
public class PlayerCharacter {
	
	//Hunter's attributes
	private String name;
	private int attack;
	private int defense;
	private int bravery;
	private int hp;
	//Experience stats
	private int experience;
	private int level;
	//Limits
	private int bagLimit;
	private int braveryLimit;
	private int hpLimit;
	//Items
	private List<Resource> bag;
	private List<EquipmentCard> equipments;
	
	public PlayerCharacter() {
		super();
		this.attack = 0;
		this.defense = 0;
		this.experience = 0;
		this.level = 1;
		this.bag = new ArrayList<>();
		this.equipments = new ArrayList<>();
	}

	public PlayerCharacter(String name, int bagLimit, int braveryLimit, int hpLimit) {
		this();
		this.name = name;
		this.bagLimit = bagLimit;
		this.braveryLimit = braveryLimit;
		this.bravery = this.braveryLimit;
		this.hpLimit = hpLimit;
		this.hp = this.hpLimit;
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

	public int getBravery() {
		return bravery;
	}

	public void setBravery(int bravery) {
		this.bravery = bravery;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBagLimit() {
		return bagLimit;
	}

	public void setBagLimit(int bagLimit) {
		this.bagLimit = bagLimit;
	}

	public int getBraveryLimit() {
		return braveryLimit;
	}

	public void setBraveryLimit(int braveryLimit) {
		this.braveryLimit = braveryLimit;
	}

	public int getHpLimit() {
		return hpLimit;
	}

	public void setHpLimit(int hpLimit) {
		this.hpLimit = hpLimit;
	}

	public List<Resource> getBag() {
		return bag;
	}

	public void setBag(List<Resource> bag) {
		this.bag = bag;
	}

	public List<EquipmentCard> getEquipments() {
		return equipments;
	}

	public void setEquipments(List<EquipmentCard> equipments) {
		this.equipments = equipments;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("|| HUNTER ||%n"));
		sb.append(String.format("| %s, LVL %s%n", this.name, this.level));
		sb.append(String.format("| ATK %s DEF %s%n", this.attack, this.defense));
		sb.append(String.format("| H.P %s BRV %s%n", this.hp, this.bravery));
		return sb.toString();
	}
	
}
