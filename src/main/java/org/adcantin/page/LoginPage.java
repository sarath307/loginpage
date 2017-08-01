package org.adcantin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='username']")
	private WebElement txtUserName;
	@FindBy(xpath = "//*[@id='password']")
	private WebElement txtPassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(xpath = "//*[@class='logo']")
	private WebElement img1Logo;
	@FindBy(xpath = "//*[@alt='AdactIn Group: Hotel Reservation System'] ")
	private WebElement img8Hotel;
	@FindBy(xpath = "//*[@class='content_left']")
	private WebElement txtTitle;
	@FindBy(xpath = "//*[@alt='Hotel Image 3']")
	private WebElement img2Hotel;
	@FindBy(xpath = "//*[@alt='Hotel Image 1']")
	private WebElement img3Hotel;
	@FindBy(xpath = "//*[@alt='Hotel Image 2']")
	private WebElement img4Hotel;
	@FindBy(xpath = "//*[@alt='Hotel Image 4']")
	private WebElement img5Hotel;
	@FindBy(xpath = "//*[@class='login_title']")
	private WebElement txtTitle1;
	@FindBy(xpath = "//*[@class='login_register']")
	private WebElement txtTitle2;
	@FindBy(xpath = "//*[@class='build_title']")
	private WebElement txtTitle3;
	
	

	

	public WebElement getTxtTitle1() {
		return txtTitle1;
	}





	public void setTxtTitle1(WebElement txtTitle1) {
		this.txtTitle1 = txtTitle1;
	}





	public WebElement getTxtUserName() {
		return txtUserName;
	}





	public WebElement getTxtPassword() {
		return txtPassword;
	}





	public WebElement getBtnLogin() {
		return btnLogin;
	}





	public WebElement getImg1Logo() {
		return img1Logo;
	}





	public WebElement getImg8Hotel() {
		return img8Hotel;
	}





	public WebElement getTxtTitle() {
		return txtTitle;
	}





	public WebElement getImg2Hotel() {
		return img2Hotel;
	}





	public WebElement getImg3Hotel() {
		return img3Hotel;
	}





	public WebElement getImg4Hotel() {
		return img4Hotel;
	}





	public WebElement getImg5Hotel() {
		return img5Hotel;
	}





	public WebElement getTxtTitle2() {
		return txtTitle2;
	}





	public WebElement getTxtTitle3() {
		return txtTitle3;
	}





	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
}
