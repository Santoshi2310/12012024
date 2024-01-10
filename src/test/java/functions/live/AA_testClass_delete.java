package functions.live;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AA_testClass_delete extends B_baseClass {
	
	String date ;
	String gCurrntTime;
	String gTimeA7min;
	String gTimeA22min;
	 String gTimeA67min;
	 String gTimeA82min;
	 
	 String date2;
     String dateAft2Days;

	
	String userName = "6039-IN-andrew-deptu-2";
	String password = "123456";
	

	C_logIn_logOut lp;
	D_homePage hp;
	E_manualAlarm ma;
	F_information ip;
	G_InfoEvent ep;
	AAA_timeClasss tmc;
	H_testAlarm ta;
	I_availabilityRequest ar;
	

	@BeforeClass
	public void lounchBrowser() throws Throwable {
		
		browserLounch();
		Reporter.log("Hello, Daily check point checking process has started.", true);
		Reporter.log(" ",true);

		lp = new C_logIn_logOut(driver);
		hp = new D_homePage(driver);

		lp.logIn(userName, password, driver);
	
		
	
		hp.langChange(driver);
		ma = new E_manualAlarm(driver);
		ip = new F_information(driver);
		ep=new G_InfoEvent (driver) ;
		tmc = new AAA_timeClasss ();
		ta = new  H_testAlarm (driver);
		
		ar = new I_availabilityRequest (driver);
		
		
		tmc.catchTime(driver);
		date=tmc.germanyTodaysDate;
		gCurrntTime =tmc.germanycurrentTime;
		gTimeA7min =tmc.germanyTimeAfter7Minutes;
		gTimeA22min = tmc.germanyTimeAfter22Minutes;
		date2=tmc.germanyTomorrowDate2;
		dateAft2Days=tmc.germanyDateAfterTwoDyas;
		
		
		

	}


	@BeforeMethod
	public void backToHomePage() throws Throwable {
		hp.backToHomePage(driver);

	}
	
	@Test

	public void userDetails() throws Throwable {
				
		Reporter.log(" ",true);
		Reporter.log("live department user # " + userName + " # log in sucessfully", true);
		Reporter.log(" ",true);
	}
	
	
	
	@Test( )

	public void deleteTestAlarmFromList() throws Throwable 
	{
		Reporter.log(" ",true);
		Reporter.log("The process of deleting a test alarm from list is started.", true);
     	ta.deleteTestAlarmFromList(driver);
		Reporter.log("The process of deleting a test alarm from list is complted.", true);
		Reporter.log(" ",true);
		


	}
	
	@Test

	public void deleteTestAlarmFromOverview() throws Throwable 
	{
		Reporter.log(" ",true);
		Reporter.log("The process of deleting a test alarm from overview is started.", true);
		ta.deleteTestAlarmFromDashboard(driver);
	
		
		Reporter.log("The process of deleting a test alarm from overview is complted.", true);
		Reporter.log(" ",true);
		


	}

	@Test

	public void deleteAlarm() throws Throwable 
	{
		Reporter.log(" ",true);
		Reporter.log("The process of deleting a manual alarm is started.", true);

		ma.deleteAlarms(driver, date);
		Reporter.log("The process of deleting a manual alarm is complted.", true);
		Reporter.log(" ",true);
		


	}
	
	@Test
	public void delteInfoEvent() throws Throwable 
	{

		Reporter.log(" ",true);
		Reporter.log("The process of deleting information and event is started.", true);

		ip.deleteInfoEvent(driver);
		Reporter.log("Process of delete information and event is complted.", true);
		
		Reporter.log(" ",true);
	}
	
	
	@Test
	public void deleteARFromList() throws Throwable 
	{

		Reporter.log(" ",true);
		Reporter.log("The process of deleting availability request from list is started.", true);
		ar.availabilityRequestCommon(driver);
		ar.deleteAvailabilityRequestFromList(driver);
		
		Reporter.log("The process of deleting availability request from list is complted.", true);
		
		Reporter.log(" ",true);
	}
	
	
	@Test
	public void deleteARFromHistory() throws Throwable 
	{

		Reporter.log(" ",true);
		Reporter.log("The process of deleting availability request from history is started.", true);
		
	    ar.availabilityRequestCommonDashboard(driver);
		ar.deleteAvailabilityRequestFromHistory(driver);
		
		Reporter.log("The process of deleting availability request from history is complted.", true);
		
		Reporter.log(" ",true);
	}
	
	
	
	

	@Test
	public void detailsAboutScript() throws Throwable 
	
	{
		Reporter.log(" ",true);
		
	
		
		Reporter.log("Login  date-"+ date+" & login  time -"+gCurrntTime, true);
		tmc.catchTime2(driver);
		date=tmc.germanyTodaysDate;
		gCurrntTime =tmc.germanycurrentTime;
		
		Reporter.log("Logout date-"+ date+" & logout time -"+gCurrntTime, true);
		Reporter.log(" ",true);
		
	}
	
	

	@AfterMethod

	public void backToHomePage2() throws Throwable {
		hp.backToHomePage(driver);

	}

	@AfterClass
	public void logOut() throws Throwable {
		
		lp.logOut(driver);
		Reporter.log("Logout sucessfully.", true);
		Reporter.log(" ",true);
	
	
		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		Reporter.log(" ",true);
		
		

	}
}
