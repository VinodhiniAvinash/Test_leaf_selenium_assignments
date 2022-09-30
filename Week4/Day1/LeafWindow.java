package Week4.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafWindow {

	public static void main(String[] args) throws InterruptedException {
// Launch URL "https://www.leafground.com/window.xhtml"
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
// click on open and get the title
		
		driver.findElement(By.xpath("//h5[text()='Click and Confirm new Window Opens']/following-sibling::button")).click();
		
// go to new window
		
		String parentHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
//print the title of new window to confirm
		
		System.out.println("Title of new page: " + driver.getTitle());
		
		driver.switchTo().window(parentHandle);
		
// click on open multiple
		
		driver.findElement(By.xpath("//h5[text()='Find the number of opened tabs']/following-sibling::button")).click();
		
		String parentHandle1 = driver.getWindowHandle();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String>windows1 = new ArrayList<String>(windowHandles1);

//print the number of windows
		
		System.out.println("Number of tabs opened: " + windows1.size());		
		
// click on close windows
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon-right ui-icon ui-c pi pi-bookmark']")).click();
		
		String parentHandle2 = driver.getWindowHandle();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String>windows2 = new ArrayList<String>(windowHandles2);
		
// close all windows expect parent
		
		System.out.println("Number of tabs opened: " +windows2.size());
		
		for(int i=1;i<windows2.size();i++) {
		
		driver.switchTo().window(windows2.get(i));
		
		driver.close();
		}
		
		driver.switchTo().window(parentHandle);
		
// click on open delay
		
		driver.findElement(By.xpath("//h5[text()='Wait for 2 new tabs to open']/following-sibling::button")).click();
		
// wait until new tab opens
		
		Thread.sleep(5000);
		
		String parentHandle3 = driver.getWindowHandle();
		
		Set<String> windowHandles3 = driver.getWindowHandles();
		
		List<String>windows3 = new ArrayList<String>(windowHandles3);

//print the number of windows
		
		System.out.println("Number of tabs opened: " + windows3.size());	

// close all windows
		
		driver.quit();
	}

}
