package com.dragonhunters.model.card.action;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode()
public class Bonus {
	
	private int modifier;
	private ActionTypeEnum type;
}
