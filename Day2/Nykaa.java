package Week4.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		
//			1) Go to https://www.nykaa.com/
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		
//			2) Mouseover on Brands and Search L'Oreal Paris
		
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris");
		
//			3) Click L'Oreal Paris
		
		driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]")).click();
		
//			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
		String title = driver.getTitle();

//			5) Click sort By and select customer top rated
		
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("(//div[@class='control-indicator radio '])[3]")).click();
		Thread.sleep(3000);

//			6) Click Category and click Hair->Click haircare->Shampoo
		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//div[@class='control-indicator checkbox ']")).click();
		Thread.sleep(3000);
		
//			7) Click->Concern->Color Protection
		
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//label[@for='checkbox_Color Protection_10764']//div[@class='control-indicator checkbox ']")).click();
		Thread.sleep(3000);
		
//			8)check whether the Filter is applied with Shampoo
		
		String filter = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		System.out.println("Filter applied is "+ filter);
		Thread.sleep(3000);
		
//			9) Click on L'Oreal Paris Colour Protect Shampoo
		
		driver.findElement(By.xpath("//div[@class='css-wkluxr']//following-sibling::a")).click();
		
//			10) GO to the new window and select size as 175ml
		
		String parentHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String>windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		WebElement ml = driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
		Select quantity = new Select(ml);
		quantity.selectByVisibleText("175ml");
		Thread.sleep(3000);
		
//			11) Print the MRP of the product
		
		String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println(price);
		Thread.sleep(3000);
		
//			12) Click on ADD to BAG
		
		driver.findElement(By.xpath("//button[@type='button']//span[text()='Add to Bag']")).click();
		Thread.sleep(3000);
		
//			13) Go to Shopping Bag
		
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		Thread.sleep(5000);
		
//			14) Print the Grand Total amount
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame);
		
		String grandtotal = driver.findElement(By.xpath("//span[text()='Grand Total']//following-sibling::div[@class='value']")).getText();
		System.out.println(grandtotal);
		Thread.sleep(3000);
		
//			15) Click Proceed
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		Thread.sleep(3000);
		
//			16) Click on Continue as Guest
		
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();
		
//			17) Check if this grand total is the same in step 14
		
		String finalamount = driver.findElement(By.xpath("//div[text()='Grand Total']//following-sibling::div[@class='value']//span")).getText();
		Thread.sleep(3000);
		
		if(finalamount.equals(grandtotal)) {
			System.out.println("Amount to be paid is " + finalamount + "procced to checkout");
		}
		else
			System.out.println("shipping charges Added. Dont checkout");
		
//			18) Close all windows
		
		driver.quit();

	}

}
