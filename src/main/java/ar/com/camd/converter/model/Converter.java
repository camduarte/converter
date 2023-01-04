/**
 * Converter.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

/**
 * <code>Converter</code>
 * Converter types.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public enum Converter {
	CURRENCY("moneda"), TEMPERATURE("temperatura");

	private String description;
	
	private Converter(String description) {
		this.description = description;
	}
	
	public String description() {
		return this.description;
	}
}

