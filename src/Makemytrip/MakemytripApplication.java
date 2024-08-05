package Makemytrip;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakemytripApplication {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\varunkm\\eclipse-workspace\\Introduction\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.className("commonModal__close")).click();
		
//		WebElement roundTripRadioButton = driver.findElement(By.xpath("//li[data-cy='oneWayTrip']"));
//      roundTripRadioButton.click();
         
		WebElement roundTripRadioButton = driver.findElement(By.xpath("//li[@data-cy='roundTrip']"));
        roundTripRadioButton.click();
         
//      WebElement multicityRadioButton = driver.findElement(By.xpath("//li[data-cy='mulitiCityTrip']"));
//      multicityRadioButton.click();
         		
		WebElement fromCityPlace = driver.findElement(By.id("fromCity"));
		fromCityPlace.click();
		
		WebElement fromField = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromField.sendKeys("B");
		
		Actions actions = new Actions(driver);
		
//		actions.pause(Duration.ofSeconds(3)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
//		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
//		
//		WebElement toFieldPlace = driver.findElement(By.id("toCity"));
//		toFieldPlace.click();
//		
//		WebElement toField = driver.findElement(By.xpath("//input[@placeholder='To']"));
//		toField.sendKeys("b");
//		
//		actions.pause(Duration.ofSeconds(3)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		for (int i = 0; i < 5; i++) {
            actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).build().perform();
        }
        actions.sendKeys(Keys.ENTER).build().perform();
        
        Thread.sleep(3000);
        
        WebElement toFieldPlace = driver.findElement(By.id("toCity"));
        toFieldPlace.click();
        
        WebElement toField = driver.findElement(By.xpath("//input[@placeholder='To']"));
        toField.sendKeys("B");
        
        actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
//      WebElement departureDate = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[2]"));
//      departureDate.click();
//        
//      WebElement returnDate = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[8]"));
//      returnDate.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement departureDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@aria-label, 'Aug 15 2024')]")));
        new Actions(driver).moveToElement(departureDate).click().perform();
        
        Thread.sleep(3000);

        WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@aria-label, 'Aug 20 2024')]")));
        new Actions(driver).moveToElement(returnDate).click().perform();
        
        WebElement travellerOption = driver.findElement(By.xpath("//label[@for='travellers']"));
        travellerOption.click();
        
        WebElement numberOfAdults = driver.findElement(By.xpath("//li[@data-cy=\"adults-2\"]"));
        numberOfAdults.click();
        
        WebElement noOfChildrens = driver.findElement(By.xpath("//li[@data-cy=\"children-1\"]"));
        noOfChildrens.click();
        
        WebElement noOfInfants = driver.findElement(By.xpath("//li[@data-cy=\"infants-1\"]"));
        noOfInfants.click();
        
        WebElement travelClass = driver.findElement(By.xpath("//li[@data-cy=\"travelClass-1\"]"));
        travelClass.click();
        
        WebElement applyButton = driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']"));
        applyButton.click();
        
        WebElement specialFareRegular = driver.findElement(By.xpath("//div[text()='Regular']"));
        specialFareRegular.click();
        
//      WebElement specialFareStudent = driver.findElement(By.xpath("//div[text()='Student']"));
//      specialFareStudent.click();
        
//      WebElement specialFareRegular = driver.findElement(By.xpath("//div[text()='Senior Citizen']"));
//      specialFareRegular.click();
        
//      WebElement specialFareArmedForces = driver.findElement(By.xpath("//div[text()='Armed Forces']"));
//      specialFareArmedForces.click();

//      WebElement specialFareDoctorAndNurses = driver.findElement(By.xpath("//div[text()='Doctor and Nurses']"));
//      specialFareDoctorAndNurses.click();
        
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@class,'widgetSearchBtn')]")));
        searchButton.click();
	    }
	}
