package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandle {
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//button[@class='btn btn-primary']").click();
	
	driver.findElementByLinkText("FLIGHTS").click();
	
	Set<String> windowHandles = driver.getWindowHandles();
	List<String>handlelist =  new ArrayList<String>(windowHandles);
	
	String secondwindow = handlelist.get(1);
	
	driver.switchTo().window(secondwindow);
	
	driver.findElementByXPath("//button[@class='izooto-optin--cta izooto-optin--cta-later']").click();
	
	WebElement contactus = driver.findElementById("dropdown10");
	contactus.click();
	
	String text = driver.findElementByXPath(" //*[text()=' flights@irctc.co.in']").getText();
	System.out.println("Email Id is : "+text);
	
	driver.switchTo().window(handlelist.get(0));
	driver.close();
	
	}
}
