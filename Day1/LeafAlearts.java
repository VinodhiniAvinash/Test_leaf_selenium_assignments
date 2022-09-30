package Week4.Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafAlearts {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch URL "https://www.leafground.com/alert.xhtml;jsessionid=node01uchomb9dxu9r44hnc5vr79fp344596.node0"
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01uchomb9dxu9r44hnc5vr79fp344596.node0");
		
		driver.manage().window().maximize();
		
		// Alert simple dialog box
		
		System.out.println("Alert simple dialog box");
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button/span[text()='Show']")).click();
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		String simpletext = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
		System.out.println(simpletext);
		Thread.sleep(2000);
		
		// Alert confirm dialog box
		
		System.out.println("Alert confirm dialog box");
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']//following-sibling::button/span[text()='Show']")).click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		String confirmtext = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(confirmtext);
		Thread.sleep(2000);
		
//		Alert sweet dialog box
		
		System.out.println("Alert sweet dialog box");
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']//following-sibling::button/span[text()='Show']")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		Thread.sleep(2000);
		
		
//		Alert sweet modal dialog box
		
		System.out.println("Alert sweet modal dialog box");
		WebElement sweetmodal = driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']//following-sibling::button/span[text()='Show']"));
		driver.executeScript("arguments[0].click()", sweetmodal);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Modal Dialog (Sweet Alert)']/following::span[@class='ui-icon ui-icon-closethick'])[1]")).click();
		Thread.sleep(2000);
		
//		Alert prompt dialog box
		
		System.out.println("Alert prompt dialog box");
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']//following-sibling::button/span[text()='Show']")).click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Vinodhini");
		promptalert.accept();
		String prompttext = driver.findElement(By.xpath("//span[@id='result']")).getText();
		System.out.println(prompttext);
		Thread.sleep(2000);
		
//		Sweet alert delete
		
		System.out.println("Sweet alert delete");
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']//following-sibling::button")).click();
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-confirmdialog-yes']")).click();
		Thread.sleep(2000);
		
//		Minimize and maximize
		
		System.out.println("Minimize and maximize");
		WebElement minmaxalert = driver.findElement(By.xpath("//h5[text()='Minimize and Maximize']//following-sibling::button/span[text()='Show']"));
		driver.executeScript("arguments[0].click()", minmaxalert);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Min and Max']//following-sibling::a")).click();
		Thread.sleep(2000);
		
//		close the driver
		
		driver.close();

	}

}
