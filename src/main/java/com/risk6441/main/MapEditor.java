/**
 * 
 */
package com.risk6441.main;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Nirav
 *
 */
public class MapEditor implements EventHandler<ActionEvent> {

	/* (non-Javadoc)
	 * @see javafx.event.EventHandler#handle(javafx.event.Event)
	 */
	public void handle(ActionEvent event) {
		System.out.println("Called");
		Stage stage = new Stage();
		Pane mainPane = null;
		try {
			mainPane = (Pane) FXMLLoader.load(Main.class.getResource("/mapeditorsplash.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		stage.setScene(new Scene(mainPane));
		stage.show();
	}

}

