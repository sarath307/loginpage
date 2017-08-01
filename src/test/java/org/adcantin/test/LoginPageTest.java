package org.adcantin.test;

import org.adcantin.page.LoginPage;
import org.adcantin.page.NextPage;
import org.adcantin.utility.Base;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class LoginPageTest extends Base {
	static WebDriver driver;
	LoginPage loginPage;
	NextPage page;

	@BeforeClass
	public static void launchBrowser() {
		//base = new Base();
		driver = getDriver();
	}
	@Test
	public void verifyLoginPageDetails() {
		loginPage = new LoginPage(driver);
		page = new NextPage(driver);
		Assert.assertTrue(elementFound(loginPage.getImg1Logo()));
		Assert.assertTrue(elementFound(loginPage.getImg2Hotel()));
		Assert.assertTrue(elementFound(loginPage.getImg3Hotel()));
		Assert.assertTrue(elementFound(loginPage.getImg4Hotel()));
		Assert.assertTrue(elementFound(loginPage.getImg5Hotel()));
		Assert.assertTrue(elementFound(loginPage.getTxtPassword()));
		Assert.assertTrue(elementFound(loginPage.getImg8Hotel()));
		Assert.assertTrue(elementFound(loginPage.getTxtTitle()));
		Assert.assertTrue(elementFound(loginPage.getTxtTitle1()));
		Assert.assertTrue(elementFound(loginPage.getTxtTitle2()));
		Assert.assertTrue(elementFound(loginPage.getTxtTitle3()));
		setText(loginPage.getTxtUserName(), "sarathr3077");
		Assert.assertEquals("sarathr3077",getText(loginPage.getTxtUserName()));
		setText(loginPage.getTxtPassword(), "0123456");
		Assert.assertEquals("0123456", getText(loginPage.getTxtPassword()));
		loginPage.getTxtPassword().sendKeys(Keys.ENTER);
		clickBtn(loginPage.getBtnLogin());
		Assert.assertTrue(elementFound(driver, 10,page.getTxtNextPageTitle()));
	}

	@AfterClass
	
	public static void closeBrowser() {
		driver.quit();
	}

}
