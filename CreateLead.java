package Week2.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//String driverpath=System.getProperty("Webdriver.chrome.driver");
		//System.out.println(driverpath);
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximixe the window
		
		driver.manage().window().maximize();
		
		//username
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//pwd
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//login
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click CRM/SFA
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//company name, first name, last name, first name(local), department, Email
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinodhini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Avinash");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vino");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vino123@gmail.com");
		
		//select conference from source, newyork from state
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd =new Select (source);
		
		dd.selectByValue("LEAD_CONFERENCE");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sp=new Select (state);
		
		sp.selectByVisibleText("New York");
		
		//click submit button
		
		driver.findElement(By.name("submitButton")).click();
		
		//get title of resulting page
		
		System.out.println("Page title is " + driver.getTitle());
		
		driver.close();

	}

}
