package com.myapp.cassandra;

public interface CqlDAO <Key, T>{
	
	public T persist(T entity);
	
	public Boolean update(T entity);
	
	public T find(Class<T> type, Object key);
	
	public T findReference(Class<T> type, Object key);

}
