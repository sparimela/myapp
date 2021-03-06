package com.myapp.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class ClusterBuilder {

	private Cluster cluster;
	private Session session;

	public ClusterBuilder() {
		init();
	}

	private void init() {

		cluster = Cluster.builder().addContactPoint("127.0.0.1")
				.withClusterName("MY_APP")
				.withPort(9042)
				.build();

		session = cluster.newSession();
	}

	protected void close() {
		cluster.close();
	}

	public Cluster getCluster() {
		return cluster;
	}

	public void setCluster(Cluster cluster) {
		this.cluster = cluster;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

}
