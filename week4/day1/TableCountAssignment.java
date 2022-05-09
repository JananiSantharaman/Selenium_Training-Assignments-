package week4.day1;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TableCountAssignment {

	public static void main(String[] args) {
		//set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Load the URL: https://html.com/tags/table/
		driver.get("https://html.com/tags/table/");
		//get the table count in the page
		int tablecount = driver.findElements(By.xpath("(//table)")).size();
		System.out.println("Total number of tables in the page is - "+tablecount);
		System.out.println("-------------------------------------------------");
		for(int i= 1;i<=tablecount;i++) {
			//get the row count of table
			int table1rowcount =driver.findElements(By.xpath("(//table)["+i+"]//tr")).size();
			System.out.println("The total rows in the table in table "+i+" is - "+table1rowcount);
			//get the column count of table
			int table1colcount =driver.findElements(By.xpath("(//table)["+i+"]//th")).size();
			System.out.println("The total column in the table "+i+" is - "+table1colcount);
			System.out.println("-------------------------------------------------");
		}
		driver.close();		
	}
}
