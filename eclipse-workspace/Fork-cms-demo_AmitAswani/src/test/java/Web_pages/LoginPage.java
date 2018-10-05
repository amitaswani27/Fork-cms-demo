package Web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.CommonDriver;

/**
 * LoginPage class refers to the Login page of PhpTravel web site
 * 
 */

public class LoginPage {
	
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(name="backend_email")
	WebElement UserName;
	
	@FindBy(name="backend_password")
	WebElement LogPassword;
	
	@FindBy(name="login")
	WebElement Login;

	
	/**
	 * Login method will enter login credentials and click Login 
	 * 
	 */

	public void Login()
	{
		
		String userName = CommonDriver.getProperties("UserName");
		String logPassword = CommonDriver.getProperties("LogPassword");
		
		UserName.sendKeys(userName);
		
		LogPassword.sendKeys(logPassword);
				
		Login.click();
		
		/**
		 * Application forgets the login credentials in sometime,  
		 * Hence, boolean present method is checking the invalid credentials error message and signing up again if required
		 * 
		 */
	
		boolean present;
		try {
			
		   driver.findElement(By.xpath(".//*[@id='dashboard']/div[3]/div/div[2]/p"));
		   present = true;
		   System.out.println("Loggedin Successfully");
			
					  
		} catch (NoSuchElementException e) {
		   present = false;
		   
			System.out.println("There is an error while logging in");
		}
	}
	}

