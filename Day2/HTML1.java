package Week4.Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {

	public static void main(String[] args) {
		
		// 1. Launch the URL https://html.com/tags/table/
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://html.com/tags/table/");
		
	
		//2. Get the count of number of rows
		
		List<WebElement> rows1 = driver.findElements(By.xpath("//div[@class='render']/table//tr"));
		
		List<WebElement> rows2 = driver.findElements(By.xpath("//div[@class='related-pages']/table//tr"));
		
		int rowscount =rows1.size() + rows2.size();
		
		System.out.println(rowscount);
		
		//3. Get the count of number of columns	
		
		List<WebElement> columns1 = driver.findElements(By.xpath("//div[@class='render']/table//th"));
		
		List<WebElement> columns2 = driver.findElements(By.xpath("//div[@class='related-pages']/table//th"));
		
		int columnscount =columns1.size() + columns2.size();
		
		System.out.println(columnscount);
		
		
		

	}

}
