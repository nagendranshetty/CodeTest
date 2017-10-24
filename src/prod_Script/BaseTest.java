package prod_Script;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import generic.Utility;

public abstract class BaseTest {

	public WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void preCondition(String browser) {

		Scanner sc2 = new Scanner(System.in);

		System.out.println("Enter the Environment");
		String env = sc2.nextLine();

		if (browser.equals("chrome")) {
			String key = "webdriver.chrome.driver";
			String value = "./driver/chromedriver.exe";
			System.setProperty(key, value);
			driver = new ChromeDriver();
		} else if (browser.equals("ie")) {
			String key = "webdriver.ie.driver";
			String value = "./driver/IEDriverServer.exe";
			System.setProperty(key, value);
			driver = new InternetExplorerDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);

		if (env.equals("QA") || env.equals("qa")) {

			driver.get("//https://www.cleartrip.com/");
		} else if (env.equals("DEV") || env.equals("dev")) {

			driver.get("https://www.cleartrip.com/");
		} else if (env.equals("UAT") || env.equals("uat")) {

			driver.get("https://www.cleartrip.com/");
		} else if (env.equalsIgnoreCase("PROD")) {

			driver.get("https://www.cleartrip.com/");
		}
	}

	public void setDriverPath() {
		/*
		 * if (PlatformUtil.isMac()) {
		 * System.setProperty("webdriver.chrome.driver", "chromedriver"); } if
		 * (PlatformUtil.isWindows()) {
		 * System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); }
		 * if (PlatformUtil.isLinux()) {
		 * System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
		 * }
		 */
	}

	@AfterMethod
	public void postCondition(ITestResult res) {

		if (ITestResult.FAILURE == res.getStatus())
			Utility.captureScreenShotFail(driver, res.getTestName());

		driver.close();
	}
}
