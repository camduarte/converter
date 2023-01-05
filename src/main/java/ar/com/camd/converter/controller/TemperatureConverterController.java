/**
 * TemperatureConverterController.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.controller;

import ar.com.camd.converter.Launcher;
import ar.com.camd.converter.model.Temperature;
import ar.com.camd.converter.model.TemperatureUnit;
import ar.com.camd.converter.service.TemperatureService;
import ar.com.camd.converter.service.TemperatureServiceImpl;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * <code>TemperatureConverterController</code> Controls actions from temperature
 * converter.
 * 
 * @author Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version 1.0.0-SNAPSHOT
 */
public class TemperatureConverterController {

	// fx:id="fromUnit"
	public ComboBox<String> fromUnit;

	// fx:id="toUnit"
	public ComboBox<String> toUnit;

	// fx:id="value"
	public TextField value;

	// fx:id="result"
	public TextField result;

	@FXML
	public void convert(Event event) {
		TemperatureService temperatureService = new TemperatureServiceImpl();
		Temperature temperature = temperatureService.convert(
				TemperatureUnit.valueOf(fromUnit.getValue().toString()),
				TemperatureUnit.valueOf(toUnit.getValue().toString()), 
				Double.valueOf(result.getViewOrder()));
		result.setText(temperature.getValue().toString());
	}

	@FXML
	public void backToMenu(Event event) {
		Launcher.getStage().setTitle("camd | Conversor - menú");
		Launcher.setRoot("converter-menu");
	}

}
