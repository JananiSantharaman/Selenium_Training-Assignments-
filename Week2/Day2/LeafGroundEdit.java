package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGroundEdit {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browse and Load the URL: http://leafground.com/pages/Edit.html
		driver.get("http://leafground.com/pages/Edit.html");
		//enter the email id in the edit box
		driver.findElement(By.id("email")).sendKeys("jananisantharaman@gmail.com");
		//"Append value in the editbox"
		WebElement appendeditbox = driver.findElement(By.xpath("//input[contains(@value,'Append')]"));
		System.out.println(appendeditbox.getAttribute("value"));
		driver.findElement(By.xpath("//input[contains(@value,'Append')]")).sendKeys("value1");
		String valueafterapend =appendeditbox.getAttribute("value");
		System.out.println("The value after append - " + valueafterapend);
		//get default value
		WebElement defaultvalueeditbox = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		String defaultvalue = defaultvalueeditbox.getAttribute("value");
		System.out.println("The default value in the edit box is - "+defaultvalue);
		//clear the existing
		WebElement ClearmeEditbox = driver.findElement(By.xpath("//input[contains(@value,'Clear')]"));
		String Clearmevalue = ClearmeEditbox.getAttribute("value");
		if (Clearmevalue!=null) {
			ClearmeEditbox.clear();
			if(ClearmeEditbox.getAttribute("value").isBlank()) {
				System.out.println("The value is cleared");
			}
		}
		//check if the edit box is diabled
		WebElement Disablededitbox = driver.findElement(By.xpath("//label[contains(@for,'disabled')]/..//input"));
		if(Disablededitbox.isEnabled()==false) {	
			System.out.println("The edit box is diabled");
			driver.close();
		}
	}	

}