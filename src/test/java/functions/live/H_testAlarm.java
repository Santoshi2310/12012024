package functions.live;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class H_testAlarm  extends B_baseClass 

{

	@FindBy(xpath="//span[text()=\"Test Alarm\"]")private WebElement testAlarmModule;
    @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Alarms/test_list\"]")private WebElement testAlarmList;
    
    @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNewButton ;
    @FindBy(xpath="//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
	 @FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement fireStationField;
	@FindBy(xpath="//textarea[@id=\"TestAlarmTitle\"]")private WebElement testAlartitlefield;
	@FindBy(xpath="//textarea[@id=\"TestAlarmDescription\"]")private WebElement testAlarmDescriptionField;
    
      
	@FindBy(xpath="//input[@id=\"TestAlarmAlarmType\" and @value=\"3\"]")private WebElement alarmTypePush ;
	@FindBy(xpath="//input[@id=\"TestAlarmReminderStatus\"]")private WebElement selectRemindar;
	@FindBy(xpath="//select[@id=\"TestAlarmReminderType\"]")private WebElement testAlarmRemindarType ;
	@FindBy(xpath="//input[@class=\"selectRecursive\" and  @value=\"3\"]")private WebElement recursiveMonth;
	
	@FindBy(xpath="//input[@class=\"rdoMonthlyType\" and @value=\"1\"]")private WebElement monthDay;
	@FindBy(xpath="//input[@class=\"rdoMonthlyType\" and @value=\"2\"]")private WebElement monthDate;
	@FindBy(xpath="//input[@id=\"startDate1\"]")private WebElement alatmDate;
		@FindBy(xpath="//input[@id=\"timePicker1\"]")private WebElement alarmTime;
		@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;
	    @FindBy(xpath="//input[@placeholder=\"Select Vehicle/Cars\"]")private WebElement vehicleField;
		@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAllCheckBox;
		@FindBy(xpath="//input[@id=\"user_id\" and @value=\"15429\"]")private WebElement ADST06A2;
		
		
		@FindBy(xpath="//textarea[@id=\"TestAlarmAddress\"]")private WebElement testAlarmAdressFeild;
		@FindBy(xpath="//input[@id=\"locationDrag\"]")private WebElement dragMarkerOnMapCheckBox ;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement saveTestAlarm ;
		
		
		@FindBy(xpath="//input[@aria-controls=\"alarmTable\"]")private WebElement searchField;
		@FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
		@FindBy(xpath="//i[@class=\"fa fa-trash-o\"]")private WebElement deleteAlarm;
		@FindBy(xpath="//button[@id=\"delYes\"]")private WebElement deleteYes;
		@FindBy(xpath="//button[@id=\"delRec\"]")private WebElement deleteYes1;
		@FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Alarms/testAlarmOverviews\"]")private WebElement testAlarmOverview;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		
		
		public H_testAlarm (WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		
		public void testAlarmCommon ( WebDriver driver ) throws Throwable
		{
			testAlarmModule.click();
			Thread.sleep(2000);
			testAlarmList.click();
			Thread.sleep(2000);
			
			
		}
		
		
		public void testAlarmByRecursiveMonthlyDateWais ( WebDriver driver,String date, String gTimeA15min) throws Throwable
		{
			Actions act = new Actions (driver);
			
			createNewButton.click();
			Thread.sleep(2000);
			fireDepartmentField.click();
			Thread.sleep(2000);
			act.sendKeys("andrew").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			fireStationField.click();
			Thread.sleep(2000);
			act.sendKeys("06").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			testAlartitlefield.click();
			Thread.sleep(2000);
			act.sendKeys("BG-test alarm by attribute with reminder - recursive > monthly > date wise-"+date).build().perform();
			Thread.sleep(2000);
			testAlarmDescriptionField.click();
			Thread.sleep(2000);
			act.sendKeys("BG-test alarm by attribute with reminder - recursive > monthly > date wise checking.").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			Thread.sleep(2000);
			alarmTypePush.click();
			Thread.sleep(2000);
			selectRemindar.click();
			Thread.sleep(2000);
			Select se = new Select (testAlarmRemindarType);
			Thread.sleep(1000);
			se.selectByVisibleText("Recursive");
			Thread.sleep(2000);
			recursiveMonth.click();
			Thread.sleep(2000);
			monthDate.click();
			Thread.sleep(2000);
			alatmDate.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(date).build().perform();
			Thread.sleep(2000);
			
			alarmTime.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(gTimeA15min).build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(1000);
			userTypeAttribute.click();
			Thread.sleep(2000);
			vehicleField.click();
			Thread.sleep(3000);
			act.sendKeys("adst06v1").build().perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			selectAllCheckBox.click();
			Thread.sleep(2000);
			
			selectAllCheckBox.click();
			Thread.sleep(2000);
			ADST06A2.click();
			Thread.sleep(2000);
			testAlarmAdressFeild.click();
			Thread.sleep(2000);
			act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
			Thread.sleep(2000);
			Thread.sleep(2000);
			dragMarkerOnMapCheckBox.click();
			Thread.sleep(2000);
			saveTestAlarm.click();
			Thread.sleep(3000);
			
			
		}
		
		public void deleteTestAlarmFromList (WebDriver driver) throws Throwable
		{
			testAlarmModule.click();
			Thread.sleep(2000);
			testAlarmList.click();
			Thread.sleep(2000);
			
			
			
			for	(int i=1;i<=100;i++)
			{
				searchField.click();	
				Thread.sleep(2000);
				Actions act= new Actions (driver);
				act.sendKeys("BG").perform();
				Thread.sleep(2000);
				searchButton.click();
				Thread.sleep(5000);
			deleteAlarm.click();
			Thread.sleep(2000);
			deleteYes.click();
			Thread.sleep(5000);
			Reporter.log( "Test alarm number-"+i+ " deleted sucessfully from list-live branch." , true );
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			
			
			}
			
			
			}
			
		
		
		
		
		
		

		public void deleteTestAlarmFromDashboard (WebDriver driver) throws Throwable
		{
		
			testAlarmModule.click();
			Thread.sleep(2000);
			
			testAlarmOverview.click();
			Thread.sleep(2000);
			
			
			for	(int i=1;i<=100;i++)
			{
				
			searchField.click();	
			Thread.sleep(2000);
			Actions act= new Actions (driver);
			act.sendKeys("BG").perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(5000);
			deleteAlarm.click();
			Thread.sleep(2000);
			deleteYes1.click();
			Thread.sleep(5000);
			Reporter.log( "Test alarm number-"+i+ " deleted sucessfully from overview-live branch." , true );
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			
			}
			

}
		
}
