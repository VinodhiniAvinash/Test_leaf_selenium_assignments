package Week4.Day2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealAss {

	public static void main(String[] args) throws InterruptedException, IOException {
//			1. Launch https://www.snapdeal.com/
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
//			2. Go to Mens Fashion
		
		WebElement MEN = driver.findElement(By.xpath("//span[@class='catText']"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(MEN).perform();
		
//			3. Go to Sports Shoes
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		Thread.sleep(5000);
		
//			4. Get the count of the sports shoes
		
		String sportshoecount = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']//following-sibling::div")).getText();
		System.out.println("Sports shoe count is " +sportshoecount);
		Thread.sleep(3000);
		
//			5. Click Training shoes
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(5000);
		
//			6. Sort by Low to High
		
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		Thread.sleep(5000);
		
//			7. Check if the items displayed are sorted correctly
		
		List<WebElement> sortlist = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		System.out.println("Amount sorted in ascending order");
		for (WebElement eachEle : sortlist) {
			System.out.println(eachEle.getText());
			
		}
		
//			8.Select the price range (900-1200)
		
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("900");
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(5000);
		
//			9.Filter with color Navy 
		
		driver.findElement(By.xpath("//label[@for='Color_s-Blue']")).click();
		Thread.sleep(5000);
		
//			10 verify the all applied filters 
		
		List<WebElement> appliedFilters = driver.findElements(By.xpath("//div[@class='filters-top-selected']//div[@class='navFiltersPill']"));
		System.out.println("----- Applied Filters are -----");
		for (WebElement eachfilter : appliedFilters) {
			System.out.println(eachfilter.getText());
			
		}
//			11. Mouse Hover on first resulting Training shoes
		
		WebElement firstShoe = driver.findElement(By.xpath("//div[@class='col-xs-6 last-no-border  favDp product-tuple-listing js-tuple ']"));
		builder.moveToElement(firstShoe).perform();
		
//			12. click QuickView button
		
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
		Thread.sleep(5000);
		
//			13. Print the cost and the discount percentage
		
		String cost = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("Shoe cost is "+cost);
		
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount amount is "+discount);
		
//			14. Take the snapshot of the shoes.
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/screenshotsnap.png");
		FileUtils.copyFile(source, destination);
		Thread.sleep(3000);
				
//			15. Close the current window
		
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		Thread.sleep(3000);
		
//			16. Close the main window

		driver.close();

	}

}
