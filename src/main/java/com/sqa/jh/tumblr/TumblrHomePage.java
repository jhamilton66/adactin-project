/**
 *   File Name: TumblrHomePage.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 27, 2016
 *   
 */

package com.sqa.jh.tumblr;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.sqa.jh.core.*;

/**
 * TumblrHomePage //ADDD (description of class)
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
public class TumblrHomePage extends BasicPageObject {

	@FindBy(id = "search_query")
	private static WebElement searchField;

	// @FindBy(id = "login")
	// private static WebElement loginButton;

	// @FindBy(id = "password")
	// private static WebElement passwordField;

	private static String searchItem = "independence day";
	private static int minSize = 200;

	public TumblrHomePage(WebDriver driver) {
		super(driver);

	}

	/**
	 * @param baseURL
	 */

	public void loginToWebsite() {
		System.out.println("Starting Test");
		searchField.sendKeys(searchItem);
		// passwordField.sendKeys(password);
		// loginButton.click();

	}

}
