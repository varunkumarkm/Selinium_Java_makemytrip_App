package SelIntroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelExample {

	public static void main(String[] args) {
		
		//For Chrome browser.
	   //--------------------
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varunkm\\eclipse-workspace\\Introduction\\Drivers\\chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
		
		//For Firefox browser
		//---------------------
		
//		System.setProperty("webdriver.gecho.driver", "");
//
//		WebDriver driver1 = new FirefoxDriver();
		

		//For the Edge browser.
	   //----------------------
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\varunkm\\eclipse-workspace\\Introduction\\Drivers\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		
//		driver.get("https://www.makemytrip.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipcart")));
		
		driver.findElement(By.linkText("https://makemytrip.com/")).click();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
//		driver2.close(); 
		
//		driver2.quit();
		
	}
}
