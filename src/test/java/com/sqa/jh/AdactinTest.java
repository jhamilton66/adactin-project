/**
 *   File Name: AdactinTest.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 25, 2016
 *   
 */

package com.sqa.jh;

import org.testng.annotations.*;

import com.sqa.jh.adactin.*;

/**
 * AdactinTest //ADDD (description of class)
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
public class AdactinTest extends BasicTest {

	public AdactinTest() {
		super("http://adactin.com/HotelApp");
		// TODO Auto-generated constructor stub
	}

	@Test
	public void adactinTest() throws InterruptedException {
		String expectedTitle = "AdactIn.com - Search Hotel";
		AdactinHomePage home = new AdactinHomePage(getDriver());
		home.loginToWebsite();
		// Assert.assertEquals(getDriver().getTitle(), expectedTitle, "Login Not
		// Successful");
		if (!getDriver().getTitle().equals(expectedTitle)) {
			getLog().warn("unsuccessful loging attempt");
		}
	}
}
