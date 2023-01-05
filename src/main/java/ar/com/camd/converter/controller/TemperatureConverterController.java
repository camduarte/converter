/**
 * TemperatureConverterController.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.controller;

import ar.com.camd.converter.Launcher;
import javafx.event.Event;
import javafx.fxml.FXML;

/**
 * <code>TemperatureConverterController</code>
 * Controls actions from temperature converter.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public class TemperatureConverterController {
	
	@FXML
	public void convert(Event event) {
		//TODO: Implement.
	}

	@FXML
	public void backToMenu(Event event) {
		Launcher.getStage().setTitle("camd | Conversor - menú");
		Launcher.setRoot("converter-menu");
	}

}
