package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAssignment2 {
	public static void main(String[] args) {
		//set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Load the URL: http://www.leafground.com/pages/Window.html
		driver.get("http://www.leafground.com/pages/Window.html");
		String windowHandle = driver.getWindowHandle();
		//get the title and url
		//click on homepage
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("******************************");
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println(windowHandles);
		List<String> windowHandleslist=new ArrayList<String>(windowHandles);
		//get the windows count
		System.out.println(windowHandles.size());
		//go the second window
		String string = windowHandleslist.get(1);
		//System.out.println(string);
		//switch to second window
		driver.switchTo().window(string);
		//get the url and title
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("*****************************************");
		driver.close();
		driver.switchTo().window(windowHandle);
		//go back to main window
		//get the url and title
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
