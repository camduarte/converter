/**
 * ConverterMenuController.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.controller;

import ar.com.camd.converter.Launcher;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * <code>ConverterMenuController</code>
 * Controls actions from the menu.
 * 
 * @author Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version 1.0.0-SNAPSHOT
 */
public class ConverterMenuController {

	// fx:id="btnOK"
	public Button btnOK;

	// fx:id="comboBoxConverter"
	public ComboBox<String> comboBoxConverter;

	@FXML
	public void buttonClicked(Event event) {
		String converter = comboBoxConverter.getValue();
		switch (converter) {
		case "Moneda":
			Launcher.getStage().setTitle("camd | conversor de moneda");
			;
			Launcher.setRoot("converter-currency");
			break;
		case "Temperatura":
			Launcher.setRoot("converter-temperature");
			break;
		default:
			break;
		}
	}
}