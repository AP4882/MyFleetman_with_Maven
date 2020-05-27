package SignInModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Login2.Login2;

public class LoginAction {

	public static WebElement Execute(WebDriver driver,String Username, String Password) throws InterruptedException{
		 
		
		
		Login2.txtbx_UserName(driver).sendKeys(Username);
	     
	     
	     Login2.txtbx_Password(driver).sendKeys(Password);
	 
	     Login2.btn_LogIn(driver).click();
	     Thread.sleep(5000);
	     
		return null;
			
			//System.out.println("Login Successful");
		
}

public static WebElement PostLogin(WebDriver driver) throws InterruptedException {
	
	WebElement element = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/a[2]/i"));
	Thread.sleep(1000);
	element.click();
	
	Thread.sleep(1000);
	Actions Action = new Actions(driver);
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ctl00_rptMenu_ctl05_masters\"]/span"));
	
	Action.moveToElement(element1).click().build().perform();
	//Select Menu = new Select(driver.findElement(By.id("ctl00_rptMenu_ctl00_hdnMenuName")));
	//Menu.selectByVisibleText("Company Master");
	Thread.sleep(2000);
	
	Actions Action1 = new Actions(driver);
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"ctl00_rptMenu_ctl05_rptSubMenu_ctl02_HyperLink1\"]"));
	//WebElement element2 = driver.findElement(By.xpath("//*[@id=\"ctl00_rptMenu_ctl06_hdnMenuName\"]"));
	Action1.moveToElement(element2).click().build().perform();
	//driver.findElement(By.id("ctl00_ContentPlaceHolder1_ucCompanyMaster1_btnNew")).click();
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnNew")).click();
	Thread.sleep(5000);
	
return null;
}
	
}
