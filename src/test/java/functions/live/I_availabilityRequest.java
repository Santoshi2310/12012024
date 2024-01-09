package functions.live;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class I_availabilityRequest {
	
	
	
	@FindBy(xpath="//span[text()=\"Availability Request\"]")private WebElement availabilityRequestModule;
	@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/WeekendPlannings/list\"]")private WebElement availabilityReques;
	
	  @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNewButton ;
	@FindBy(xpath="//input[@id=\"title\"]")private WebElement ARTitle;
	@FindBy(xpath="//select[@id=\"PlanningResourcesIsRecursive\"]")private WebElement ARType;
	@FindBy(xpath="//input[@id=\"actionImmediateRequest1\"]")private WebElement sendImmediateChekBox;
	@FindBy(xpath="//span[@id=\"select2-sectionDepartment-container\"]")private WebElement departmentField;
	@FindBy(xpath="//input[@name=\"firestation[]\" and @value=\"6286\"]")private WebElement station06;
	@FindBy(xpath="//input[@id=\"from_date\"]")private WebElement ARFromDate;
	@FindBy(xpath="//input[@id=\"from_time\"]")private WebElement ARFromTime;
    @FindBy(xpath="//input[@id=\"to_date\"]")private WebElement ARToDate;

	@FindBy(xpath="//input[@id=\"to_time\"]")private WebElement ARToTime;
	@FindBy(xpath="(//span[@class=\"slider round\"])[2]")private WebElement ARSlipInDays;
	@FindBy(xpath="(//span[@class=\"slider round\"])[3]")private WebElement ARSHift ;
	@FindBy(xpath="//input[@id=\"inputShift\"]")private WebElement addShift;
	@FindBy(xpath="//button[@id=\"actionAddShift\"]")private WebElement adShiftButton;
	@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement ARSaveButton;
	
	@FindBy(xpath="//input[@aria-controls=\"example1\"]")private WebElement searchField;
	@FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteAvailbilityRequest;
	@FindBy(xpath="//button[@id=\"delYes1\"]")private WebElement deleteAvailbiliYes;
		
	@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/WeekendPlannings/history\"]")private WebElement availabilityRequestHistory;
	@FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton ;
		@FindBy(xpath="(//button[@type=\"submit\"])[1]")private WebElement deleteAvailbiliHistoryYes;
	@FindBy(xpath="//input[@aria-controls=\"weekendHistoryTable\"]")private WebElement searFieldHistory;
		
	
	
	@FindBy(xpath="//input[@id=\"requested_datetime\"]")private WebElement ARSendTime;
		
	@FindBy(xpath="//select[@id=\"requested_day_id\"]")private WebElement ARday;
		@FindBy(xpath="//input[@id=\"timePicker1\"]")private WebElement ARSendTime1;
	@FindBy(xpath="//select [@id=\"from_day_id\"]")private WebElement requestfromday;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
	
	
	public I_availabilityRequest (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	
	public void availabilityRequestCommon ( WebDriver driver ) throws Throwable
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		
		availabilityRequestModule.click();
		Thread.sleep(2000);
		availabilityReques.click();
		Thread.sleep(2000);
		
	}
		
		
		
	
	
	
	public void ARSendImmediate ( WebDriver driver,String date2, String gTimeA7min, String dateAft2Days,String gTimeA22min) throws Throwable
	{
		Actions act = new Actions(driver);
		
		createNewButton.click();
		Thread.sleep(2000);
		ARTitle.click();
		Thread.sleep(2000);
		act.sendKeys("BG-AR > one time > immediate").build().perform();
		Thread.sleep(2000);
		Select se = new Select(ARType);
		se.selectByVisibleText("One time");
		Thread.sleep(2000);
		sendImmediateChekBox.click();
		Thread.sleep(2000);
		departmentField.click();
		Thread.sleep(2000);
		act.sendKeys("andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		station06.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		ARFromDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(date2).build().perform();
		Thread.sleep(2000);
		
		ARFromTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(gTimeA7min).build().perform();
		Thread.sleep(2000);
			
		ARToDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(dateAft2Days).build().perform();
		Thread.sleep(2000);
		
		ARToTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(gTimeA22min).build().perform();
		Thread.sleep(2000);
		
		
		ARSlipInDays.click();
		Thread.sleep(2000);
		
		ARSHift.click();
		Thread.sleep(2000);
		
		addShift.click();
		Thread.sleep(2000);
		act.sendKeys("1st").build().perform();
		Thread.sleep(2000);
		
		adShiftButton.click();
		Thread.sleep(2000);
		
	
		act.sendKeys("2nd").build().perform();
		Thread.sleep(2000);
		
		adShiftButton.click();
		Thread.sleep(2000);
		
		ARSaveButton.click();
		Thread.sleep(4000);
		
		
		
		
	}
	
	
	
	
	
	
	
	public void ARSendSchedule ( WebDriver driver,String date,String date2, String gTimeA7min, String dateAft2Days,String gTimeA22min) throws Throwable
	{
		Actions act = new Actions(driver);
		
		createNewButton.click();
		Thread.sleep(2000);
		ARTitle.click();
		Thread.sleep(2000);
		act.sendKeys("BG-AR >  one time > schedule").build().perform();
		Thread.sleep(2000);
		Select se = new Select(ARType);
		se.selectByVisibleText("One time");
		Thread.sleep(2000);
		
		
		ARSendTime.click();
		Thread.sleep(2000);
		
		act.sendKeys(date+" "+gTimeA7min).build().perform();
		Thread.sleep(2000);
		
		
		departmentField.click();
		Thread.sleep(2000);
		act.sendKeys("andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		station06.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		ARFromDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(date2).build().perform();
		Thread.sleep(2000);
		
		ARFromTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(gTimeA7min).build().perform();
		Thread.sleep(2000);
			
		ARToDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(dateAft2Days).build().perform();
		Thread.sleep(2000);
		
		ARToTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(gTimeA22min).build().perform();
		Thread.sleep(2000);
		
		
		ARSlipInDays.click();
		Thread.sleep(2000);
		
		ARSHift.click();
		Thread.sleep(2000);
		
		addShift.click();
		Thread.sleep(2000);
		act.sendKeys("1st").build().perform();
		Thread.sleep(2000);
		
		adShiftButton.click();
		Thread.sleep(2000);
		
	
		act.sendKeys("2nd").build().perform();
		Thread.sleep(2000);
		
		adShiftButton.click();
		Thread.sleep(2000);
		
		ARSaveButton.click();
		Thread.sleep(4000);
		
		
		
		
	}
	
	public void ARSend ( WebDriver driver,String today, String date,String date2, String gTimeA7min, String dateAft2Days,String gTimeA22min) throws Throwable
	{
		Actions act = new Actions(driver);
		
		createNewButton.click();
		Thread.sleep(2000);
		ARTitle.click();
		Thread.sleep(2000);
		act.sendKeys("BG-AR > recursive  ").build().perform();
		Thread.sleep(2000);
		Select se = new Select(ARType);
		se.selectByVisibleText("Recursive");
		Thread.sleep(2000);
		
		Select se1 = new Select(ARday);
		se1.selectByVisibleText("today");
		Thread.sleep(2000);
		
		
		
		
		ARSendTime1.click();
		Thread.sleep(2000);
		
		act.sendKeys(date+" "+gTimeA7min).build().perform();
		Thread.sleep(2000);
		
		
		departmentField.click();
		Thread.sleep(2000);
		act.sendKeys("andrew").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		station06.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		ARSlipInDays.click();
		Thread.sleep(2000);
		
		ARSHift.click();
		Thread.sleep(2000);
		
		addShift.click();
		Thread.sleep(2000);
		act.sendKeys("1st").build().perform();
		Thread.sleep(2000);
		
		adShiftButton.click();
		Thread.sleep(2000);
		
	
		act.sendKeys("2nd").build().perform();
		Thread.sleep(2000);
		
		adShiftButton.click();
		Thread.sleep(2000);
		
		ARSaveButton.click();
		Thread.sleep(4000);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void deleteAvailabilityRequestFromList( WebDriver driver) throws Throwable {
	
	Actions act = new Actions(driver);
	
		
		
		for	(int i=1;i<=20;i++)
		{
			searchField.click();	
			Thread.sleep(2000);
			
			act.sendKeys("BG").perform();
			Thread.sleep(2000);
				
			deleteAvailbilityRequest.click();
			Thread.sleep(2000);
			deleteAvailbiliYes.click();
			
			Thread.sleep(5000);
			Reporter.log( "Availability request number-"+i+ " deleted sucessfully from list-live branch." , true );
			driver.navigate().refresh();
			Thread.sleep(2000);
		
		}
	}
		
		public void deleteAvailabilityRequestFromHistory( WebDriver driver) throws Throwable {
			
			
			Actions act= new Actions (driver);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			availabilityRequestModule.click();
			Thread.sleep(2000);
			availabilityRequestHistory.click();
			Thread.sleep(2000);
			
			
			for	(int i=1;i<=20;i++)
			{
				searFieldHistory.click();	
				Thread.sleep(2000);
				act.sendKeys("BG").perform();
				Thread.sleep(4000);
				searchButton.click();
				Thread.sleep(5000);	
				
			deleteAvailbilityRequest.click();
			Thread.sleep(2000);
			deleteAvailbiliHistoryYes.click();
			Thread.sleep(5000);
			Reporter.log( "Availability request number-"+i+ " deleted sucessfully from histry-live branch." , true );
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			
		}
	
	
	
	
	
	
	
	
	
	
		}
	

}
