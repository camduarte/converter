/**
 * ButtonOKController.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.controller;

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
    public void buttonClicked(Event e) {
    }
}
