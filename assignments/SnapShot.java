package week3;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapShot {
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =  new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Date date = new Date();
		String newDate = date.toString();
		String newDateAndTime = newDate.replaceAll(":", "-");
		
		 //WebElement image = driver.findElementByXPath("//div[@class='trendingProd product-relative dp-widget-link col-xs-5 favDp']");    // WebElement Page Screenshot
		 //File source = image.getScreenshotAs(OutputType.FILE);
		 
		 
		File source = driver.getScreenshotAs(OutputType.FILE);    //Full page Screenshot
		
		
		File target = new File("./Snaps/Screenshot_"+newDateAndTime+".png");
		FileUtils.copyFile(source, target);
		
		driver.close();
			
		
	}

}
