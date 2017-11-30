package com.dragonhunters.model.character;

import java.util.ArrayList;
import java.util.List;

import com.dragonhunters.model.card.equipment.EquipmentCard;
import com.dragonhunters.model.resource.Resource;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a player character with its attributes, stats and items.
 * 
 * @author Tiago Luna
 */
@Getter
@Setter
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("|| HUNTER ||%n"));
		sb.append(String.format("| %s, LVL %s%n", this.name, this.level));
		sb.append(String.format("| ATK %s DEF %s%n", this.attack, this.defense));
		sb.append(String.format("| HP  %s BRV %s%n", this.hp, this.bravery));
		return sb.toString();
	}
	
}
