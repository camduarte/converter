/**
 * ExchangeHouseService.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.service;

import java.math.BigDecimal;

import ar.com.camd.converter.model.CurrencyCode;
import ar.com.camd.converter.model.ExchangeHouse;

/**
 * <code>ExchangeHouseService</code>
 * Insert class description here.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public interface ExchangeHouseService {
	
	/**
	 * Makes the exchange.
	 *  
	 * @param amount The amount to convert.
	 * @param fromCurrency The currency you would like to get the exchange for.  
	 * @param toCurrency The destination currency for the exchange.
	 * @return The ExchangeHouse with the information.
	 */
	public ExchangeHouse exchange(BigDecimal amount, 
			CurrencyCode fromCurrency, CurrencyCode toCurrency);
}