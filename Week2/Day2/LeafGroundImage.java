package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGroundImage {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browse and Load the URL: http://leafground.com/pages/Image.html
		driver.get("http://leafground.com/pages/Image.html");
		//click on the home image and go to homepage
		driver.findElement(By.xpath("//img[contains(@src,'home')]")).click();
		if(driver.getTitle().contains("Selenium Playground")) {
			System.out.println("The User is navigated to the homepage");
			driver.findElement(By.xpath("//a[contains(@href,'Image')]")).click();
		}
		//check if the image is broken
		String brokenimagesrc = driver.findElement(By.xpath("(//img)[3]")).getAttribute("src");
		if(brokenimagesrc.contains("jpg")) {
			System.out.println("The image is broken");
		}
		//to click on the image using keyboard or mouse
		WebElement image4 = driver.findElement(By.xpath("//img[contains(@src,'keyboard')]"));
		/*String attributeval = image4.getAttribute("onclick");
		if(attributeval.contains("home")) {
			driver.get("http://leafground.com/home.html");
			if(driver.getTitle().contains("Selenium Playground")) {
				System.out.println("The User is navigated to the homepage");
				driver.findElement(By.xpath("//a[contains(@href,'Image')]")).click();
			}
		}*/
		//to click on the image using keyboard or mouse
		Actions actions = new Actions(driver);
		actions.moveToElement(image4);
		actions.click().perform();
		if(driver.getTitle().contains("Selenium Playground")) {
			System.out.println("The User is navigated to the homepage upon mouse click");
		}
		driver.close();
	}
}