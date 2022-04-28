package week2.day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGroundCheckBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open a chrome browse and Load the URL: http://leafground.com/pages/checkbox.html
		driver.get("http://leafground.com/pages/checkbox.html");
		//select the languages known
		driver.findElement(By.xpath("(//input)[1]")).click();
		driver.findElement(By.xpath("(//input)[2]")).click();
		//confirm if the selenium is selected
		if(driver.findElement(By.xpath("(//input)[6]")).isSelected()) {
			System.out.println("The value Selenium is selected");
		}
		//to deselect the selected check box
		List<WebElement> checkboxcount = driver.findElements(By.xpath("//div//label[contains(text(),'DeSelect')]//following-sibling::input"));
		for(int i = 0 ;i<=checkboxcount.size()-1;i++) 
		{
			if(checkboxcount.get(i).isSelected()){
				checkboxcount.get(i).click();
				if(!checkboxcount.get(i).isSelected()) {
					System.out.println("The selected checked box is now deselected");
				}
			}			
		}		
		//to select all the checkbox
		List<WebElement> checkboxcount1 = driver.findElements(By.xpath("//div//label[contains(text(),'Select all')]//following-sibling::input"));
		for(int i = 0 ;i<=checkboxcount1.size()-1;i++) 
		{
			if(!checkboxcount1.get(i).isSelected()){
				checkboxcount1.get(i).click();
				if(checkboxcount1.get(i).isSelected()) {
					System.out.println("The option "+(i+1)+" Checkbox is selected");
				}
			}	
		}
		driver.close();
	}
}