package com.tiagodeluna.model;

import java.util.Objects;

public class SnakeCell implements Comparable<SnakeCell> {

	private int x;
	private int y;
	private int value;
	private SnakeCell previous;

	public SnakeCell(int x, int y, int value, SnakeCell previous) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
		this.previous = previous;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public SnakeCell getPrevious() {
		return previous;
	}

	public void setPrevious(SnakeCell previous) {
		this.previous = previous;
	}

	@Override
	public boolean equals(Object o) {
	    // self check
	    if (this == o) {
	        return true;
	    }
	    // null check
	    if (o == null) {
	        return false;
	    }
	    // type check and cast
	    if (getClass() != o.getClass()) {
	        return false;
	    }
	    SnakeCell other = (SnakeCell) o;
	    // field comparison
	    return Objects.equals(x, other.x)
	            && Objects.equals(y, other.y)
	            && Objects.equals(value, other.value);
	}

	@Override
	public int compareTo(SnakeCell that) {
		final int smaller = -1;
	    final int equal = 0;
	    final int bigger = 1;

	    //this optimization is usually worthwhile, and can
	    //always be added
	    if (this == that) {
	    	return equal;
	    }

	    //primitive numbers follow this form
	    if (this.value < that.value) {
	    	return smaller;
	    }
	    if (this.value > that.value) {
	    	return bigger;
	    }
	    if (this.x < that.x || this.y > that.y) {
	    	return smaller;
	    }
	    if (this.x > that.x || this.y < that.y) {
	    	return bigger;
	    }
	    
	    return equal;
	}
	
}
