/**
 * TemperatureUnit.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

/**
 * <code>TemperatureUnit</code>
 * Provides temperature units.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public enum TemperatureUnit {
	Celsius("°C"), Fahrenheit("°F"), Kelvin("K"), Rankine("°R");

	private String symbol;

	private TemperatureUnit(String symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * @return The unit symbol.
	 */
	public String getSymbol() {
		return this.symbol;
	}
}