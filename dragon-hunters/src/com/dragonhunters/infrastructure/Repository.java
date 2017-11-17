package com.dragonhunters.infrastructure;

import java.util.List;

public interface Repository<T> {
	
	public List<T> findAll();
	public T findById(int id);
}
