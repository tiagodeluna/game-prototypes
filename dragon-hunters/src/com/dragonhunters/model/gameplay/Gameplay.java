package com.dragonhunters.model.gameplay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dragonhunters.model.character.PlayerCharacter;
import com.dragonhunters.service.EquipmentSelectorService;
import com.dragonhunters.service.MonsterSelectorService;
import com.dragonhunters.service.PlayerActionSelectorService;

@Component
public class Gameplay {

	private PlayerActionSelectorService playerActionSelectorService;
	private MonsterSelectorService monsterSelectorService;
	private EquipmentSelectorService equipmentSelectorService;
	private GameSetup gameSetup;
	
	@Autowired
	public Gameplay(PlayerActionSelectorService playerActionSelectorService, EquipmentSelectorService equipmentSelectorService,
			MonsterSelectorService monsterSelectorService) {
		this.gameSetup = new GameSetup();
		this.playerActionSelectorService = playerActionSelectorService;
		this.equipmentSelectorService = equipmentSelectorService;
		this.monsterSelectorService = monsterSelectorService;
	}
	
	public void start() {
		//Instantiate player's character
		gameSetup.setPlayerCharacter(new PlayerCharacter("GILLIAN", 5, 3, 3));
		
		//Get player's initial deck and the available actions to gameSetup
		this.playerActionSelectorService.select(gameSetup);

		//Get player's initial equipment and the available equipments to gameSetup
		this.equipmentSelectorService.select(gameSetup);
		
		//Select the monsters available to be hunted
		this.monsterSelectorService.select(gameSetup);
		
		System.out.println(gameSetup.getAnimals().toString());
		System.out.println(gameSetup.getBeasts().toString());
		System.out.println(gameSetup.getDragon().toString());
		System.out.println(gameSetup.getPlayerCharacter().toString());

	}
	
	public void play() {
		//TODO Display menu
		
	}
}
