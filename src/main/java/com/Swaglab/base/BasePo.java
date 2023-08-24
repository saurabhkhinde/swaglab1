package com.Swaglab.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class BasePo {

	protected static WebDriver driver;

	public static void BrowserLaunch() throws InterruptedException
	{
		// WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.saucedemo.com/v1/");
	}

	
}
