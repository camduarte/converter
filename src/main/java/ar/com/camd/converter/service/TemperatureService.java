/**
 * TemperatureService.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.service;

import ar.com.camd.converter.model.Temperature;
import ar.com.camd.converter.model.TemperatureUnit;

/**
 * <code>TemperatureService</code>
 * Provides a temperature conversion service.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public interface TemperatureService {
	
	/**
	 * Performs the temperature conversion.
	 * @param fromUnit The temperature unit from which you want to convert. 
	 * @param toUnit The target temperature unit.
	 * @param temperature The temperature value.
	 * @return An Temperature encapsulating the information.
	 */
	public Temperature convert(TemperatureUnit fromUnit, TemperatureUnit toUnit, Double temperature);
	
}
