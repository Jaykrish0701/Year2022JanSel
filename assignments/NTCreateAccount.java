package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementById("username").sendKeys("Demosalesmanager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		 driver.findElementByClassName("decorativeSubmit").click();
		 
		 driver.findElementByLinkText("CRM/SFA").click();
		 
		 driver.findElementByLinkText("Accounts").click();
		 
		 driver.findElementByLinkText("Create Account").click();
		 
		 WebElement wc = driver.findElementByName("currencyUomId");
		 
		 Select ss = new Select (wc);
		 
		 ss.selectByValue("INR");
		 
		 driver.findElementByName("description").sendKeys("NRI Account");
		 
		 driver.findElementByName("groupNameLocal").sendKeys("Selenium");
		 
		 driver.findElementByName("officeSiteName").sendKeys("Chennai");

		driver.findElementByXPath("(//input[@class='inputBox'])[5]").sendKeys("120000");
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
		String Error = driver.findElementByXPath("//li[@class='errorMessage']").getText();
		
		System.out.print("The Error Message is : " +Error);
		
		driver.close();
		
		
	}

}
