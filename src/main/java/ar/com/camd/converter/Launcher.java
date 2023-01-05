/**
 * Launcher.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <code>Launcher</code>
 * Main class for run application.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class Launcher extends Application {

	private static Stage stage;
	private static Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		Launcher.stage = stage; // To be accessed from another class and change the title.
		stage.setTitle("camd | Conversor - menú");
		scene = new Scene(loadFXML("converter-menu"), 535D, 265D);
		scene.getStylesheets().add(getClass().getResource("./view/css/style.css").toExternalForm());
		stage.setScene(scene);
		stage.show();	
	}

	/**
	 * Allows to switch the scene.
	 * @param fxml The fxml to be loaded.
	 */
    public static void setRoot(String fxml) {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads the fxml.
     * @param fxml The fxml file name.
     * @return Component nodes.
     */
    private static Parent loadFXML(String fxml) {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("./view/fxml/" + fxml + ".fxml"));
        Parent parent = null;
		try {
			parent = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return parent;
    }

	/**
	 * Launches the application.
	 * @param args The data to be used in the application.
	 */
	public static void main(String[] args) {
		Launcher.launch();
	}

	/**
	 * @return the stage
	 */
	public static Stage getStage() {
		return stage;
	}
}