package com.dragonhunters.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragonhunters.infrastructure.PlayerActionRepository;
import com.dragonhunters.model.gameplay.GameSetup;

@Service
public class PlayerActionSelectorService implements SelectorService<GameSetup> {

	private PlayerActionRepository playerActionRepository;
	
	@Autowired	
	public PlayerActionSelectorService(PlayerActionRepository playerActionRepository) {
		this.playerActionRepository = playerActionRepository;
	}

	@Override
	public void select(GameSetup game) {
		game.setPlayerActions(
				this.playerActionRepository.findBySelector(false));
		game.getPlayerCharacter().setActions(
				this.playerActionRepository.findBySelector(true));
	}
}
