package org.lvbbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LvbBankSample {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\prave\\\\eclipse-workspace\\\\FirstDayTask\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp\r\n");
		driver.manage().window().maximize();
	
		WebElement textuser = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		textuser.sendKeys("appu");
		WebElement textpno = driver.findElement(By.id("DUMMY23"));
		textpno.sendKeys("122333");
		
		
		
	}
	

}
