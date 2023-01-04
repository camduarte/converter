/**
 * Quoter.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

import java.math.BigDecimal;

/**
 * <code>Quoter</code> Provides quote information.
 * 
 * @author Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version 1.0.0-SNAPSHOT
 */
public class Quoter {

	/**
	 * The currency you would like to get the exchange rate for.
	 */
	private Currency fromCurrency;

	/**
	 * The destination currency for the exchange rate.
	 */
	private Currency toCurrency;

	/**
	 * The exchange rate.
	 */
	private BigDecimal exchangeRate;

	/**
	 * Initializes the source currency and destination currency.
	 * 
	 * @param fromCurrency The currency you would like to get the exchange rate for.
	 * @param toCurrency   The destination currency for the exchange rate.
	 */
	public Quoter(Currency fromCurrency, Currency toCurrency) {
		this.fromCurrency = fromCurrency;
		this.toCurrency = toCurrency;
	}

	/**
	 * @return the fromCurrency
	 */
	public Currency getFromCurrency() {
		return fromCurrency;
	}

	/**
	 * @return the toCurrency
	 */
	public Currency getToCurrency() {
		return toCurrency;
	}

	/**
	 * @return the exchangeRate
	 */
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	/**
	 * 
	 * @param exchangeRate
	 */
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@Override
	public String toString() {
		return String.format("{fromCurrency: %s, toCurrency: %s, exchangeRate: %f}", 
				this.fromCurrency.getCode().name(),
				this.toCurrency.getCode().name(), 
				this.exchangeRate
				);
	}
}
