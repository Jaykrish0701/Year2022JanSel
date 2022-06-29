package leads;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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

		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Harish");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(1000);

		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]").click();

		String title = driver.getTitle();

		System.out.println("The Title of the page is : " + title);

		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();

		driver.findElementByXPath("//a[text()='Edit']").click();

		Thread.sleep(1000);

		driver.findElementById("updateLeadForm_companyName").clear();

		driver.findElementById("updateLeadForm_companyName").sendKeys("CAPG");

		driver.findElementByClassName("smallSubmit").click();

		driver.close();

	}

}
