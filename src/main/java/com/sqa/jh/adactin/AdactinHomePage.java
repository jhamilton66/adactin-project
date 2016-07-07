/**
 *   File Name: HomePage.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 25, 2016
 *   
 */

package com.sqa.jh.adactin;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.jh.core.*;

/**
 * HomePage //ADDD (description of class)
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
public class AdactinHomePage extends BasicPageObject {
	@FindBy(id = "username")
	private static WebElement usernameField;

	@FindBy(id = "login")
	private static WebElement loginButton;

	@FindBy(id = "password")
	private static WebElement passwordField;

	private static String username = "jajujo12";

	private static String password = "Bootcamp2";

	/**
	 * @param driver
	 */
	public AdactinHomePage(WebDriver driver) {
		super(driver);
	}

	/**
	 * @param baseURL
	 */

	public void loginToWebsite() {
		System.out.println("Starting Test");
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

	}

}
