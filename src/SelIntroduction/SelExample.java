package SelIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

		WebDriver driver2 = new EdgeDriver();
		
		driver2.get("https://www.makemytrip.com");
		
		System.out.println(driver2.getTitle());
		
		System.out.println(driver2.getCurrentUrl());
		
		
//		driver2.close(); 
		
//		driver2.quit();
		
	}
}
