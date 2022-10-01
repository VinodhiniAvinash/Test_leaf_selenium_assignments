package Week5.Day1_TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Week5.Day1_TestNG.BaseClass;

public class CreateLead extends BaseClass{

	@Test
	public void runCreateLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		
}
}






