package week3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableLearn {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement fromStation = driver.findElementById("txtStationFrom");

		fromStation.clear();
		fromStation.sendKeys("ms");
		fromStation.sendKeys(Keys.TAB);

		WebElement toStation = driver.findElementById("txtStationTo");

		toStation.clear();
		toStation.sendKeys("mdu");
		toStation.sendKeys(Keys.TAB);

		driver.findElementById("chkSelectDateOnly").click();

		Thread.sleep(1000);

		List<WebElement> allTrainList = driver.findElementsByXPath(
				"//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]");
		int trainList = allTrainList.size();
		System.out.println("TrainListCount : " + trainList);

		List<String> eachTrains = new ArrayList<String>();
		for (int i = 2; i <= trainList + 1; i++) {
			String eachName = driver.findElementByXPath(
					"//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" + i + "]/td[2]")
					.getText();
			eachTrains.add(eachName);
		}
		System.out.println(eachTrains);
		int listTrainCount = eachTrains.size();

		Set<String> eachTrn = new LinkedHashSet<String>(eachTrains);
		System.out.println(eachTrn);
		int SetTrainCount = eachTrn.size();

		if (listTrainCount == SetTrainCount) {
			System.out.println("Train has no Duplicate");
		} else {
			System.out.println("Train has Duplicate");
		}

		driver.close();

	}

}
