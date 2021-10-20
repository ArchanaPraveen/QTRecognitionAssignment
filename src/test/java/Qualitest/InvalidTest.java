package Qualitest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.InvalidTestcases;

import resources.Index;

public class InvalidTest extends Index{
	
	@Test
	public void newTest() throws IOException, InterruptedException
	{
		driver=initializeBrowser();
		driver.get("https://qtrecognition.testqtwiz.com/");
		InvalidTestcases obj9=new InvalidTestcases(driver);
		obj9.username().sendKeys("adfsdfb");
		obj9.Password().sendKeys("jjshdash");
		obj9.LoginBtn().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		}
	
	@AfterTest
	public void end()
	{
		driver.close();
	}

}
