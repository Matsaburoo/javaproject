package application;

	
import java.io.IOException;
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
		launch(args);
	}
}
