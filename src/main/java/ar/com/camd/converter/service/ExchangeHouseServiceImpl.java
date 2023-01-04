/**
 * ExchangeHouseServiceImpl.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.service;

import java.math.BigDecimal;

import ar.com.camd.converter.model.CurrencyCode;
import ar.com.camd.converter.model.ExchangeHouse;
import ar.com.camd.converter.model.Quoter;

/**
 * <code>ExchangeHouseServiceImpl</code>
 * Represents a exchange house.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public class ExchangeHouseServiceImpl implements ExchangeHouseService {

	@Override
	public ExchangeHouse exchange(BigDecimal amount, CurrencyCode fromCurrency, CurrencyCode toCurrency) {
		QuoteService quoteService = new QuoteServiceImpl();
		Quoter quoter = quoteService.quote(fromCurrency, toCurrency);
		
		// Calculates the exchange amount
		BigDecimal exchangeAmount = amount.multiply(quoter.getExchangeRate());
		
		return new ExchangeHouse(quoter, amount, exchangeAmount);
	}
}