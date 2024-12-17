package com.jsp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {

	public Connection connection;
	public PreparedStatement preparedStatement;

	private static DB db = new DB();

	private DB() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "root";
			String password = "Root@1234";
			String url = "jdbc:mysql://localhost/eStore";
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Exception occurred: " + e);
		}

	}
	
	public static DB getDB() {
		return db;
	}
	
	public void closeConnection() {
		try {
			connection.close();
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
	}
	
	// it will work for insert, update, and delete operations
	public int executeUpdate(PreparedStatement statement) {
		int result = 0;
		try {
			result = statement.executeUpdate();
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		return result;
	}
	
	// it will work for get operations
	public ResultSet executeQuery(PreparedStatement statement) {
		ResultSet result = null;
		try {
			result = statement.executeQuery();
		}
		catch(Exception e) {
			System.out.println("Exception occurred: " + e);
		}
		return result;
	}

}
