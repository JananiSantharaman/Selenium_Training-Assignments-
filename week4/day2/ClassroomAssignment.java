package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAssignment {
	public static void main(String[] args) throws InterruptedException {
		//set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Load the URL: https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		Thread.sleep(1000);
		//click on the alert box button
		driver.switchTo().frame(1); 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//click on the alert box
		Alert alert1 = driver.switchTo().alert();
		String text =alert1.getText();
		System.out.println("The alert contains text -"+text);
		alert1.sendKeys("Janani");
		alert1.accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
		if(driver.findElement(By.id("demo")).getText().contains("Janani")){
			System.out.println("The entered value is printer");
		}
		//goes to the webpage
		//	driver.switchTo().defaultContent();
		driver.close();
	}
}

