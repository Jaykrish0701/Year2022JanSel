package leads;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("Demosalesmanager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Find Leads").click();

		driver.findElementByXPath("//span[text()='Email']").click();

		driver.findElementByName("emailAddress").sendKeys("@test.com");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(1000);

		String FrstLead = driver.findElementByXPath("//a[text()='TestCompany']").getText();

		System.out.println("The First Resulting lead is :" + FrstLead);

		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();

		String Title = driver.getTitle();

		System.out.println("The Title of the Page is : " + Title);

		driver.findElementByClassName("smallSubmit").click();

		driver.close();

	}

}
