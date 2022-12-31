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
	 * The currency from.
	 */
	private Currency fromCurrency;
	
	/**
	 * The currency to.
	 */
	private Currency toCurrency;
	
	/**
	 * The exchange value. 
	 */
	private BigDecimal exchangeRate;

}
