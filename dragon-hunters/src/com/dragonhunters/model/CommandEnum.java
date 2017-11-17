package com.dragonhunters.model;

public enum CommandEnum {
	PLAY_CARD(1, "play %s"),
	SHUFFLE(2, "shuffle");
	
	private int id;
	private String command;
	
	private CommandEnum(int id, String command) {
		this.id = id;
		this.command = command;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}
	
	
}
