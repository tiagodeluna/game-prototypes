package com.dragonhunters.service;

public class DiceRollerService {

	private DiceRollerService() {
		super();
	}
	
	public static int rollDice() {
		double dice = Math.random() * 6;
//		int dice = result.round(new MathContext(0, RoundingMode.CEILING)).intValue();
		
		if (dice <= 2) {
			return 1;
		}
		else if (dice > 2 && dice <= 5) {
			return 2;
		}
		else {
			return 3;
		}
	}
}
