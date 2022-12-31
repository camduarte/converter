/**
 * FinanceServiceImpl.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.service;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;

import com.google.gson.Gson;

/**
 * <code>FinanceServiceImpl</code>
 * Provides financial information from alphavantage.
 * 
 * @author   Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class RestServiceImpl<T> implements RestService<T> {

	private Class<T> type;
	private String url;
	private Map<String, String> params;
	private final String METHOD = "GET";
	private final String USER_AGENT = "Mozilla/5.0";

	public RestServiceImpl(String url, Map<String, String> params, Class<T> type) {
		this.url = url;
		this.params = params;
		this.type = type;
	}

	@Override
	public T send() {
		try {
			URL address = new URL(this.composeURL());

			HttpURLConnection con = (HttpURLConnection) address.openConnection();
			con.setRequestMethod(METHOD);
			con.setRequestProperty("User-agent", USER_AGENT);

			InputStreamReader isr = new InputStreamReader(con.getInputStream());
			
			return this.jsonToObj(isr);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}

	@Override
	public String composeURL() {
		StringBuilder sb = new StringBuilder(url);
		
		Iterator<String> paramList = this.params.keySet().iterator();
		while (paramList.hasNext()) {
			String paramName = paramList.next();
			sb.append(paramName).append(this.params.get(paramName)).append("&");
		}

		return sb.toString();
	}

	public T jsonToObj(InputStreamReader isr) {
		Gson gson = new Gson();
		return gson.fromJson(isr, type);
	}
}