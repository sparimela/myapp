package com.myapp.repository;

import org.springframework.stereotype.Repository;
import javax.annotation.*;

import com.myapp.cassandra.CqlDAO;
import com.myapp.model.Name;
import com.myapp.model.DO.NameDO;

@Repository("nameRepository")
public class NameRepositoryImpl implements NameRepository{
	
	@Resource(name = "nameNoSqlDOCqlDAO")
	private CqlDAO<Object, NameDO> nameNoSqlDOCqlDAO;

	public void update(NameDO nameDO) {
		nameNoSqlDOCqlDAO.update(nameDO);
	}

}
