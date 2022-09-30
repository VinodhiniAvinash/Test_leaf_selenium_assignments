package Week4.Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {

		// 1. Launch the URL https://www.chittorgarh.com/
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.chittorgarh.com/");
		
		driver.manage().window().maximize();
		
		//2. Click on stock market
		
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		
		//3. Click on NSE bulk Deals
		
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		//4. Get all the Security names
		
		List <WebElement> securitynames= driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//td[3]"));

		//5. Ensure whether there are duplicate Security names
		
		List<String> securityname = new ArrayList<String>();
		for (WebElement eachEle : securitynames) {
			String text = eachEle.getText();
			securityname.add(text);
			
		}
		
		Set<String> security = new HashSet<String>(securityname);
		
		if(securityname.size() == security.size()) {
			System.out.println("No Duplicates");
		}
		else
		{
			System.out.println("Duplicates found");
		}
			
			
		}
		

	}

