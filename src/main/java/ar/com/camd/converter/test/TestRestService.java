/**
 * TestRestService.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.test;

import java.util.HashMap;
import java.util.Map;

import ar.com.camd.converter.model.CurrencyCode;
import ar.com.camd.converter.model.CurrencyExchange;
import ar.com.camd.converter.service.RestService;
import ar.com.camd.converter.service.RestServiceImpl;

/**
 * <code>TestRestService</code>
 * Class to test application functionality.
 * 
 * @author    Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class TestRestService {

	public static void main(String[] args) {
		String url = "https://www.alphavantage.co/query?";
		Map<String, String> params;
		String ACCESS_KEY = "J339HYT5BLCRHA3P";

		params = new HashMap<String, String>();
		params.put("function=", "CURRENCY_EXCHANGE_RATE");
		params.put("from_currency=", CurrencyCode.ARS.name());
		params.put("to_currency=", CurrencyCode.USD.name());
		params.put("apikey=", ACCESS_KEY);

		RestService<CurrencyExchange> financeService = new RestServiceImpl<CurrencyExchange>(url, params, CurrencyExchange.class);
		CurrencyExchange ce = financeService.send();
		System.out.println(ce.getRealtimeCurrencyExchangeRate().getFromCurrencyCode());
	}
}
