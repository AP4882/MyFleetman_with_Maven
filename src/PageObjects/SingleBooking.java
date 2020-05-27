package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import test.java.SingleBookTest;

public class SingleBooking extends SingleBookTest {

public static String CompanyCheck = "ABC INDIA PVT LTD ( AIPL )";
	
	public static String  BookTest1(String Prefix,String CompanyName,String ServingCity,String BookingMode,String Year1,String Month1,
			String Day1,String Year2,String Month2,String Day2,String NoofGuest,String GuestPrefix,String GuestName,
			String EmpID,String ProjectCode,String ProjectName,String ProjectCost,String CustCode,String Time, String Address1, String Address2,
			String PickupLocation, String DropLocation,String BookingGivenBy, String BookingByContactNo,
			String BookingByEmailId, String CompanyRefNo, String PaymentType, String VehicleType, String PackageFor, String PackageName, 
			String PaymentMode) throws InterruptedException, AWTException 
		{
		
		
		
		
	driver.findElement(By.id("txtCompanyName")).clear();
	driver.findElement(By.id("txtCompanyName")).sendKeys(Prefix);
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	
	Thread.sleep(3000);
	List<WebElement> list = driver.findElements(By.className("ui-menu-item"));
      for (WebElement listview : list) {
		if(listview.getText().equalsIgnoreCase(CompanyName)) {
		
		 Actions actions = new Actions(driver);
		    actions.moveToElement(listview);
		    Thread.sleep(2000);
			    listview.click();
	
		}
      }
					   
	Select s1 = new Select(driver.findElement(By.id("ddlCity")));
	s1.selectByVisibleText(ServingCity);
	
	Select s2 = new Select(driver.findElement(By.id("ddlBookingMode")));
	s2.selectByVisibleText(BookingMode);
	Thread.sleep(2000);
	
	 WebElement selectdate = driver.findElement(By.id("txtFromDate"));
	 Actions actions = new Actions(driver);
	 actions.moveToElement(selectdate).click().build().perform();
	 Thread.sleep(2000);


	try {
   Select s3 = new Select(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year")));
	s3.selectByVisibleText(Year1);
	Thread.sleep(2000);

   Select s4 = new Select(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month")));
   s4.selectByVisibleText(Month1);
   Thread.sleep(2000);
	
	Thread.sleep(2000);
	List <WebElement> Days = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	for(WebElement d:Days){
		d.getText();
		if(d.getText().equals(Day1 )){
			d.click();
		}
	}
}catch(Exception e) {
		System.out.println(e);
	}
	
	Thread.sleep(2000);
	
	 WebElement selectdate1 = driver.findElement(By.id("txtReturnDate"));
	 Actions actions1 = new Actions(driver);
	 actions1.moveToElement(selectdate1).click().build().perform();
	 Thread.sleep(2000);


	try {
   Select s3 = new Select(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-year")));
	s3.selectByVisibleText(Year2);
	Thread.sleep(2000);

   Select s4 = new Select(driver.findElement(By.cssSelector("#ui-datepicker-div > div > div > select.ui-datepicker-month")));
   s4.selectByVisibleText(Month2);
   Thread.sleep(2000);
	
	List <WebElement> Days = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	for(WebElement d:Days){
		d.getText();
		if(d.getText().equals(Day2 )){
			d.click();
		}
	}
}catch(Exception e) {
		System.out.println(e);
	}
	Thread.sleep(2000);
	Select s5 = new Select(driver.findElement(By.id("ddlGuestsNo")));
	s5.selectByVisibleText(NoofGuest);
	Thread.sleep(1000);
	
	driver.findElement(By.id("txtBookingGivenBy")).clear();
	driver.findElement(By.id("txtBookingGivenBy")).sendKeys(BookingGivenBy);
	Thread.sleep(1000);
    
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBookingContactNo")).clear();
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBookingContactNo")).sendKeys(BookingByContactNo);
    Thread.sleep(1000);
    
    driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBoookerEmailId")).clear();
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBoookerEmailId")).sendKeys(BookingByEmailId);
	Thread.sleep(1000);
    
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCmpReference")).clear();
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCmpReference")).sendKeys(CompanyRefNo);
	Thread.sleep(1000);
	
	driver.findElement(By.id("txtCustomerName_1")).sendKeys(GuestPrefix);
	Thread.sleep(2000);
		
		List<WebElement> list1 = driver.findElements(By.className("ui-corner-all"));
	      for (WebElement listview1 : list1) {
			if(listview1.getText().equalsIgnoreCase(GuestName)) {
			
			 Actions actions2 = new Actions(driver);
			    actions2.moveToElement(listview1);
			    Thread.sleep(2000);
				    listview1.click();
			}
	      }
		
	      Thread.sleep(3000);
	     if(CompanyName.equalsIgnoreCase(CompanyCheck)) {
	    	  
	    	driver.findElement(By.id("txtGuestFiledName_0_1")).sendKeys(EmpID);
	    	Thread.sleep(2000);  
	    	  
	    	driver.findElement(By.id("txtGuestFiledName_1_1")).sendKeys(ProjectCode);
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.id("txtGuestFiledName_2_1")).sendKeys(ProjectName);
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.id("txtGuestFiledName_3_1")).sendKeys(ProjectCost);
	    	Thread.sleep(2000);
	    	
	    	driver.findElement(By.id("txtGuestFiledName_4_1")).sendKeys(CustCode);
	    	Thread.sleep(2000); 
	     }
	      
	//driver.findElement(By.id("txtEmailId_"+k)).sendKeys(EmailId);
	//Thread.sleep(1000);
	
	driver.findElement(By.id("txtReportingTime_1")).sendKeys(Time);
		
	Select s6 = new Select(driver.findElement(By.id("ddlPickupPlace_1")));
	s6.selectByVisibleText(Address1);
	Thread.sleep(1000);

		Select s7 = new Select(driver.findElement(By.id("ddlDropPlace_1")));
		s7.selectByVisibleText(Address2);
		Thread.sleep(1000);
		

    driver.findElement(By.id("PickupField1_1")).sendKeys(PickupLocation);
    Thread.sleep(1000);
    
	
    
	//driver.findElement(By.id("txtpickuplaceto_1")).sendKeys(DropLocation);
	//Thread.sleep(1000);


	/*if(VIP.equalsIgnoreCase("Yes") && Lady.equalsIgnoreCase("No")) {
		WebElement checkbox1 = driver.findElement(By.id("chkVIP_"+k));
		checkbox1.click();
		
	}else if(Lady.equalsIgnoreCase("Yes") && VIP.equalsIgnoreCase("No") ) {
		WebElement checkbox2 = driver.findElement(By.id("chkLady_"+k));
		checkbox2.click();
		}
	else if(VIP.equalsIgnoreCase("Yes") && Lady.equalsIgnoreCase("Yes"))
	{
		WebElement checkbox1 = driver.findElement(By.id("chkVIP_"+k));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.id("chkLady_"+k));
		checkbox2.click();
		
	}*/	
	
    
	
	List<WebElement> radio = driver.findElements(By.xpath("//input[@name = 'ctl00$ContentPlaceHolder1$Direct' and @type = 'radio']"));
	for(int i=0;i<radio.size();i++){
		WebElement local_radio = radio.get(i);
		String value = local_radio.getAttribute("value");
		System.out.println("Payment type : " + value);
		if(value.equals(PaymentType)){
			local_radio.click();
		}
	}
	
    Select s8 = new Select(driver.findElement(By.id("ddlVehicalType")));
	s8.selectByVisibleText(VehicleType);
	Thread.sleep(1000);	
	

	Select s9 = new Select(driver.findElement(By.id("ddlPackageFor")));
	s9.selectByVisibleText(PackageFor);
	Thread.sleep(4000);
	
	Select s10 = new Select(driver.findElement(By.id("ddlPackageName")));
	
	s10.selectByVisibleText(PackageName);
	Thread.sleep(1000);
	
	//Select s11 = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlPaymentType")));
	//s11.selectByVisibleText(PaymentMode);
	//Thread.sleep(1000);

	
	String parentWindowHandle = driver.getWindowHandle();
	
	WebElement Submit = driver.findElement(By.id("btnSaveid"));
	Submit.click();
	Thread.sleep(10000);
	
	
	 Robot r = new Robot();
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(5000);
     
     Set<String> allWindowHandles = driver.getWindowHandles();
     
     for(String handle : allWindowHandles)
     {
     System.out.println("Window handle - > " + handle);
    
     }
     
     driver.switchTo().window(parentWindowHandle);
     String Title = driver.getTitle();
     System.out.println(Title);
     Thread.sleep(4000);
	
	return null;
	

	
		}
}



