package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGroundLink {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browse and Load the URL: http://leafground.com/pages/Link.html
		driver.get("http://leafground.com/pages/Link.html");
		//click on the home page
		driver.findElement(By.linkText("Go to Home Page")).click();
		if(driver.getTitle().contains("Selenium Playground")) {
			System.out.println("The User is navigated to the homepage");
		}
		driver.findElement(By.xpath("//a[contains(@href,'Link')]")).click();
		//find the link page without clicking the link
		String Linkvalue = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(Linkvalue);
		//to check if the link is broken
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String brokenLinkvalue = driver.getTitle();
		if(brokenLinkvalue.contains("404")) {
			System.out.println("The link is broken");
		}
		//go to home page interact with same link name
		//'''''

		//to get the number of links in the given page
		driver.get("http://leafground.com/pages/Link.html");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("The total number of links in the given page is - "+links.size());
		driver.close();
	}
}

