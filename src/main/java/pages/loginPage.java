package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class loginPage extends testBase {
	@FindBy(xpath = "//input[@id ='identifierId']")
	static WebElement username;

	@FindBy(name = "password")
	static WebElement password;

	@FindBy(xpath = "//span[contains(text(),'Next')]")
	static WebElement Login;

	public loginPage() {
		PageFactory.initElements(driver, this);

	}

	public static void login(String usn, String psw) throws InterruptedException {
		username.sendKeys(usn);
		Login.click();
		password.sendKeys(psw);
		Thread.sleep(1000);
		Login.click();

		// return new homePage();

	}

}
