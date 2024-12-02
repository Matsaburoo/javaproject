package database;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import application.User;

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
	
	public void InsertData(User u,int id,String username,String name,String pass) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/BaseUsers?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Basededonne123";
		String insertQuery="INSERT INTO Users(ID,username,user_name,user_password) VALUES(?,?,?,?)"; 
		
		try(Connection conn= DriverManager.getConnection(url, user, password)){
			PreparedStatement statement= connection.prepareStatement(insertQuery);
			
			statement.setString(1, String.valueOf(u.getID()));
			statement.setString(2, username);
			statement.setString(3, name);
			statement.setString(4, pass);
			
			int rowInserted= statement.executeUpdate();
			if(rowInserted >0) {
				System.out.println("added succefully");
			}else {
				System.out.println("failed to insert the current data");
			}


		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	
	//changing data for example password or a username etc..
	public void updateUser(String pass,int id) {
		String query="UPDATE  Users SET user_password=? WHERE ID=? ";
		try(PreparedStatement statement= connection.prepareStatement(query)){
			statement.setInt(2,id);
			statement.setString(1,pass);
			int rowModified=statement.executeUpdate();
			if(rowModified>0) {
				System.out.println("modified for the user with succeful");
			}else {
				System.out.println("Modification failed");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
