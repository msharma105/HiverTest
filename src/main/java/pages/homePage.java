package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.testBase;

public class homePage extends testBase {
	@FindBy(xpath = "//tr[contains(@class,'zA')]")
	static List<WebElement> ls;
	@FindBy(xpath = "//div[contains(@class,'Tm')]")
	static WebElement mail;
	//@FindBy(xpath = "//div[@class=\"ha\"]//h2")
	//static WebElement title;

	public homePage() {
		PageFactory.initElements(driver, this);
	}

	public static String ValidateHomepageloaded() {

		WebDriverWait wt = new WebDriverWait(driver, 100);
		WebElement s = wt
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/a[contains(text(),'Inbox')]")));
		return s.getText();

	}

	public static void printtest() {
		for (int i = 1; i < ls.size(); i += 2) {
			System.out.println();
			System.out.println("This is page" + " " + i);
			System.out.print(ls.get(i));

			ls.get(i).click();
			//System.out.println("title of the page is" + title.getText().toString());
			System.out.print(mail.getText());
			driver.navigate().back();

		}
	}

}
