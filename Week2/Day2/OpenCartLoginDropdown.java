package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class OpenCartLoginDropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browse and Load the URL: https://www.opencart.com/index.php?route=account/register
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Janani");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Santharaman");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("India");
		if(driver.findElement(By.xpath("//input[@id='input-country']")).getAttribute("value").contains("India")) {
			System.out.println("The given value is selected");
		}
		//driver.close();
	}
}