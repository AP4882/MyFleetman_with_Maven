package Login2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login2 {
	private static WebElement element = null;


	
	  

	public static WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.id("myLogin_UserName"));

        return element;
		// TODO Auto-generated method stub
	
	}
	public static WebElement txtbx_Password(WebDriver driver) {
		 element = driver.findElement(By.id("myLogin_Password"));
		    
            return element;
		// TODO Auto-generated method stub
		
	}

	public static WebElement btn_LogIn(WebDriver driver) {
		// TODO Auto-generated method stub
		  element = driver.findElement(By.id("myLogin_LoginButton"));
		    
            return element;
	}

	
	
}
