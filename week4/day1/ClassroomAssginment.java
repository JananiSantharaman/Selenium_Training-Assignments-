package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomAssginment {
	public static void main(String[] args) {
		//set up the driver and create ChromeDriver Instance 	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Load the URL: http://leaftaps.com/opentaps/control/main
		driver.get("http://leaftaps.com/opentaps/");
		//Enter Username as Demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter Password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on  Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on the create lead tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click on Create Lead Menu
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//Enter company name, first name, last name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SampleCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Janani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Santharaman");
		//using send keys to select the dropdown
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Employee");
		//find the element of marketing  dropdown
		WebElement marketingdropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		//select the class by using visible text
		Select marketing = new Select(marketingdropdown);
		marketing.selectByVisibleText("Automobile");
		//find the preferred currecy dropdown element
		WebElement preferredcurrencydropdown = driver.findElement(By.id("createLeadForm_currencyUomId"));
		//access the select class
		Select source = new Select(preferredcurrencydropdown);	
		//select using index starts from 1
		source.selectByIndex(1);
		//marketing 
		WebElement industrydropdown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		//select the class by using visible text
		Select industryselect = new Select(industrydropdown);
		//get option method helps to get the all the options in the dropdown values (webelement)
		List<WebElement> l = industryselect.getOptions();				
		List<String> list = new ArrayList<String>();
		for (WebElement eachoptions : l) {
			list.add(eachoptions.getText());
		}
		System.out.println(list);
		//select the value from dropdown
		industryselect.selectByValue("IND_INSURANCE");
		//ownership dropdown
		WebElement ownershipdropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//to select the last value in ownership dropdown
		Select ownershipselect = new Select(ownershipdropdown);
		ownershipselect.selectByIndex(ownershipselect.getOptions().size()-1);
		//to select the country
		//driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("United States");
		//to select the state
		WebElement generalstatdropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateselect = new Select(generalstatdropdown);
		stateselect.selectByIndex(2);		
		//Click on Create Lead button
		driver.findElement(By.className("smallSubmit")).click();
		//Get the Lead ID text and print
		String textval = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String CompanyId = (textval.replaceAll("[A-Za-z]", ""));
		System.out.println("The company ID - " + CompanyId);
		driver.close();
	}
}
