package com.dragonhunters.service;

@FunctionalInterface
public interface SelectorService<T> {

	public void select(T gameElement);
}
