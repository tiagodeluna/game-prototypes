package com.dragonhunters.model.card;

public abstract class Card {

	private long id;
	private String name;
	
	public Card(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract CardTypeEnum getType(); 
}
