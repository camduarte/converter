/**
 * FinanceService.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.service;

/**
 * <code>FinanceService</code>
 * Provides an interface to a service to get financial information.
 * 
 * @author   Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public interface RestService<T> {
	
	public T send();
	
	public String composeURL();
}
