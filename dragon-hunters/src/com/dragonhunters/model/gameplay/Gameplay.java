package com.dragonhunters.model.gameplay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dragonhunters.model.character.PlayerCharacter;
import com.dragonhunters.service.MonsterSelectorService;

@Component
public class Gameplay {

	private MonsterSelectorService monsterSelectorService;
	private GameSetup gameSetup;
	
	@Autowired
	public Gameplay(MonsterSelectorService monsterSelectorService) {
		this.gameSetup = new GameSetup();
		this.monsterSelectorService = monsterSelectorService;
	}
	
	public void start() {
		//Instantiate player's character
		gameSetup.setPlayerCharacter(new PlayerCharacter("GILLIAN", 5, 3, 3));
		System.out.println(gameSetup.getPlayerCharacter().toString());
		
		//TODO Get player's initial deck and equipment
		
		//Select the monsters available to be hunted
		this.monsterSelectorService.select(gameSetup);
		

	}
	
	public void play() {
		//TODO Display menu
		
	}
}
