package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browse and Load the URL: http://leafground.com/pages/Button.html
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//a[contains(@href,'Button')]")).click();
		//get the position of the button
		System.out.println("The position of the button is "+"X= "+driver.findElement(By.id("position")).getLocation().getX()
				+" Y ="+driver.findElement(By.id("position")).getLocation().getY());
		//get the color of the button
		System.out.println("The colour code for the button is - "+driver.findElement(By.id("color")).getCssValue("background-color"));
		//find the size of the button
		System.out.println("The size of the button is "+ "Width - "+driver.findElement(By.id("size")).getSize().getWidth()+" Height - "+driver.findElement(By.id("size")).getSize().getHeight());
	}

}
