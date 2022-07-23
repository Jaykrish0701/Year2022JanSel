package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/main");

		driver.manage().window().maximize();

		driver.findElementById("username").sendKeys("Demosalesmanager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Accounts").click();

		driver.findElementByLinkText("Find Accounts").click();

		driver.findElementByXPath("(//input[@name='accountName'])[2]").sendKeys("Credit Limited Account");

		driver.findElementByXPath("//button[text()='Find Accounts']").click();

		Thread.sleep(2000);

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

		driver.findElementByXPath("(//a[@class='subMenuButton'])[1]").click();

		String accname = driver.findElementByXPath("//input[@id='accountName']").getAttribute("value"); // getAttribute(attributename)

		System.out.println("Account Name is  : " + accname);

		String description = driver.findElementByName("description").getText();

		System.out.println("Description is  : " + description);

		String title = driver.getTitle();

		System.out.println("Title is  : " + title);

		driver.close();

	}

}
