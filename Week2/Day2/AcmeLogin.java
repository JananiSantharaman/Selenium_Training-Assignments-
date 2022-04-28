package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browse and Load the URL: https://acme-test.uipath.com/login
		driver.get("https://acme-test.uipath.com/login");
		//Enter Username as Demosalesmanager
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		//Enter Password as crmsfa
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		//Click on  Login Button
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		//get the title of the page and display the same
		System.out.println(driver.getTitle());
		//click on logout button
		driver.findElement(By.linkText("Log Out")).click();
		driver.close();
	}
}
