package Week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// Launch URL "https://chercher.tech/practice/frames-example-selenium-webdriver"
		
				WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
				
				driver.manage().window().maximize();
				
		//switch to the frame1
				
				WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
				driver.switchTo().frame(frame1);
				
		//enter value in topic
				
				driver.findElement(By.xpath("//b[@id='topic']//following-sibling::input")).sendKeys("Selenium");

		
		//switch to the frame3
				
				WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
				driver.switchTo().frame(frame3);
				
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				
				driver.switchTo().defaultContent();   	//exit from frame1 and frame3
				
				//switch to the frame2
				
				WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
				driver.switchTo().frame(frame2);
				
				WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
				Select animals = new Select(element);
				
				animals.selectByVisibleText("Avatar");
				
				driver.switchTo().defaultContent();  //exit from all frames
				
				Thread.sleep(3000);
				
				driver.close(); 	//close the driver

	}

}
