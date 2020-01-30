package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	Parent root;
	Scene scene;
	@Override
	public void start(Stage primaryStage) {
		try {
	    root=FXMLLoader.load(getClass().getResource("/main.fxml"));
	    scene=new Scene(root);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("ericorchestra");
	    primaryStage.setResizable(false);
	    primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
