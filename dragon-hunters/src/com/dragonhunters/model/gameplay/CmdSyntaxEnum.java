package com.dragonhunters.model.gameplay;

public enum CmdSyntaxEnum {
	
	NO_ARGS("%s"),
	SINGLE_ARG("%s %s"),
	MULTIPLE_ARGS("%s [%s]"),
	SUB_CMD("%s %s");
	
	private String syntax;

	private CmdSyntaxEnum(String syntax) {
		this.syntax = syntax;
	}

	public String getSyntax() {
		return syntax;
	}

	
}
