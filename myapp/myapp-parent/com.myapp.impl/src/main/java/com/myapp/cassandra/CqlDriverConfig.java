package com.myapp.cassandra;

import info.archinnov.achilles.persistence.PersistenceManager;
import info.archinnov.achilles.persistence.PersistenceManagerFactory;

public class CqlDriverConfig {

	private PersistenceManager persistenceManager;
	private ClusterBuilder clusterBuilder;

	public CqlDriverConfig(ClusterBuilder clusterBuilder) {
		this.clusterBuilder = clusterBuilder;
		init(clusterBuilder);

	}

	private void init(ClusterBuilder clusterBuilder) {
		try {
			final PersistenceManagerFactory persistenceManagerFactory =

					PersistenceManagerFactory.PersistenceManagerFactoryBuilder.builder(clusterBuilder.getCluster())
							.withNativeSession(clusterBuilder.getSession())
							.withEntityPackages("com.myapp.model.DO")
							.withKeyspaceName("sri").build();

			persistenceManager = persistenceManagerFactory.createPersistenceManager();
			

		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	public PersistenceManager getPersistenceManager() {
		return persistenceManager;
	}

}
