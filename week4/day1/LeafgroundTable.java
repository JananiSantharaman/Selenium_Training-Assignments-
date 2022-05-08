package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafgroundTable {
	public static void main(String[] args) throws InterruptedException {
		//set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Load the URL: http://www.leafground.com/pages/table.html
		driver.get("http://www.leafground.com/pages/table.html");
		//get the table
		WebElement table =driver.findElement(By.xpath("//table"));
		//get the row count
		List<WebElement> rowelement =table.findElements(By.xpath("//tr"));
		int rowcount =rowelement.size();
		System.out.println("The total rows in the table is - "+rowcount);
		//get the column count
		int colcount =table.findElements(By.xpath("//tr[1]//th")).size();
		System.out.println("The total coloums in the table is - " +colcount);
		//iterate using the rowcount to get the data
		for(int i=2;i<rowcount;i++) {
			WebElement getthevalue=driver.findElement(By.xpath("//table//tr["+i+"]//td[1]")); 
			//condition to get the column vaules next Learn to interact with Elements
			if(getthevalue.getText().equals("Learn to interact with Elements")){
				//	System.out.println(driver.findElement(By.xpath("//table//tr["+i+"]//td[2]")).getText());
			}
		}
		List<String>  progress= new ArrayList<String>();
		//get the values of progress using rowcount
		for(int j=2;j<rowcount+1;j++) {
			String progressval = driver.findElement(By.xpath("//table//tr["+j+"]//td[2]")).getText();
			if(!(progressval).equals("100%")) {
				progress.add(progressval);
			}
		}
		Collections.sort(progress);
		String leastval = progress.get(0);
		for(int k=2;k<rowcount+1;k++) {
			String leastvalue = driver.findElement(By.xpath("//table//tr["+k+"]//td[2]")).getText();
			if(leastvalue.equals(leastval)) {
				driver.findElement(By.xpath("//table//tr["+k+"]//td[3]")).click();
				if(driver.findElement(By.xpath("//table//tr["+k+"]//input")).isSelected()){
					System.out.println("The vital task for the least completed progress is selected");
				}
			}
		}
		driver.close();

	}
}