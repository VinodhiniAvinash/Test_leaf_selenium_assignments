package Week4.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
//		 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().window().maximize();
			
//			2. Enter UserName and Password Using Id Locator
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			
			
//			3. Click on Login Button using Class Locator
			
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
//			4. Click on CRM/SFA Link
			
			driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			
//			 5. Click on contacts Button
			
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
			
//			6. Click on Merge Contacts using Xpath Locator
			
			driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
			Thread.sleep(3000);
			
//			7. Click on Widget of From Contact
			
			driver.findElement(By.xpath("//table[@class='dijit dijitReset dijitInline dijitLeft  dijitComboBoxNoArrow']/following-sibling::a")).click();
			Thread.sleep(3000);
			
			String parentHandle = driver.getWindowHandle();
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			List<String>windows = new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(windows.get(1));
			
//			 8. Click on First Resulting Contact
			
			driver.findElement(By.xpath("//button[@class='x-btn-text x-tbar-page-next']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
			driver.switchTo().window(parentHandle);
			 
//			 9. Click on Widget of To Contact
			
			driver.findElement(By.xpath("//table[@class='dijit dijitReset dijitInline dijitLeft  dijitComboBoxNoArrow']/following-sibling::a")).click();
			Thread.sleep(3000);
			
			String parentHandle1 = driver.getWindowHandle();
			
			Set<String> windowHandles1 = driver.getWindowHandles();
			
			List<String>windows1 = new ArrayList<String>(windowHandles1);
			
			driver.switchTo().window(windows1.get(1));
			  
//			 10. Click on Second Resulting Contact
			
			driver.findElement(By.xpath("//button[@class='x-btn-text x-tbar-page-next']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
			
			driver.switchTo().window(parentHandle1);
			  
//			 11. Click on Merge button using Xpath Locator
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			  
//			 12. Accept the Alert
			
			Alert alert = driver.switchTo().alert();
			alert.accept();
			  
//			 13. Verify the title of the page
			
			String title = driver.getTitle();
			
			System.out.println(title);
			
			if(title.contains("View Contact")) {
				System.out.println("Contact are merged successfully");
			}
			
			else {
				System.out.println("Contact are NOT merged");
			}
			
			Thread.sleep(3000);
			
			driver.close();

	}

}
