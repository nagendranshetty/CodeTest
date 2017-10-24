package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

public class Utility {
	public static void captureScreenShotPass(WebDriver driver, String s)  {

		try {
			TakesScreenshot t = (TakesScreenshot) driver;

			File source = t.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./Screenshots_Pass/" + s + ".png"));

			System.out.println("Screenshot taken - Pass");

		} catch (Exception e) {

		}
	}

	public static void captureScreenShotFail(WebDriver driver, String s) {

		try {
			TakesScreenshot t = (TakesScreenshot) driver;

			File source = t.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(source, new File("./Screenshots_Fail/" + s + ".png"));

			System.out.println("Screenshot taken - Fail");

		} catch (Exception e) {

		}
	}

}
