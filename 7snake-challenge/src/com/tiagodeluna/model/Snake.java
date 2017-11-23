package com.tiagodeluna.model;

import java.util.ArrayList;
import java.util.List;

public class Snake {

	private List<SnakeCell> cells;

	public Snake() {
		super();
		this.cells = new ArrayList<>();
	}

	public List<SnakeCell> getCells() {
		return cells;
	}

	public void setCells(List<SnakeCell> cells) {
		this.cells = cells;
	}
	
	public int getValue() {
		return this.cells
				.stream()
				.mapToInt(c -> c.getValue())
				.sum();
	}
	
	public boolean isIntersectedWith(Snake other) {
		return this.cells.parallelStream().anyMatch(c -> other.getCells().contains(c));
	}
}
