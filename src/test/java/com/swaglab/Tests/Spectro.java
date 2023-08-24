package com.swaglab.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Spectro {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");	
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://14.142.49.150:10031/iappcore/MVC/LeaveApplicationARS/Index?MenuId=44&mode=Add&tranNo=0");

		//driver.findElement(By.xpath("//b[@role='presentation']")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@name='drpLocation']"));
		
		Select s= new Select(element);
		s.selectByValue("Ahmedabad");
		driver.close();
	}

}
