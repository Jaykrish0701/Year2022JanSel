package leads;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/main");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("Demosalesmanager");

		driver.findElementByName("PASSWORD").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();

		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("CG");

		driver.findElementById("createLeadForm_firstName").sendKeys("Harish");

		driver.findElementById("createLeadForm_lastName").sendKeys("D");

		driver.findElementByClassName("smallSubmit").click();

		String TitlePage = driver.getTitle();

		System.out.println("Title of the Page : " + TitlePage);

		driver.close();

	}

}
