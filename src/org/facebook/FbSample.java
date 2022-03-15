package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prave\\eclipse-workspace\\FirstDayTask\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("appu@123");
		
		WebElement textpass = driver.findElement(By.id("pass"));
		textpass.sendKeys("1234");
		
		
		
		
		
	}
}

		 
		
