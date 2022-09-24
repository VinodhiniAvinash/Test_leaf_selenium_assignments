package Week2.Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		
		driver.get("https://en-gb.facebook.com/");
		
		//Maximixe the window
		
		driver.manage().window().maximize();
		
		//implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//create account
		
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click();
		
		//first name, last name, mobile number, pwd, DOB, Gender
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("778877887");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("rer@123");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("05");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Apr");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1995");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		Thread.sleep(5000);
		//close the driver
		
		driver.close();

	}

}
