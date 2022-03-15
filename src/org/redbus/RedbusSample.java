package org.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusSample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\prave\\\\eclipse-workspace\\\\FirstDayTask\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		WebElement textfrom = driver.findElement(By.id("src"));
		textfrom.sendKeys("chennai");
		
		WebElement textto = driver.findElement(By.id("dest"));
		textto.sendKeys("madhurai");
		
		
		
	}

}
