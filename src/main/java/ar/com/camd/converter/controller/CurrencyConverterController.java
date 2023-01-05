/**
 * CurrencyConverterController.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.controller;

import java.math.BigDecimal;

import ar.com.camd.converter.Launcher;
import ar.com.camd.converter.model.CurrencyCode;
import ar.com.camd.converter.model.ExchangeHouse;
import ar.com.camd.converter.service.ExchangeHouseService;
import ar.com.camd.converter.service.ExchangeHouseServiceImpl;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * <code>CurrencyConverterController</code>
 * Controls actions from currency converter.
 * 
 * @author Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version 1.0.0-SNAPSHOT
 */
public class CurrencyConverterController {

	// fx:id="fromCurrency"
	public ComboBox fromCurrency;

	// fx:id="toCurrency"
	public ComboBox toCurrency;

	// fx:id="amount"
	public TextField amount;

	// fx:id="conversion"
	public TextField conversion;

	@FXML
	public void convert(Event event) {
		ExchangeHouseService exchangeService = new ExchangeHouseServiceImpl();
		ExchangeHouse exchangeHouse = exchangeService.exchange(new BigDecimal(amount.getText()),
				CurrencyCode.valueOf(fromCurrency.getValue().toString()),
				CurrencyCode.valueOf(toCurrency.getValue().toString()));
		
		conversion.setText(exchangeHouse.getExchangeAmount().toString());
	}

	@FXML
	public void backToMenu(Event event) {
		Launcher.setRoot("converter-menu");
	}
}