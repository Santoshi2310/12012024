package functions.live;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_testClass_create extends B_baseClass {


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
		Reporter.log("Hello, Daily check point checking process has started.", true);
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
	
	@Test

	public void createTestAlarmByAttributeRecursiveMontlyDateWise() throws Throwable {
		
		Reporter.log(" ",true);
		Reporter.log("The process of creating a test alarm by attribute with remindar recursive > monthly > date wise is started.", true);
		ta.testAlarmCommon(driver);
		ta.testAlarmByRecursiveMonthlyDateWais(driver,date, gTimeA15min);
		
	
		Reporter.log("The process of creating a test alarm by attribute with remindar recursive > monthly > date wise is complete.", true);
		Reporter.log(" ",true);

	}
	
	
	
	
	
	
	
	
	

	@Test

	public void createManualAlarmByAttribute() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of creating a manual alarm by attribute is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByAttribute(driver, date);
		Reporter.log("The process of creating a manual alarm by attribute is complete.", true);
		Reporter.log(" ",true);

	}
	
	

	@Test

	public void createManualAlarmByResource() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of creating a manual alarm by resource is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByResource(driver, date);
		Reporter.log("The process of creating a manual alarm by resource is complete.", true);
		Reporter.log(" ",true);
	}

	@Test

	public void createManualAlarmByFireFighte() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of creating a manual alarm by firefighter is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByFireFighter(driver, date);
		Reporter.log("The process of creating a manual alarm by firefighter is complete.", true);
		Reporter.log(" ",true);
		

	}

	@Test

	public void createManualAlarmByEscalationResource() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of creating a manual alarm by escaltion resource is started.", true);
		ma.manualAlarmCommon(driver);
		ma.manualAlarmByEscalationResource(driver, date);
		Reporter.log("The process of creating a manual alarm by escaltion resource is complete.", true);
		Reporter.log(" ",true);
	}
	
	@Test

	public void sendMassageToAlarmUser() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The Process of send message to user is started.", true);
		ma.manualAlarmCommon(driver);
		ma.sendMassageToAlarmUser(driver, date);
		Reporter.log("The Process of send message to user is complete.", true);
		Reporter.log(" ",true);
	}
	
	@Test

	public void extendAlarmToSecondStation() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of extend alarm is started.", true);
		ma.manualAlarmCommon(driver);
		ma.extendAlarm(driver, date);
		Reporter.log("The process of extend alarm is complete.", true);
		Reporter.log(" ",true);
	}
	
	
	

	@Test

	public void createInformationByAttribute() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of creating information by attribute is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationByAttribute(driver);
		Reporter.log("The process of creating information by attribute is complete.", true);
		Reporter.log(" ",true);
	}

	@Test

	public void createInformationByResource() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of creating information by resource is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationByResource(driver);
		Reporter.log("The process of creating information by resource is complete.", true);
		Reporter.log(" ",true);
	}

	@Test

	public void createInformationByFirefighter() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of creating information by firefighter is started.", true);
		ip.infoEventCommon(driver);
		ip.createInformationByfireFighter(driver);
		Reporter.log("The process of creating information by firefighter is complete.", true);
		Reporter.log(" ",true);
	}
	
	@Test
	public void sendMassageToinfoUsers() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of send massage to information users is started.", true);
		ip.infoEventCommon(driver);
		ip.sendMassageToInfoUsers(driver);
		Reporter.log("The process of send massage to information users is started is complete.", true);
		Reporter.log(" ",true);
	}
	
	
	
	
	
	
	@Test

	public void createInfoEventByAttribute() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of create info-event by attribute is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByAttribute(driver, date);
		Reporter.log("The process of create info-event by attribute is complete.", true);
		Reporter.log(" ",true);
	}
	@Test

	public void createInfoEventByResource() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of create info-event by resource is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByResource(driver, date);
		Reporter.log("The process of create info-event by resource is complete.", true);
		Reporter.log(" ",true);
	}
	
	@Test

	public void createInfoEventByFirefighter() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of create info-event by firefighter is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByFirefighter(driver, date);
		Reporter.log("The process of create info-event by firefighter is complete.", true);
		Reporter.log(" ",true);
	}
	
	@Test

	public void sendMassageToInfoEventUsers() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of create info-event by firefighter is started.", true);
		ip.infoEventCommon(driver);
		ep.createEventByFirefighter(driver, date);
		Reporter.log("The process of create info-event by firefighter is complete.", true);
		Reporter.log(" ",true);
	}
	
	@Test
	public void sendMassageToinfoEventUsers() throws Throwable {
		Reporter.log(" ",true);
		Reporter.log("The process of send massage to info-event users is started.", true);
		ip.infoEventCommon(driver);
	   ep.sendMassageToInfoEventUsers(driver);
		Reporter.log("The process of send massage to info-event users is started is complete.", true);
		Reporter.log(" ",true);
	}
	
	
	
	

	@AfterMethod()

	public void backToHomePage2() throws Throwable {
		hp.backToHomePage(driver);

	}

	@AfterClass
	public void logOut() throws Throwable {
		lp.logOut(driver);
		Reporter.log("Live user "+userName+" successfully login on "+ date+" at "+gCurrntTime, true);
		tmc.catchTime2(driver);
		date=tmc.germanyTodaysDate;
		gCurrntTime =tmc.germanycurrentTime;
		
		Reporter.log("Live user "+userName+" successfully logout on "+ date+" at "+gCurrntTime, true);
		Reporter.log(" ",true);
		Reporter.log("Hello, Daily check point checking process is complete", true);
		Reporter.log(" ",true);
		driver.quit();
		Reporter.log("Browser close sucessfully.", true);
		
		

	}

}
