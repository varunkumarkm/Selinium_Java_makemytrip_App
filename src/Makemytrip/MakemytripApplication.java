package Makemytrip;

import java.time.Duration;
import org.openqa.selenium.By;
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
         
//      WebElement multicityRadioButton = driver.findElement(By.xpath("//li[@data-cy='mulitiCityTrip']"));
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
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        WebElement departureDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@aria-label, 'Aug 28 2024')]")));
        new Actions(driver).moveToElement(departureDate).click().perform();
        
        Thread.sleep(3000);

        WebElement returnDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@aria-label, 'Aug 30 2024')]")));
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
        
        driver.manage().deleteAllCookies();
        driver.navigate().refresh();
        
        driver.get("https://www.makemytrip.com/flight/search?itinerary=BLR-BOM-28/08/2024_BOM-BLR-30/08/2024&tripType=R&paxType=A-2_C-1_I-1&intl=false&cabinClass=PE&ccde=IN&lang=eng");
        
        driver.get("https://www.makemytrip.com/flight/reviewDetails/?itineraryId=a08b28b8e1f6af4aa5a8c0ccff3775103027598a&crId=938efdfd-ce2a-4404-85f6-9ad10dc23f74&cur=INR&rKey=RKEY:84176275-6692-4d5e-98e8-72084b61a579:12_0~~~RKEY:84176275-6692-4d5e-98e8-72084b61a579:31_0&ccde=IN&xflt=eyJjIjoiUEUiLCJwIjoiQS0yX0MtMV9JLTEiLCJ0IjoiIiwicyI6IkJMUi1CT00tMjAyNDA4MjgkQk9NLUJMUi0yMDI0MDgzMCIsIkl0aW5lcmFyeUlkIjoiQkxSLUJPTS0yOC8wOC8yMDI0X0JPTS1CTFItMzAvMDgvMjAyNCIsIlRyaXBUeXBlIjoiUiIsIlBheFR5cGUiOiJBLTJfQy0xX0ktMSIsIkludGwiOmZhbHNlLCJDYWJpbkNsYXNzIjoiUEUiLCJDY2RlIjoiaW4iLCJQZnQiOiIiLCJQYWZzIjoiIiwiRm9yd2FyZEZsb3dSZXF1aXJlZCI6dHJ1ZSwiQ21wSWQiOiIifQ==");
        
        WebElement addLaguage = driver.findElement(By.className("addBtn"));
        addLaguage.click();

        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 5 KG']/following::span[@class='qtyActions'][1]"));
        bangloreToMumbai.click();
        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 10 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 15 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 20 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 25 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
//        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 30 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
//        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 35 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
//        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 45 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
//        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 55 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
//        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 60 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
//        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 65 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
        
//        WebElement bangloreToMumbai = driver.findElement(By.xpath("//span[text()='Additional 96 KG']/following::span[@class='qtyActions'][1]"));
//        bangloreToMumbai.click();
        
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("OverlayGreyBg")));
        
        WebElement mumbaiBengaluruOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'ancillaryTabDtls') and contains(text(), 'Mumbai-Bengaluru')]")));
        mumbaiBengaluruOption.click();
        
        WebElement mumbaiToBanglore = driver.findElement(By.xpath("//span[text()='Additional 10 KG']/following::span[@class='qtyActions'][1]"));
        mumbaiToBanglore.click();
        
        Thread.sleep(3);

        WebElement doneButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'DONE')]")));
        doneButton.click();
        
//        WebElement freeDataChangeChuckbox = driver.findElement(By.xpath("//input[@data-testid='zc-fdc-checkbox_0']"));
//        freeDataChangeChuckbox.click();
        
//        WebElement zeroCancellation = driver.findElement(By.xpath("//input[@data-testid='zc-fdc-checkbox_1']"));
//        zeroCancellation.click();
        
//        WebElement flexiFly = driver.findElement(By.xpath("//input[@data-testid='zc-fdc-checkbox_2']"));
//        flexiFly.click();
        
        WebElement radioButton = driver.findElement(By.xpath("(//span[contains(@class, 'customRadioBtn sizeSm primary')]/input[@type='radio'])[1]"));
        radioButton.click();
        
        Thread.sleep(3000);
        
        WebElement tripSecure = driver.findElement(By.xpath("(//span[contains(@class, 'customRadioBtn sizeSm primary')]/input[@type='radio'])[4]"));
        tripSecure.click();
        
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("OverlayGreyBg")));

        WebElement addAdult1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='+ ADD NEW ADULT']")));
        addAdult1.click();
        
        WebElement firstAndMiddleName = driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[1]"));
        firstAndMiddleName.sendKeys("mahesh");
        
        WebElement lastName = driver.findElement(By.xpath("(//input [@placeholder='Last Name'])[1]"));
        lastName.sendKeys("M K");
        
        WebElement genderSelectMale1 = driver.findElement(By.xpath("(//label[span[text()='MALE']])[1]"));
        genderSelectMale1.click();
        
