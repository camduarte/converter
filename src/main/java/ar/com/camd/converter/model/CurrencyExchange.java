/**
 * CurrencyExchange.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

import com.google.gson.annotations.SerializedName;

/**
 * <code>CurrencyExchange</code>
 * Insert class description here.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class CurrencyExchange {
	@SerializedName("Realtime Currency Exchange Rate")
	RealtimeCurrencyExchangeRate realtimeCurrencyExchangeRate ;

	/**
	 * @return the realtimeCurrencyExchangeRate
	 */
	public RealtimeCurrencyExchangeRate getRealtimeCurrencyExchangeRate() {
		return realtimeCurrencyExchangeRate;
	}

	/**
	 * @param realtimeCurrencyExchangeRate the realtimeCurrencyExchangeRate to set
	 */
	public void setRealtimeCurrencyExchangeRate(RealtimeCurrencyExchangeRate realtimeCurrencyExchangeRate) {
		this.realtimeCurrencyExchangeRate = realtimeCurrencyExchangeRate;
	}
}