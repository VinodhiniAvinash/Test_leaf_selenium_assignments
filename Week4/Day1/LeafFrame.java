package Week4.Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafFrame {

	public static void main(String[] args) {

	// Launch URL "https://www.leafground.com/frame.xhtml"
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("https://www.leafground.com/frame.xhtml");
			
			driver.manage().window().maximize();
			
	//click Me - inside frame
			
			WebElement frame1 = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']//following-sibling::iframe"));
			driver.switchTo().frame(frame1);
			
			driver.findElement(By.xpath("//button[@id='Click']")).click();
			
			String text = driver.findElement(By.xpath("//button[@id='Click']")).getText();
			
			if(text.contains("Hurray")) {
				System.out.println("Button is clicked inside frame. "+ text);
			}
			else
				System.out.println("Button is NOT clicked inside frame");
			
			driver.switchTo().parentFrame(); 
			
			
//click Me - inside Nested frame
			
			WebElement frame2 = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']//following-sibling::iframe"));
			driver.switchTo().frame(frame2);
			
			WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
			driver.switchTo().frame(frame3);
			
			driver.findElement(By.xpath("//button[@id='Click']")).click();
			
			String text1 = driver.findElement(By.xpath("//button[@id='Click']")).getText();
			
			if(text1.contains("Hurray")) {
				System.out.println("Button is clicked inside nested frame. "+ text1);
			}
			else
				System.out.println("Button is NOT clicked inside nested frame");
			
			driver.switchTo().defaultContent(); 
			
			
			List<WebElement> framescount = driver.findElements(By.xpath("//iframe"));
			
			System.out.println(framescount.size());
			
			
	}

}
