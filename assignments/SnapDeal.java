package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);		//browser Notifications
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		WebElement mens = driver.findElementByXPath("//span[@class='catText']");
		Actions builder = new Actions(driver);
		
		WebElement shirts = driver.findElementByXPath("//span[text()='Shirts']");
		builder.moveToElement(mens).moveToElement(shirts).click().perform();
		 
		WebElement firstShirt = driver.findElementByXPath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']");
		builder.moveToElement(firstShirt).perform();
		 
		 
		WebElement first = driver.findElementByXPath("//div[@class='col-xs-6  favDp product-tuple-listing js-tuple ']");
		WebElement Quickview = driver.findElementByXPath("//div[@class='center quick-view-bar  btn btn-theme-secondary  ']");
		builder.moveToElement(first).moveToElement(Quickview).click().perform();
		
		driver.findElementByXPath(" //a[@class=' btn btn-theme-secondary prodDetailBtn']").click();
		
		String title = driver.getTitle();
		System.out.println("The Title of the Page is  : "+title);
		
		Thread.sleep(1000);
		
		driver.findElementByXPath("//span[@class='intialtext']").click();
		
	        driver.quit();
		 	
	}

}
