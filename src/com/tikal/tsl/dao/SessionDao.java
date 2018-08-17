package com.tikal.tsl.dao;

import com.tikal.tsl.modelo.login.SessionEntity;

public interface SessionDao {

	public void save(SessionEntity s);

	public void delete(SessionEntity s);

	public void update(SessionEntity s);
	
	public SessionEntity consult(String id);
	
	public SessionEntity getByName(String nameUser);
}
