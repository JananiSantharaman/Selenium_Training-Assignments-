package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class NTCreateAccount {
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
		//7. Select preferred currency as Indian Rupee using SelectByValue
		Select newcurrency =new Select(driver.findElement(By.xpath("//select[@id='currencyUomId']")));
		newcurrency.selectByValue("INR");
		//driver.findElement(By.id("currencyUomId")).sendKeys("INR - Indian Rupee");
		//8.Enter the Description text as "NRI Account"
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("NRI Account");
		//9.enter the local name
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Lcname");
		//9.enter the site name 
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Siname");
		//10.AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("10001");
		//11.click on the create account
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//12.check the error message displayed
		String colorvalue = (driver.findElement(By.xpath("//div[@class='messages']")).getCssValue("color"));
		if(colorvalue.trim().equals("rgba(0, 0, 0, 1)")) {
			System.out.println(driver.findElement(By.xpath("//div[@class='messages']")).getText());
		}
		driver.close();
	}
}
