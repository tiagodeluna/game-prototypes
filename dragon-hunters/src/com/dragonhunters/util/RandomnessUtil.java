package com.dragonhunters.util;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.dragonhunters.model.card.Card;

public class RandomnessUtil {

	private RandomnessUtil() {
		super();
	}
	
	public static int rollDice() {
		int dice = ThreadLocalRandom.current().nextInt(1, 7);
		
		switch(dice) {
		case 1:
			return 0;
		case 2:
		case 3:
			return 1;
		case 4:
		case 5:
			return 2;
		case 6:
			return 3;
		default:
			return -1;
		}
		
	}
	
	@SuppressWarnings("rawtypes")
	public static Card drawCard(List cards) {
		int index = ThreadLocalRandom.current().nextInt(0, cards.size());
		return (Card) cards.remove(index);
	}
	
}
