/**
 *   File Name: BasicPageObject.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 25, 2016
 *   
 */

package com.sqa.jh.core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

/**
 * BasicPageObject //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Hamilton, James
 * @version 1.0.0
 * @since 1.0
 *
 */
public class BasicPageObject {
	public BasicPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
