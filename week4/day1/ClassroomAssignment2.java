package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAssignment2 {
	public static void main(String[] args) throws InterruptedException {
		//set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Load the URL: https://erail.in/
		driver.get("https://erail.in/");
		//clear the from text box and enter the vaue MDU
		Thread.sleep(1000);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MDU",Keys.TAB);
		//clear the to text box and enter the vaue TPJ
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("TPJ",Keys.TAB);
		//unselect the sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(1000);
		//find the elements of the table listed
		//creating list to store values
		List<String> trainid = new ArrayList<String>();
		List<String> trainname = new ArrayList<String>();
		//finding the elements in the given table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		//iterating using for loop to get the values of train id and train name from the displayed table
		for(int i=1;i<rows.size();i++) {
			String trainidval = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]//td[1]")).getText();
			//add the value of train id to the list
			trainid.add(trainidval);
			String trainnameval = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]//td[2]")).getText();
			//add the value of train id to the list
			trainname.add(trainnameval);			
		}
		//displaying the output values
		System.out.println(trainid);
		System.out.println(trainname);
		//close the driver
		driver.close();
	}

}
