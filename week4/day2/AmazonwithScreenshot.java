package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonwithScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//search as oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		Thread.sleep(2000);
		//Get the price of the first product
		String price = driver.findElement(By.xpath("(//div[@class='a-section'])[1]//span[@class='a-price-whole']")).getText();
		System.out.println("The price of the first listed product is : "+price);
		System.out.println("--------------------------------------------");
		// Print the number of customer ratings for the first displayed product
		System.out.println(driver.findElement(By.xpath("//div//span[text()='RESULTS']//following::span[contains(text(),'stars')][1]")).getText());
		System.out.println("--------------------------------------------");
		//Click the first text link of the first image
		driver.findElement(By.xpath("//div//span[text()='RESULTS']//following::h2[1]//a")).click();
		//switch to the second window
		List<String> windowHandleslist2=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowHandleslist2.get(1));
		//Take a screen shot of the product displayed
		File srcfile = driver.getScreenshotAs(OutputType.FILE);
		File destinationfile =new File("./snaps/sample2.png");
		FileUtils.copyFile(srcfile,destinationfile);
		//check if the file is place in the destinationfolder
		if(FileUtils.getFile(destinationfile).exists()) {
			System.out.println("The screenshot is placed in the given path");
			System.out.println("--------------------------------------------");
		}
		//click on the add to cart button
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(3000);
		//check if the subtotal matches the price
		String cartvalue = driver.findElement(By.xpath("//span//b[contains(text(),'Cart subtotal')]//following::span//span")).getText();
		if(cartvalue.replaceAll("\\D", "").contains(price.replaceAll("\\D", ""))) {
			System.out.println("The cart price matches with the phone price");
			System.out.println("--------------------------------------------");
		}
		//close all the windows
		driver.quit();
	}
}
