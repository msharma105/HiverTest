package Test.Feature;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;

import pages.homePage;
import pages.loginPage;

public class homePageTest extends testBase {
	loginPage loginpage;
	homePage homepage;

	public homePageTest() throws FileNotFoundException// to load properties
	{

		BaseTest();
		initialization(); // to initialize browser
		loginpage = new loginPage();
		homepage = new homePage();

	}

	@BeforeMethod

	public void setup() throws FileNotFoundException {

		try {
			loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void HomePageTestload() throws InterruptedException {
		String s1 = homePage.ValidateHomepageloaded();
		Assert.assertEquals(s1, "Inbox");
		System.out.println("page is loaded successfully");
	}

	@AfterMethod
	public void teardown() {
		homePage.printtest();
		driver.quit();
	}

}
