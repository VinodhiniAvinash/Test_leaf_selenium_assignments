package Week4.Day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
//			1.Load the URL https://www.amazon.in/
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
//			2.search as oneplus 9 pro 
		
		String mobile = "oneplus 9 pro";
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(mobile,"oneplus 9 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		
//			3.Get the price of the first product
		
		String price = driver.findElement(By.xpath("//span[@class='a-price']//span[@class='a-price-whole']")).getText();
		System.out.println("Price of " + mobile + " is " + price);
		Thread.sleep(3000);
		
//			4. Print the number of customer ratings for the first displayed product
		
		String customerrating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
		System.out.println("Customer rating of " + mobile + " is " + customerrating);
		Thread.sleep(3000);
		
////			5. Click the first text link of the first image
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		
		String parentHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
//			6. Take a screen shot of the product displayed
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/screenshot.png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(3000);
				
//			7. Click 'Add to Cart' button
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		
//			8. Get the cart subtotal and verify if it is correct.
		
		String subtotal = driver.findElement(By.xpath("//div[@id='attach-added-to-cart-message']//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.print("Subtotal is ");
		System.out.println(subtotal);
		Thread.sleep(3000);
		
		if(subtotal.contains(price)) {
			System.out.println("Amount is "+ subtotal +" ----> proceed to checkout");
		}
		else {
			System.out.println(subtotal + " Incorrect amount. Don't checkout");
//			9.close the browser		
			
			driver.quit();
		}

	}

}
