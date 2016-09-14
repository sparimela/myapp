package com.myapp.cassandra.nosqldoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.myapp.cassandra.ClusterBuilder;
import com.myapp.cassandra.CqlDAO;
import com.myapp.cassandra.CqlDAOImpl;
import com.myapp.cassandra.CqlDriverConfig;
import com.myapp.model.DO.NameDO;

@Configuration
public class NameCassandraConfig {
	
	@Bean
	public ClusterBuilder clusterBuilder(){
		ClusterBuilder clusterBuilder = new ClusterBuilder();
		return clusterBuilder;
		
	}
	
	@Bean
	public CqlDAO<Object, NameDO> nameNoSqlDAO(){
		CqlDriverConfig cqlDriverConfig = new CqlDriverConfig(clusterBuilder());
		CqlDAO<Object, NameDO> nameNoSqlDOCqlDAO = new CqlDAOImpl<NameDO>(cqlDriverConfig);		
		return nameNoSqlDOCqlDAO;
		
	}

}
