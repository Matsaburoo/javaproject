package database;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class DBconnection {

	private  Connection connection;
	//private  Statement statement= connection.createStatement();
	public  void DBconnect () {
		String url = "jdbc:mysql://localhost:3306/BaseUsers?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Basededonne123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
				connection = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
	}
		
        
		
	
	public Connection getConnection() {
		return this.connection;
	}
	public void close() {
		try {
			this.connection.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	//Insert data
	
	public void CreateStatements() throws SQLException {
		 Statement statement= connection.createStatement();

	}

}
