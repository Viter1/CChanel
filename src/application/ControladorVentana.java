package application;

import java.awt.Button;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Tooltip;
/**
 * 
 * @author divit
 *
 */
public class ControladorVentana {
	
	/**
	 * Cerrar nuestra ventana 
	 */
	@FXML
	private void handleClose() {
		
		System.exit(0);
	}
	
	/**
	 * metodo para abrir otra ventana desde nuestra ventana principal
	 */
	@FXML
	private void abrirOtraVentana() {
		try {
			Stage primaryStage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("vistOtraVentana.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			Scene scene = new Scene(root, 600, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
