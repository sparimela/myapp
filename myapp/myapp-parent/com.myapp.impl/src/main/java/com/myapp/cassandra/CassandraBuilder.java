package com.myapp.cassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraBuilder {
	
	static Cluster cluster;
	static Session session;
	
//	public static void main(String[] args){
//		
//		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
//		session = cluster.connect("users");
//		
////		session.execute("CREATE KEYSPACE sri WITH REPLICATION = {"
////				+ "'class' : 'SimpleStrategy', 'replication_factor' : 1}");
//		
////		session.execute("CREATE TABLE sri.name (first text, last text, PRIMARY KEY(last));");
//		
//		session.execute("INSERT INTO sri.name (first, last) VALUES ('A','B');");
//		session.close();
//		cluster.close();
//		
//	}
	

}
