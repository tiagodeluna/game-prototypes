package com.dragonhunters.model.card.action;

import com.dragonhunters.model.character.PlayerCharacter;

@FunctionalInterface
public interface CardEffect {

	public void activate(PlayerCharacter character);
}
