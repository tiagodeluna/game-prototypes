package com.dragonhunters.model.gameplay;

public enum CommandEnum {
	PLAY_CARD("play", CmdSyntaxEnum.MULTIPLE_ARGS),
	SHUFFLE("shuffle", CmdSyntaxEnum.NO_ARGS),
	GO_TO("goto", CmdSyntaxEnum.SUB_CMD),
	BUY("buy", CmdSyntaxEnum.MULTIPLE_ARGS),
	LEARN("learn", CmdSyntaxEnum.MULTIPLE_ARGS),
	SELL("sell", CmdSyntaxEnum.SINGLE_ARG),
	SHOW_STATUS("status", CmdSyntaxEnum.NO_ARGS),
	EXIT_GAME("exit", CmdSyntaxEnum.NO_ARGS);
	
	private String keyword;
	private CmdSyntaxEnum syntax;
	
	private CommandEnum(String keyword, CmdSyntaxEnum syntax) {
		this.keyword = keyword;
		this.syntax = syntax;
	}

	public String getKeyword() {
		return keyword;
	}
}
