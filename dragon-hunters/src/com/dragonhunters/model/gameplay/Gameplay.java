package com.dragonhunters.model.gameplay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
		this.monsterSelectorService.select(gameSetup);
		
		System.out.println(gameSetup.getAnimals());
		System.out.println(gameSetup.getBeasts());
		System.out.println(gameSetup.getDragon());
		System.out.println(gameSetup.getDragon().getMovements());
	}
	
	public void play() {
		
	}
}
