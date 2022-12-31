/**
 * Currency.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

/**
 * <code>Currency</code>
 * Represents a currency.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class Currency {
	
	/**
	 * The currency code.
	 */
	private CurrencyCode code;

	/**
	 * Gets the code.
	 * 
	 * @return The currency code
	 */
	public CurrencyCode getCode() {
		return code;
	}

	/**
	 * Initializes the currency code.
	 * @param code The currency code.
	 */
	public Currency(CurrencyCode code) {
		this.code = code;
	}

}