package com.dragonhunters.model.gameplay;

import java.util.List;

import com.dragonhunters.model.card.action.ActionCard;
import com.dragonhunters.model.card.equipment.EquipmentCard;
import com.dragonhunters.model.card.monster.MonsterCard;
import com.dragonhunters.model.character.PlayerCharacter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameSetup {

	public static final int NUMBER_OF_ANIMALS = 2;
	public static final int NUMBER_OF_BEASTS = 2;
	public static final int NUMBER_OF_MYTHICAL_MONSTERS = 1;
	
	private PlayerCharacter playerCharacter;
	private List<ActionCard> playerActions;
	private List<EquipmentCard> equipments;
	private List<MonsterCard> animals;
	private List<MonsterCard> beasts;
	private MonsterCard dragon;
	
}