//      WebElement genderSelectFemale1 = driver.findElement(By.xpath("(//label[span[text()='FEMALE']])[1]"));
//      genderSelectFemale1.click();
        
        Thread.sleep(4000);
        
        WebElement addAdult2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='+ ADD NEW ADULT']")));
        addAdult2.click();
        
        WebElement firstAndMiddleName1 = driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[2]"));
        firstAndMiddleName1.sendKeys("shalini");
        
        WebElement lastName1 = driver.findElement(By.xpath("(//input [@placeholder='Last Name'])[2]"));
        lastName1.sendKeys("R K");
        
//        WebElement genderSelectMale2 = driver.findElement(By.xpath("(//label[input[@value='MALE']])[2]"));
//        genderSelectMale2.click();
        
        WebElement genderSelectFemale2 = driver.findElement(By.xpath("(//label[input[@value='FEMALE']])[2]"));
        genderSelectFemale2.click();
        
        Thread.sleep(3000);
        
        WebElement addNewChild = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='+ ADD NEW CHILD']")));
        addNewChild.click();
        
        Thread.sleep(3000);
        
        WebElement firstAndMiddleNameChild = driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[last()]"));
        firstAndMiddleNameChild.sendKeys("Charan");
        
        Thread.sleep(3000);
        
        WebElement lastNameChild = driver.findElement(By.xpath("(//input [@placeholder='Last Name'])[last()]"));
        lastNameChild.sendKeys("Veer");
        
        WebElement genderSelectChild = driver.findElement(By.xpath("(//label[span[text()='MALE']])[last()]"));
        genderSelectChild.click();
       
        WebElement addNewInfant = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='+ ADD NEW INFANT']")));
        addNewInfant.click();
        
        Thread.sleep(3000);

        WebElement firstAndMiddleNameInfant = driver.findElement(By.xpath("(//div[contains(@class, 'relative')]//input[@placeholder='First & Middle Name'])[4]"));
        firstAndMiddleNameInfant.sendKeys("harpita");

        WebElement lastNameInfant =  driver.findElement(By.xpath("(//input [@placeholder='Last Name' and contains(@class, 'tvlrInput')])[4]"));
        lastNameInfant.sendKeys("kour");

        WebElement genderSelectInfant =  driver.findElement(By.xpath("(//span[contains(@class, 'selectTabText') and text()='FEMALE']/parent::label)[4]"));
        genderSelectInfant.click();
        
        Thread.sleep(3000);
        
        WebElement dayDropdown = driver.findElement(By.xpath("(//div[@class='dropdown__indicators css-1wy0on6'])[6]"));
        dayDropdown.click();
        actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
        Thread.sleep(3000);
        
        WebElement monthDropdown = driver.findElement(By.xpath("(//div[@class='dropdown__indicators css-1wy0on6'])[7]"));
        monthDropdown.click();
        actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
        
        Thread.sleep(3000);
        
        WebElement yearDropdown = driver.findElement(By.xpath("(//div[@class='dropdown__indicators css-1wy0on6'])[8]"));
        yearDropdown.click();
        actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).build().perform();
        
        Thread.sleep(3000);
        
        WebElement countryCodeDropdown = driver.findElement(By.xpath("(//div[@class='dropdown__indicators css-1wy0on6'])[10]"));
        countryCodeDropdown.click();
        
        WebElement mobileNumber = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
        mobileNumber.sendKeys("8876567876");
        
        Thread.sleep(3000);
        
        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Email']")));
        email.sendKeys("varun@gmail.com");
        
        WebElement emailSelect = driver.findElement(By.xpath("(//div[contains(@class, 'emailId')])[2]"));
        emailSelect.click();
        
        Thread.sleep(3000);
        
        WebElement selectStateDropdown = driver.findElement(By.xpath("//input[@id='dt_state_gst_info' and contains(@class, 'dropdownFieldWpr__input')]"));
        selectStateDropdown.click();
        
        WebElement StateSelection = driver.findElement(By.xpath("//li[text()='Karnataka']"));
        StateSelection.click();
        
        WebElement confirmCheckbox = driver.findElement(By.xpath("//span[@class='checkboxWpr']/input[@id='cb_gst_info' and @type='checkbox']/following-sibling::b"));
        confirmCheckbox.click();
        
        WebElement continueButton = driver.findElement(By.xpath("//button[text()='Continue']"));
        continueButton.click();
        
        Thread.sleep(3000);
        
        WebElement confirmButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='detailsPopupFooter']/button[text()='CONFIRM']")));
        confirmButton.click();
        
        Thread.sleep(3000);
        
        WebElement skipSeatSelection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='linkText' and text()='Skip to add-ons']")));
        skipSeatSelection.click();
        
        Thread.sleep(3000);
        
        WebElement proceedToPay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 appendTop20' and text()='Proceed to pay']")));
        proceedToPay.click();
        
        System.out.println("completed successfully working as expected");
        
	    }
	}

































