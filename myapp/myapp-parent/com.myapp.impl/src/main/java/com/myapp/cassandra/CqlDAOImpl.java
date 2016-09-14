package com.myapp.cassandra;

public class CqlDAOImpl<T> implements CqlDAO<Object, T>{
	
	private CqlDriverConfig cqlDriverConfig;
	
	public CqlDAOImpl (CqlDriverConfig cqlDriverConfig){
		this.cqlDriverConfig = cqlDriverConfig;
		
	}

	public T persist(T entity) {
		//return cqlDriverConfig.getPersistenceManager().insert(entity);
		return null;
	}

	public Boolean update(T entity) {
		cqlDriverConfig.getPersistenceManager().update(entity);
		return Boolean.TRUE;
	}

	public T find(Class<T> type, Object key) {		
		return cqlDriverConfig.getPersistenceManager().find(type, key);
	}

	public T findReference(Class<T> type, Object key) {
		return cqlDriverConfig.getPersistenceManager().forUpdate(type, key);
	}

}
