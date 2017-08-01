package org.adcantin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@href='Logout.php']")
	private  WebElement txtNextPageTitle;

	

	public NextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getTxtNextPageTitle() {
		return txtNextPageTitle;
	}

	
	}


