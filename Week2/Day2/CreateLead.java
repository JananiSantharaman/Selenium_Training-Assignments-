package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//1. Open a chrome browser
		//2. Load the URL: http://leaftaps.com/opentaps/control/main
		driver.get("http://leaftaps.com/opentaps/");
		//3. Enter Username as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//4. Enter Password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//5. Click on  Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//6. Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//7. Click on Leads tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//8. Click on Create Lead Menu
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//9. Enter company name, first name, last name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SampleCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Santharaman");
		//10. Click on Create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		//11. Get the Lead ID text and print
		String textval = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String CompanyId = (textval.replaceAll("[A-Za-z]", ""));
		System.out.println("The company ID - " + CompanyId);
		driver.close();
	}
}	
