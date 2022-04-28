package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
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
		//click on the accounts button
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		//click on create account
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		//enter the account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account2");
		//enter the local name
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Lcname");
		//enter the site name 
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Siname");
		//AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10001");
		//click on the create account
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//close the browser
		driver.close();		
	}
}
