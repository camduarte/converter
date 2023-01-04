/**
 * ButtonConvertController.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.controller;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * <code>ButtonConvertController</code>
 * Controls the button actions and read data from GUI components.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class ButtonConvertController {

	// fx:id="fromCurrency"
	private ComboBox fromCurrency;

	// fx:id="toCurrency"
	private ComboBox toCurrency;

	// fx:id="amount"
	private TextField amount;

	// fx:id="conversion"
	private TextField conversion;

	@FXML
	public void convert(Event event) {
		System.out.println("CLICK");
	}
}