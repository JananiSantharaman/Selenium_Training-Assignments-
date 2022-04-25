package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browser
		//Load the URL: http://leaftaps.com/opentaps/control/main
		driver.get("http://leaftaps.com/opentaps/");
		//Enter Username as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter Password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on  Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on the accounts button
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		//Click on Find Accounts
		driver.findElement(By.linkText("Find Accounts")).click();
		//Enter AccountName as "Credit Limited Account" 
		driver.findElement(By.xpath("//div[@class='x-form-item x-tab-item']//input[@name='accountName']")).sendKeys("Credit Limited Account");
		//Click on Find Accounts using xpath Locator
		driver.findElement(By.xpath("//button[text() ='Find Accounts']")).click();
		//click on the account displayed fo the selected search
		driver.findElement(By.linkText("Credit Limited Account")).click();
		//click on the edit button
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Edit']")).click();
		//10. Get the Text of Account Name and verify 
		WebElement accountname = driver.findElement(By.xpath("//input[@id='accountName']"));
		String valuegot = accountname.getAttribute("value");
		if(valuegot.trim().equals("Credit Limited Account")) {
			System.out.println("The account name is displayed correctly ");

		}
		WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
		System.out.println(description.getAttribute("value"));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
