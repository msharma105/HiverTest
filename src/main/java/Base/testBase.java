package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {
	public static WebDriver driver;
	public static Properties prop;

	public void BaseTest() throws FileNotFoundException {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("config.properties");
			prop.load(file);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static WebDriver initialization() {
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		} else {
			System.out.println("no browser available");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

}
