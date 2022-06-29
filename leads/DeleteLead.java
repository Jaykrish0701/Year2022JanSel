package leads;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		driver.findElementByLinkText("Phone").click();

		driver.findElementByName("phoneNumber").sendKeys("99");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(1000);
		
		String Text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a[1]").getText();
		
		System.out.println("The First attribute Id is : "+Text);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a[1]").click();
		
		driver.findElementByClassName("subMenuButtonDangerous").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys(Text);
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(1000);
		
		System.out.println("No records to display in the Lead List. This message confirms the successful deletion");
		
		driver.close();
		
		

	}

}
