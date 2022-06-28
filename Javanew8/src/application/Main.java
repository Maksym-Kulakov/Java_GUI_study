package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Main extends Application {
	private Stage stage;
	private Scene scene;
	private FlowPane pane;
	private Label label;
	
	
	
	@Override
	public void start(Stage primaryStage) {
		 this.stage = primaryStage;
		 pane = new FlowPane();
		 label = new Label("HW");
		 pane.getChildren().add(label);
		 scene = new Scene(pane, 640, 480);
		 stage.setScene(scene);
		 stage.show();
		 
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
