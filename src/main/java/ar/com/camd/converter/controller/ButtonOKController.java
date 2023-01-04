/**
 * ButtonOKController.java
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
 * <code>ButtonOKController</code>
 * Controls the button actions and read data from GUI components.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class ButtonOKController {
	
	//  fx:id="btnOK"
    public Button btnOK;

    //  fx:id="comboBoxConverter"
    public ComboBox<String> comboBoxConverter;
    
    @FXML
    public void buttonClicked(Event event) {
    	String converter = comboBoxConverter.getValue();
    	
    	try {
    		switch (converter) {
    		case "Moneda":
    			Launcher.getStage().setTitle("camd | conversor de moneda");;
    			Launcher.setRoot("converter-currency");
    			break;
    		case "Temperatura":
    			Launcher.setRoot("converter-temperature");
    			break;
    		default:
    			break;
    		}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
    }
}