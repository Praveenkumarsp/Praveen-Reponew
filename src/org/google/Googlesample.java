package org.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesample {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\prave\\\\eclipse-workspace\\\\FirstDayTask\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement textsearch = driver.findElement(By.name("q"));
		textsearch.sendKeys("GreensTechnology");
		
		
	}

}
