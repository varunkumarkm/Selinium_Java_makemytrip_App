package Makemytrip;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemytripApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varunkm\\eclipse-workspace\\Introduction\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.className("commonModal__close")).click();
		
		driver.findElement(By.className("selected"));
				
		WebElement fromCityPlace = driver.findElement(By.id("fromCity"));
		fromCityPlace.click();
		
		WebElement fromField = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromField.sendKeys("B");
		
		Actions actions = new Actions(driver);
		
		actions.pause(Duration.ofSeconds(3)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		WebElement toFieldPlace = driver.findElement(By.id("toCity"));
		toFieldPlace.click();
		
		WebElement toField = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toField.sendKeys("b");
		
		actions.pause(Duration.ofSeconds(3)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
//		for (int i = 0; i < 5; i++) {
//            actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).build().perform();
//        }
//        actions.sendKeys(Keys.ENTER).build().perform();
//        
//        WebElement toFieldPlace = driver.findElement(By.id("toCity"));
//        toFieldPlace.click();
//        
//        WebElement toField = driver.findElement(By.xpath("//input[@placeholder='To']"));
//        toField.sendKeys("b");
//        
//        actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		System.out.println(driver.getTitle());
	
		System.out.println(driver.getCurrentUrl());
	}
}