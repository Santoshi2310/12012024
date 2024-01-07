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
	String gTimeA15min;
	String gTimeA20min;


	
	String userName = "6039-IN-andrew-deptu-2";
	String password = "123456";
	

	C_logIn_logOut lp;
	D_homePage hp;
	E_manualAlarm ma;
	F_information ip;
	G_InfoEvent ep;
	AAA_timeClasss tmc;
	H_testAlarm ta;
	

	@BeforeClass
	public void lounchBrowser() throws Throwable {
		
		browserLounch();
		Reporter.log("Hi, The process of deleting live department records has started.", true);
		Reporter.log(" ",true);

		lp = new C_logIn_logOut(driver);
		hp = new D_homePage(driver);

		lp.logIn(userName, password, driver);
	
		Reporter.log("live department user-" + userName + " log in sucessfully", true);
		Reporter.log(" ",true);
		hp.langChange(driver);
		ma = new E_manualAlarm(driver);
		ip = new F_information(driver);
		ep=new G_InfoEvent (driver) ;
		tmc = new AAA_timeClasss ();
		ta = new  H_testAlarm (driver);
		tmc.catchTime(driver);
		date=tmc.germanyTodaysDate;
		gCurrntTime =tmc.germanycurrentTime;
		gTimeA15min =tmc.germanyTimeAfter15Minutes;
		gTimeA20min = tmc.germanyTimeAfter20Minutes;
		
		

	}

	@BeforeMethod
	public void backToHomePage() throws Throwable {
		hp.backToHomePage(driver);

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

	
	

	@AfterMethod

	public void backToHomePage2() throws Throwable {
		hp.backToHomePage(driver);

	}

	@AfterClass
	public void logOut() throws Throwable {
		
		lp.logOut(driver);
		Reporter.log(" ",true);
		Reporter.log("Live user "+userName+" successfully login on "+ date+" at "+gCurrntTime, true);
		tmc.catchTime2(driver);
		date=tmc.germanyTodaysDate;
		gCurrntTime =tmc.germanycurrentTime;
		
		Reporter.log("Live user "+userName+" successfully logout on "+ date+" at "+gCurrntTime, true);
		Reporter.log(" ",true);
		Reporter.log("Hello, the process of deleting entries in liver department is complete.", true);
		Reporter.log(" ",true);
		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		
		

	}
}
