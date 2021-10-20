package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InvalidTestcases {
	public WebDriver driver;
	public WebElement option;
	By username=By.name("username");
	By pass=By.name("pass");
	By loginbtn=By.cssSelector("button[type*='submit']");	
	
	
	
	public InvalidTestcases(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement username()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(pass);
	}
	public WebElement LoginBtn()
	{
		return driver.findElement(loginbtn);
	}
	
		
	
	

}
