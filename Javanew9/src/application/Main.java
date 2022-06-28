package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private AnchorPane pane;
	 
	
	
	
	@Override
	public void start(Stage primaryStage) {
		 this.stage = primaryStage;
		 try {
			pane = (AnchorPane)FXMLLoader.load(Main.class.getResource("HW.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	 
		 scene = new Scene(pane, 350, 350);
		 stage.setScene(scene);
		 stage.show();
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
