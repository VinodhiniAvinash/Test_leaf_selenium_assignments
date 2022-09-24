package Week3.Day2Ass;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		//disable notifications
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//launch driver
		
		ChromeDriver driver=new ChromeDriver(options);
		
		//Maximixe the window
		
		driver.manage().window().maximize();
		
		//Load URL
		
		driver.get("http:www.ajio.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//in search, type as bags
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags", Keys.ENTER);
		
		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
				
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		
		//Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		
		System.out.println(" Size :" + bagBrandList.size());
		
		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
			

			}		

	}

