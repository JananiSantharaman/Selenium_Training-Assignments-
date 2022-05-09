package week4.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropdown {
	//set up the driver and create ChromeDriver Instance 	
	public static void main(String[]arg) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//2. Load the URL: http://leaftaps.com/opentaps/control/main
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		//get the dropdown element
		WebElement findElement = driver.findElement(By.id("dropdown1"));
		//use select method to create ano object
		Select Dropdown1 = new Select(findElement);
		//select the dropdown value by index
		Dropdown1.selectByIndex(1);
		//select the dropdown value by text
		WebElement findElement2 = driver.findElement(By.name("dropdown2"));
		Select dropdown2 = new Select(findElement2);
		dropdown2.selectByVisibleText("Appium");
		//select the dropdown value by Value
		WebElement findElement3 = driver.findElement(By.id("dropdown3"));
		Select Dropdown3 = new Select(findElement3);
		Dropdown3.selectByValue("3");
		//get the total number of option in the dropdown using get options
		WebElement findElement4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select Dropdown4 = new Select(findElement4);
		List<WebElement> Dropdown4options = Dropdown4.getOptions();
		System.out.println("The number of options in the dropdown are : " +Dropdown4options.size());
		for (WebElement dropdownoptionval : Dropdown4options) {
			System.out.println(dropdownoptionval.getText());
		}
		System.out.println("------------------------------");
		driver.findElement(By.xpath("(//select)[5]")).sendKeys("UFT/QTP");
		//select multiple values in the list box
		WebElement findElement5 = driver.findElement(By.xpath("(//select)[6]"));
		Select Dropdown5 = new Select(findElement5);
		Dropdown5.selectByIndex(2);
		Dropdown5.selectByIndex(3);
		//check if the multiple values are selected
		List<WebElement> allSelectedOptions = Dropdown5.getAllSelectedOptions();
		for (WebElement selectedvalues : allSelectedOptions) {
			System.out.println(selectedvalues.getText());
		}
		driver.close();
	}	

}
