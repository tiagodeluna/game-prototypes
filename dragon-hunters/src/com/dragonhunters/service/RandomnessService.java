package com.dragonhunters.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.stereotype.Service;

import com.dragonhunters.model.card.Card;

@Service
public class RandomnessService {

	private RandomnessService() {
		super();
	}
	
	public int rollDice() {
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
	
	public Card selectCard(List cards) {
		int index = ThreadLocalRandom.current().nextInt(0, cards.size());
		return (Card) cards.remove(index);
	}
	
	public void xys(Object o) {
		
	}
}
