package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TablePrintValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Load the URL: https://html.com/tags/table/
		driver.get("https://html.com/tags/table/");
		//get the rowelements in the table
		List<WebElement> rowelement =driver.findElements(By.xpath("(//table)[1]//tr"));
		int rowcount =rowelement.size();
		System.out.println(rowcount);
		//2. You have to print the respective values based on given Library
		System.out.println(rowelement.get(0).getText());
		System.out.println("--------------------------------");
		System.out.println(rowelement.get(1).getText());
		driver.close();
	}
}
