/**
 * TestController.java
 * 
 * @copyright 2022, Christian Ariel Modesto Duarte. All rights reserved.
 */
package ar.com.camd.converter.test;

import ar.com.camd.converter.controller.QuoterController;
import ar.com.camd.converter.model.CurrencyCode;

/**
 * <code>TestController</code>
 * Class to test application functionality.
 * 
 * @author	Christian Ariel Modesto Duarte <duarte.camd@gmail.com>
 * @version  1.0.0-SNAPSHOT
 */
public class TestController {

	public static void main(String[] args) {
		QuoterController quoterController = new QuoterController();
		quoterController.quote(CurrencyCode.USD, CurrencyCode.ARS);
	}

}
