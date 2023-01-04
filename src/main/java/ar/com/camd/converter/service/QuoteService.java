/**
 * QuoteService.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.service;

import ar.com.camd.converter.model.CurrencyCode;
import ar.com.camd.converter.model.Quoter;

/**
 * <code>QuoteService</code>
 * Makes the quote.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public interface QuoteService {

	/**
	 * Makes the quote.
	 * @param fromCurrency The currency code you would like to get the exchange rate for.
	 * @param toCurrency The destination currency code for the exchange rate.
	 * @return The Quoter with the information.
	 */
	public Quoter quote(CurrencyCode fromCurrency, CurrencyCode toCurrency);
	
}
