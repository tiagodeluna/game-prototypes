package com.dragonhunters.model.card.action;

import com.dragonhunters.model.Character;

@FunctionalInterface
public interface CardEffect {

	public void activate(Character character);
}
