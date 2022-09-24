package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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
		
		//click CRM/SFA and leads and click lead & Phone number
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
			
		//enter phone number and find lead
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123232323");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//capture and click on first resulting lead
		
		Thread.sleep(5000);
		
		String firstLeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(firstLeadID);
		
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();	
		
		// click on delete
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Find leads and enter lead id 
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLeadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//display message
		
		Thread.sleep(5000);
		
		String displayMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		System.out.println(displayMessage);
		
		//close browser
		
		driver.close();

	}

}
