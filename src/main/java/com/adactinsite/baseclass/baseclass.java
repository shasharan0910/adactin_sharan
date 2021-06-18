package com.adactinsite.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	public static WebDriver driver;

	public static WebDriver dd(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");

			// driver = new gecko Driver();
		}

		driver.manage().window().maximize();
		return driver;

	}

	public static WebDriver okg(String url)

	{
		driver.get(url);
		return driver;
	}

	public static void ts(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}

	public static void q() {
		driver.quit();
	}

	public static void ck(WebElement element)

	{
		element.click();
	}

	public static void sk(WebElement element, String value)

	{
		element.sendKeys(value);
	}

	public static void cls(WebElement element)

	{
		driver.close();
	}


}
