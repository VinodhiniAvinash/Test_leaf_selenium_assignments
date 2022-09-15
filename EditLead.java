package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximixe the window
		
		driver.manage().window().maximize();
		
		//username and pwd and login
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//click CRM/SFA and leads and click lead
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			
		//enter first name and find lead
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Vinodhini");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//click on first resulting lead
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//verify resulting page
		
		System.out.println(driver.getTitle());		
		
		// click on EDIT
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Change company name and update
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Confirm changed name appears
		
		String modCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(modCompanyName);
		
		//close browser
		
		driver.close();
		

	}

}
