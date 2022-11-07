package week3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrameAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElementByXPath("//button[text()='Try it']").click();

		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Jay Krish");
		alert.accept();

		String text = driver.findElementByXPath("//*[@id='demo']").getText();
		System.out.println(text);

		driver.close();

	}

}
