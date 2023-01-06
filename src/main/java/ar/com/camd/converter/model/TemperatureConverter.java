/**
 * TemperatureConverter.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

/**
 * <code>TemperatureConverter</code>
 * Provides temperature unit conversion.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public class TemperatureConverter {

	/**
	 * Converts the unit temperature.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	public Temperature convert(Temperature from, Temperature to) {
		if (from.getUnit() == TemperatureUnit.Celsius && to.getUnit() == TemperatureUnit.Kelvin) {
			return this.celsiusToKelvin(from, to);
		} else if (from.getUnit() == TemperatureUnit.Celsius && to.getUnit() == TemperatureUnit.Fahrenheit) {
			return this.celsiusToFahrenheit(from, to);
		} else if (from.getUnit() == TemperatureUnit.Celsius && to.getUnit() == TemperatureUnit.Rankine) {
			return this.celsiusToRankine(from, to);
		} else if (from.getUnit() == TemperatureUnit.Kelvin && to.getUnit() == TemperatureUnit.Celsius) {
			return this.kelvinToCelsius(from, to);
		} else if (from.getUnit() == TemperatureUnit.Kelvin && to.getUnit() == TemperatureUnit.Fahrenheit) {
			return this.kelvinToFahrenheit(from, to);
		} else if (from.getUnit() == TemperatureUnit.Kelvin && to.getUnit() == TemperatureUnit.Rankine) {
			return this.kelvinToRankine(from, to);
		} else if (from.getUnit() == TemperatureUnit.Fahrenheit && to.getUnit() == TemperatureUnit.Kelvin) {
			return this.fahrenheitToKelvin(from, to);
		} else if (from.getUnit() == TemperatureUnit.Fahrenheit && to.getUnit() == TemperatureUnit.Celsius) {
			return this.fahrenheitToCelsius(from, to);
		} else if (from.getUnit() == TemperatureUnit.Fahrenheit && to.getUnit() == TemperatureUnit.Rankine) {
			return this.fahrenheitToRankine(from, to);
		} else if (from.getUnit() == TemperatureUnit.Rankine && to.getUnit() == TemperatureUnit.Kelvin) {
			return this.rankineToKelvin(from, to);
		} else if (from.getUnit() == TemperatureUnit.Rankine && to.getUnit() == TemperatureUnit.Fahrenheit) {
			return this.rankineToFahrenheit(from, to);
		} else if (from.getUnit() == TemperatureUnit.Rankine && to.getUnit() == TemperatureUnit.Celsius) {
			return this.rankineToCelsius(from, to);
		} else if (from.getUnit() == to.getUnit()) {
			System.out.println("The units of the temperatures are the same!");
			to.setValue(from.getValue());
			return to;
		} else {
			System.out.println("Conversion not found!");
			return to;
		}
	}

	/**
	 * Converts from Celsius to Kelvin.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature celsiusToKelvin(Temperature from, Temperature to) {
		//K = C + 273.15
		Double result = from.getValue().doubleValue() + 273.15;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Celsius to Fahrenheit.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature celsiusToFahrenheit(Temperature from, Temperature to) {
		//F = (9/5)C + 32
		Double result = (9.0 / 5.0) * from.getValue().doubleValue() + 32.0;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Celsius to Rankine.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature celsiusToRankine(Temperature from, Temperature to) {
		//°C × 9/5 + 491.67
		Double result = from.getValue().doubleValue() * (9.0 / 5.0) + 491.67;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Fahrenheit to Celsius.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature fahrenheitToCelsius(Temperature from, Temperature to) {
		//°C = (°F − 32) × 5/9
		Double result = (from.getValue().doubleValue() - 32.0) * (5.0 / 9.0);
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Fahrenheit to Kelvin.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature fahrenheitToKelvin(Temperature from, Temperature to) {
		//K = (°F − 32) × 5/9 + 273.15
		Double result = (from.getValue().doubleValue() - 32.0) * (5.0 / 9.0) + 273.15;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Fahrenheit to Rankine.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature fahrenheitToRankine(Temperature from, Temperature to) {
		//°R = °F + 459.67
		Double result = from.getValue().doubleValue() + 459.67;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Rankine to Celsius.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature rankineToCelsius(Temperature from, Temperature to) {
		//°C = (°R − 491.67) × 5/9
		Double result = (from.getValue().doubleValue() - 491.67) * (5.0 / 9.0);
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Rankine to Kelvin.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature rankineToKelvin(Temperature from, Temperature to) {
		//K = °R × 5/9
		Double result = from.getValue().doubleValue() * 5.0 / 9.0;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Rankine to Fahrenheit.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature rankineToFahrenheit(Temperature from, Temperature to) {
		//°F = °R − 459.67
		Double result = from.getValue().doubleValue() - 459.67;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Kelvin to Celsius.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature kelvinToCelsius(Temperature from, Temperature to) {
		//°C = K − 273.15
		Double result = from.getValue().doubleValue() - 273.15;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Kelvin to Fahrenheit.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature kelvinToFahrenheit(Temperature from, Temperature to) {
		//°F = (K − 273.15) × 9/5 + 32
		Double result = (from.getValue().doubleValue() - 273.15) * 9.0 / 5.0 + 32.0;
		to.setValue(result);
		return to;
	}

	/**
	 * Converts from Kelvin to Rankine.
	 * @param from The temperature from which you want to convert.
	 * @param to The destiny temperature.
	 * @return The result temperature.
	 */
	private Temperature kelvinToRankine(Temperature from, Temperature to) {
		//°R = K * 1.8
		Double result = from.getValue().doubleValue() * 1.8;
		to.setValue(result);
		return to;
	}
}