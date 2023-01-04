/**
 * ExchangeHouse.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

import java.math.BigDecimal;

/**
 * <code>ExchangeHouse</code>
 * Insert class description here.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class ExchangeHouse {

	private Quoter quoter;
	private BigDecimal amount;
	private BigDecimal exchangeAmount;

	/**
	 * @param quoter The quoter with the exchange rate.
	 * @param amount The amount to exchange.
	 * @param exchangeAmount The exchange amount.
	 */
	public ExchangeHouse(Quoter quoter, BigDecimal amount, BigDecimal exchangeAmount) {
		this.quoter = quoter;
		this.amount = amount;
		this.exchangeAmount = exchangeAmount;
	}

	/**
	 * @return the exchangeAmount
	 */
	public BigDecimal getExchangeAmount() {
		return exchangeAmount;
	}
}