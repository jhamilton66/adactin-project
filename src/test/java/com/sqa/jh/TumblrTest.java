/**
 *   File Name: TumblrTest.java<br>
 *
 *   Hamilton, James<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jun 27, 2016
 *   
 */

package com.sqa.jh;

import org.testng.*;
import org.testng.annotations.*;

import com.sqa.jh.tumblr.*;

/**
 * TumblrTest //ADDD (description of class)
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
public class TumblrTest extends BasicTest {

	/**
	 * @param baseURL
	 */
	public TumblrTest() {
		super("http://www.tumblr.com");
		// TODO Auto-generated constructor stub

	}

	@Test
	public void tumblrtest() throws InterruptedException {
		String expectedTitle = "Sign up Tumblr";
		TumblrHomePage home = new TumblrHomePage(getDriver());
		home.loginToWebsite();
		Assert.assertEquals(getDriver().getTitle(), expectedTitle, "Login Not Successful");
	}

}
