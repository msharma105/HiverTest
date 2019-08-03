package Test.Feature;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;

import pages.homePage;
import pages.loginPage;

public class loginTest extends testBase {
	public static loginPage loginpage;
	public static homePage homepage;

	//public loginTest() throws FileNotFoundException// to load properties
	//{
	//	BaseTest();
	//	initialization(); // to initialize browser
	//	loginpage = new loginPage();
	//}

	//@BeforeMethod

	//public void setup() {

		//try {
			//loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}

	//}

	//@Test

	//@AfterMethod
	//public void teardown() {
	//	driver.quit();
	//}

}
