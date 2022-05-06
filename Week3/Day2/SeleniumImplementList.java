package week3.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumImplementList {
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriverManager.chromedriver().setup();
		// Disable Notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		// ChromeDriver Instance 		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Open a chrome browse and Load the https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		WebElement	searchbox = driver.findElement(By.xpath("//input[@name='searchVal']"));
		searchbox.sendKeys(Keys.ENTER);
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		//5. Print the count of the items Found. 
		System.out.println("A total number of := "+(driver.findElement(By.xpath("//div[@class='length']")).getText()));
		Thread.sleep(3000);
		//6. Get the list of brand of the products displayed in the page and print the list.
		driver.findElement(By.xpath("(//div[@class='facet-head '])[2]")).click();
		driver.findElement(By.xpath("(//div[@id='verticalsizegroupformat'])[2]")).click();
		Thread.sleep(1000);
		List<WebElement> listelement = driver.findElements(By.xpath("//input[@name='brand']"));
		for (int i=0;i<=listelement.size()-1;i++) {
			String value1 = listelement.get(i).getAttribute("value");
			System.out.println(value1);
		}
		System.out.println("-------------------------------------------------------------");	
		//7. Get the list of names of the bags and print it
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click(); 
		List<WebElement> listbagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println(listbagname.size());
		for (int j=0;j<=listbagname.size()-1;j++) {
			String value2 = listbagname.get(j).getText();
			System.out.println(value2);	

		}
		driver.close();
	}

}