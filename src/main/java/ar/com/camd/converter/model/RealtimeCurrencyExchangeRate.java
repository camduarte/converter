/**
 * RealtimeCurrencyExchangeRate.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.model;

import com.google.gson.annotations.SerializedName;

/**
 * <code>RealtimeCurrencyExchangeRate</code>
 * Provides information from alphavantage.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class RealtimeCurrencyExchangeRate {

	@SerializedName("1. From_Currency Code")
	String fromCurrencyCode;
	@SerializedName("2. From_Currency Name")
	String fromCurrencyName;
	@SerializedName("3. To_Currency Code")
    String toCurrencyCode;
	@SerializedName("4. To_Currency Name")
    String toCurrencyName;
	@SerializedName("5. Exchange Rate")
    double exchangeRate;
	@SerializedName("6. Last Refreshed")
	String lastRefreshed;
	@SerializedName("7. Time Zone")
    String timeZone;
	@SerializedName("8. Bid Price")
    double bidPrice;
	@SerializedName("9. Ask Price")
    double askPrice;

	/**
	 * @return the fromCurrencyCode
	 */
	public String getFromCurrencyCode() {
		return fromCurrencyCode;
	}
	/**
	 * @param fromCurrencyCode the fromCurrencyCode to set
	 */
	public void setFromCurrencyCode(String fromCurrencyCode) {
		this.fromCurrencyCode = fromCurrencyCode;
	}
	/**
	 * @return the fromCurrencyName
	 */
	public String getFromCurrencyName() {
		return fromCurrencyName;
	}
	/**
	 * @param fromCurrencyName the fromCurrencyName to set
	 */
	public void setFromCurrencyName(String fromCurrencyName) {
		this.fromCurrencyName = fromCurrencyName;
	}
	/**
	 * @return the toCurrencyCode
	 */
	public String getToCurrencyCode() {
		return toCurrencyCode;
	}
	/**
	 * @param toCurrencyCode the toCurrencyCode to set
	 */
	public void setToCurrencyCode(String toCurrencyCode) {
		this.toCurrencyCode = toCurrencyCode;
	}
	/**
	 * @return the toCurrencyName
	 */
	public String getToCurrencyName() {
		return toCurrencyName;
	}
	/**
	 * @param toCurrencyName the toCurrencyName to set
	 */
	public void setToCurrencyName(String toCurrencyName) {
		this.toCurrencyName = toCurrencyName;
	}
	/**
	 * @return the exchangeRate
	 */
	public double getExchangeRate() {
		return exchangeRate;
	}
	/**
	 * @param exchangeRate the exchangeRate to set
	 */
	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	/**
	 * @return the lastRefreshed
	 */
	public String getLastRefreshed() {
		return lastRefreshed;
	}
	/**
	 * @param lastRefreshed the lastRefreshed to set
	 */
	public void setLastRefreshed(String lastRefreshed) {
		this.lastRefreshed = lastRefreshed;
	}
	/**
	 * @return the timeZone
	 */
	public String getTimeZone() {
		return timeZone;
	}
	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	/**
	 * @return the bidPrice
	 */
	public double getBidPrice() {
		return bidPrice;
	}
	/**
	 * @param bidPrice the bidPrice to set
	 */
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	/**
	 * @return the askPrice
	 */
	public double getAskPrice() {
		return askPrice;
	}
	/**
	 * @param askPrice the askPrice to set
	 */
	public void setAskPrice(double askPrice) {
		this.askPrice = askPrice;
	}
}