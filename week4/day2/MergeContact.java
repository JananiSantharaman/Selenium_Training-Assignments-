package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		//1.set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String windowHandle = driver.getWindowHandle();
		//2.Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/");
		//3. Enter Username as Demosalesmanager
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		//4. Enter Password as crmsfa
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//5. Click on  Login Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//6. Click on CRM/SFA link
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//div[@id='label']//a")).click();
		//5. Click on contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		//6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//7. Click on Widget of From Contact
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif'][1]")).click();
		//get the windows
		Set<String> windowHandles = driver.getWindowHandles();
		//add to the list 
		List<String> windowHandleslist=new ArrayList<String>(windowHandles);
		//go the second window
		String secondwindow = windowHandleslist.get(1);
		//switch to second window
		driver.switchTo().window(secondwindow);
		//8. Click on First Resulting Contact
		Thread.sleep(1000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]//td[1]//a")).click();	
		driver.switchTo().window(windowHandle);
		Thread.sleep(1000);
		// 9. Click on Widget of To Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		// 10. Click on Second Resulting Contact
		Set<String> windowsavl = driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(windowsavl);
		driver.switchTo().window(windows.get(1));
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//tr[1]//td[1]//a")).click();
		driver.switchTo().window(windowHandle);
		// 11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//12. Accept the Alert
		Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		Thread.sleep(2000);
		//13. Verify the title of the page
		System.out.println(driver.getTitle());
		if(driver.getTitle().contains("View Contact")) {
			System.out.println("The merge of two contacts was successful");
		}
		driver.quit();
	}
}
