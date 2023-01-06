/**
 * Temperature.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

/**
 * <code>Temperature</code>
 * Represents the temperature.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public class Temperature {

	private TemperatureUnit unit;
	private Double value;

	/**
	 * @param unit The temperature unit.
	 * @param value The temperature value.
	 */
	public Temperature(TemperatureUnit unit, Double value) {
		this.unit = unit;
		this.value = value;
	}
	
	/**
	 * @param unit The temperature unit.
	 */
	public Temperature(TemperatureUnit unit) {
		this.unit = unit;
	}

	/**
	 * @return the temperature unit.
	 */
	public TemperatureUnit getUnit() {
		return unit;
	}

	/**
	 * @return the temperature value.
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * @param value the temperature value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}

}