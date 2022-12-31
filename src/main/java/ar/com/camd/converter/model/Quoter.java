/**
 * Quoter.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

import java.math.BigDecimal;

/**
 * <code>Quoter</code>
 * Provides quote information.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class Quoter {
	
	/**
	 * The currency you would like to get the exchange rate for.
	 */
	private Currency fromCurrency;
	
	/**
	 * The destination currency for the exchange rate..
	 */
	private Currency toCurrency;
	
	/**
	 * The exchange rate. 
	 */
	private BigDecimal exchangeRate;

}
