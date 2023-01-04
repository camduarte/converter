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

	private static Scene scene;

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("camd | Conversor - menú");
		scene = new Scene(loadFXML("converter-menu"), 535D, 265D);
		scene.getStylesheets().add(getClass().getResource("./view/css/style.css").toExternalForm());
		stage.setScene(scene);
		stage.show();		
	}

	/**
	 * Allows to switch the scene.
	 * @param fxml The fxml to be loaded.
	 * @throws IOException
	 */
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads the fxml.
     * @param fxml The fxml file name.
     * @return Component nodes.
     * @throws IOException
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("./view/fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

	/**
	 * Launches the application.
	 * @param args The data to be used in the application.
	 */
	public static void main(String[] args) {
		Launcher.launch();
	}
}