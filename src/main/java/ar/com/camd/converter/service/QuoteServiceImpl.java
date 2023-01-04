/**
 * QuoteServiceImpl.java
 * 
 * @copyright 2023, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import ar.com.camd.converter.model.Currency;
import ar.com.camd.converter.model.CurrencyCode;
import ar.com.camd.converter.model.CurrencyExchange;
import ar.com.camd.converter.model.Quoter;

/**
 * <code>QuoteServiceImpl</code>
 * The quote service to get the exchange rate.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version	1.0.0-SNAPSHOT
 */
public class QuoteServiceImpl implements QuoteService {

	/**
	 * The rest service.
	 */
	private RestService<CurrencyExchange> restService;

	@Override
	public Quoter quote(CurrencyCode fromCurrency, CurrencyCode toCurrency) {
		Quoter quote = new Quoter(new Currency(fromCurrency), new Currency(toCurrency));

		String url = "https://www.alphavantage.co/query?";
		Map<String, String> params;
		String ACCESS_KEY = "J339HYT5BLCRHA3P";

		params = new HashMap<String, String>();
		params.put("function=", "CURRENCY_EXCHANGE_RATE");
		params.put("from_currency=", quote.getFromCurrency().getCode().name());
		params.put("to_currency=", quote.getToCurrency().getCode().name());
		params.put("apikey=", ACCESS_KEY);

		this.restService = new RestServiceImpl<CurrencyExchange>(url, params, CurrencyExchange.class);
		CurrencyExchange ce = this.restService.send();
		quote.setExchangeRate(BigDecimal.valueOf(ce.getRealtimeCurrencyExchangeRate().getExchangeRate()));
		System.out.println(quote);
		
		return quote;
	}
}