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
		//Select the monsters available to be hunted
		this.monsterSelectorService.select(gameSetup);
		
		//Instantiate player's character
		gameSetup.setPlayerCharacter(new PlayerCharacter("TARKUS", 5, 5, 3));
		System.out.println(gameSetup.getPlayerCharacter().toString());
	}
	
	public void play() {
		//TODO Display menu
		
	}
}
