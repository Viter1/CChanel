package application;
	

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * 
 * @author viter1
 * @see ControladorVentana
 *
 */


public class Main extends Application {
	/**
	 * Iniciamos nuestra venanta proncipal 
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("vistaVentana.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root , 600 , 400);
			primaryStage.setScene(scene);
			primaryStage.show();
			Font.loadFont(getClass().getResourceAsStream("Ubuntu-Bold.ttf"), 20);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
