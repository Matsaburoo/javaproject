package application;

	
import java.io.IOException;
import java.sql.SQLException;

import database.DBconnection;

import database.DBconnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		//Parent x =FXMLLoader.load(getClass().getClassLoader().getResource("Login.fxml"));
		
		
		
		//GUI
		Group root= new Group();
		Scene scene= new Scene(root,Color.GREEN);
		Image icon=new Image("Chameleon.png");
		stage.getIcons().add(icon);
		stage.setTitle("Afissan");
		stage.setScene(scene);
		stage.show();
		
		
		
	}
	
	public static void main(String[] args) {
		
		//connecting the database

		
		DBconnection DataBase=new DBconnection();
		DataBase.DBconnect();
		User u= new User();
		u.setInfo("Da","Baby");
		u.setPassword("abcefghy");
		u.setID();
		
		try {
			DataBase.InsertData(u, u.getID(), u.getUsername(),u.getName(),u.getPassword());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		try {
			DataBase.updateUser("azerty",405602);
		}catch(Exception  e) {
			e.printStackTrace();
		}
		launch(args);
	}
}
