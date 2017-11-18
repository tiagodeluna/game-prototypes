package com.dragonhunters.infrastructure;

import java.util.List;

public interface Repository<T, S> {
	
	public List<T> findAll();
	public List<T> findBySelector(S selector);
	public T findById(int id);
}
