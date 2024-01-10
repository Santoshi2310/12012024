package functions.live;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class E_manualAlarm extends B_baseClass 

{

	 @FindBy(xpath="//span[text()=\"Alarm\"]")private WebElement manualAlarmModule;
	 @FindBy(xpath="//a[@href=\"http://live.retteralarm.de/admin/Alarms/index\"]")private WebElement manageAlarm;
	
	 @FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNewButton ;
     @FindBy(xpath="//span[@id=\"select2-selectFiredepartment-container\"]")private WebElement fireDepartmentField;
	 @FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement fireStationField;
	@FindBy(xpath="//textarea[@id=\"AlarmTitleDe\"]")private WebElement titlefield;
	@FindBy(xpath="//textarea[@id=\"AlarmDescriptionDe\"]")private WebElement descriptionField;
	@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement userTypeAttribute;
    @FindBy(xpath="//input[@placeholder=\"Select Vehicle/Cars\"]")private WebElement vehicleField;
	@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAllCheckBox;
	@FindBy(xpath="//input[@id=\"user_id\" and @value=\"15429\"]")private WebElement ADST06A2;
	@FindBy(xpath="//textarea[@id=\"AlarmAddress\"]")private WebElement adressFeild;
	@FindBy(xpath="//input[@id=\"locationDrag\"]")private WebElement dragMarkerOnMapCheckBox ;
	@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement grenrateAlarmButton;
	@FindBy(xpath="//button[@id=\"addSubForm\"]")private WebElement alarmYesButton;
	
	@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement userTypeResource;
	@FindBy(xpath="//input[@value=\"3136\" and @class=\"user-checkbox\"]")private WebElement ADST06R2;
	
	@FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement userTypeFireFighter ;
	@FindBy(xpath="//input[@class=\"user-checkbox\" and @value=\"22999\"]")private WebElement jonas2;
	@FindBy(xpath="//input[@class=\"user-checkbox\" and @value=\"23006\"]")private WebElement BenMs;
	@FindBy(xpath="//input[@value=\"3138\" and @class=\"user-checkbox\" ]")private WebElement ADST06REsc;
	
	
	
	@FindBy(xpath="//input[@aria-controls=\"alarmTable\"]")private WebElement searchField;
	@FindBy(xpath="//button[@id=\"dt_actionSearch\"]")private WebElement searchButton;
	@FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement delete;
	@FindBy(xpath="//button[@id=\"delRec\"]")private WebElement deleteYes;
	
	
	@FindBy(xpath="(//a[@title=\"Chat\"])[4]")private WebElement  chatOptions;
	@FindBy(xpath="//input[@placeholder=\"Write your message...\"]")private WebElement writeMassageField;
	@FindBy(xpath="//button[@id=\"actionSendMessage\"]")private WebElement sendMassageButton ;
	@FindBy(xpath="(//i[@class=\"fa fa-user-plus\"])[4]")private WebElement extendAlarmButton;
	
	@FindBy(xpath="//input[@value=\"15430\" and @id=\"user_id\"]")private WebElement ADST07A2;
	@FindBy(xpath="//input[@id=\"information_1\"]")private WebElement addInfoField1;
	@FindBy(xpath="//input[@id=\"information_2\"]")private WebElement addInfoField2;
	@FindBy(xpath="//input[@id=\"information_3\"]")private WebElement addInfoField3;
	@FindBy(xpath="//input[@id=\"information_4\"]")private WebElement addInfoField4;
	@FindBy(xpath="//input[@id=\"information_5\"]")private WebElement addInfoField5;
	@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
	

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
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		//@FindBy(xpath="")private WebElement ;
		
		
		public E_manualAlarm (WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		
		public void manualAlarmCommon ( WebDriver driver ) throws Throwable
		{
			manualAlarmModule.click();
			Thread.sleep(2000);
			manageAlarm.click();
			Thread.sleep(2000);
			
			
		}
		
		
		public void manualAlarmByAttribute ( WebDriver driver,String date ) throws Throwable
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
			titlefield.click();
			Thread.sleep(2000);
			act.sendKeys("BG-manual alarm by attribute-"+date).build().perform();
			Thread.sleep(2000);
			descriptionField.click();
			Thread.sleep(2000);
			act.sendKeys("BG-manual alarm by attribute checking.").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
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
			adressFeild.click();
			Thread.sleep(2000);
			act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			dragMarkerOnMapCheckBox.click();
			Thread.sleep(2000);
			grenrateAlarmButton.click();
			Thread.sleep(2000);
			alarmYesButton.click();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			
		}
		
		
		
		public void manualAlarmByResource( WebDriver driver,String date ) throws Throwable
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
			titlefield.click();
			Thread.sleep(2000);
			act.sendKeys("BG-manual alarm by resource-"+date).build().perform();
			Thread.sleep(2000);
			descriptionField.click();
			Thread.sleep(2000);
			act.sendKeys("BG-manual alarm by resource checking.").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			userTypeResource.click();
			Thread.sleep(2000);
			selectAllCheckBox.click();
			Thread.sleep(2000);
			selectAllCheckBox.click();
			Thread.sleep(2000);
			ADST06R2.click();
			Thread.sleep(2000);
			adressFeild.click();
			Thread.sleep(2000);
			act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			dragMarkerOnMapCheckBox.click();
			Thread.sleep(2000);
			grenrateAlarmButton.click();
			Thread.sleep(2000);
			alarmYesButton.click();
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			Thread.sleep(3000);
			
		}
		public void manualAlarmByFireFighter( WebDriver driver,String date ) throws Throwable
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
		titlefield.click();
		Thread.sleep(2000);
		act.sendKeys("BG-manual alarm by firefighter-"+date).build().perform();
		Thread.sleep(2000);
		descriptionField.click();
		Thread.sleep(2000);
		act.sendKeys("BG-manual alarm by firefighter checking.").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		userTypeFireFighter.click();
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
		jonas2.click();
		Thread.sleep(2000);
		BenMs.click();
		Thread.sleep(2000);
		
		adressFeild.click();
		Thread.sleep(2000);
		act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		dragMarkerOnMapCheckBox.click();
		Thread.sleep(2000);
		grenrateAlarmButton.click();
		Thread.sleep(2000);
		alarmYesButton.click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
}
		
		
		public void manualAlarmByEscalationResource( WebDriver driver,String date ) throws Throwable
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
			titlefield.click();
			Thread.sleep(2000);
			act.sendKeys("BG-manual alarm by escalation resource-"+date).build().perform();
			Thread.sleep(2000);
			descriptionField.click();
			Thread.sleep(2000);
			act.sendKeys("BG-manual alarm by escalation resource checking.").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			userTypeResource.click();
			Thread.sleep(2000);
			selectAllCheckBox.click();
			Thread.sleep(2000);
			selectAllCheckBox.click();
			Thread.sleep(2000);
			ADST06REsc.click();
			Thread.sleep(2000);
			adressFeild.click();
			Thread.sleep(2000);
			act.sendKeys("BAPS Swaminarayan mandir, Wathoda Layout, Nagpur, Maharashtra 440035").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(2000);
			dragMarkerOnMapCheckBox.click();
			Thread.sleep(2000);
			grenrateAlarmButton.click();
			Thread.sleep(2000);
			alarmYesButton.click();
			Thread.sleep(3000);
			
			driver.navigate().refresh();
			Thread.sleep(3000);
			
		}
		
		
		public void sendMassageToAlarmUser( WebDriver driver,String date ) throws Throwable
		{
			Actions act = new Actions (driver);
			
			searchField.click();
			Thread.sleep(2000);
			act.sendKeys("BG").build().perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(2000);
			chatOptions.click();
			Thread.sleep(2000);
			writeMassageField.click();
			Thread.sleep(2000);
			act.sendKeys("Massage-alarm users").build().perform();
			Thread.sleep(2000);
			sendMassageButton.click();
			Thread.sleep(2000);;
			
		}
		
		public void extendAlarm( WebDriver driver,String date ) throws Throwable
		{
			Actions act = new Actions (driver);
			searchField.click();
			Thread.sleep(2000);
			act.sendKeys("BG").build().perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(2000);
			extendAlarmButton.click();
			Thread.sleep(2000);
			fireStationField.click();
			Thread.sleep(2000);
			act.sendKeys("07").build().perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			userTypeAttribute.click();
			Thread.sleep(5000);
			
			selectAllCheckBox.click();
			Thread.sleep(2000);
			selectAllCheckBox.click();
			Thread.sleep(2000);
			ADST07A2.click();
			Thread.sleep(2000);
			addInfoField1.click();
			Thread.sleep(2000);
			act.sendKeys("additional info 1").build().perform();
			Thread.sleep(2000);
			addInfoField2.click();
			Thread.sleep(2000);
			act.sendKeys("additional info 2").build().perform();
			Thread.sleep(2000);
			addInfoField3.click();
			Thread.sleep(2000);
			act.sendKeys("additional info 3").build().perform();
			Thread.sleep(2000);
			addInfoField4.click();
			Thread.sleep(2000);
			act.sendKeys("additional info 4").build().perform();
			Thread.sleep(2000);
			addInfoField5.click();
			Thread.sleep(2000);
			act.sendKeys("additional info 5").build().perform();
			Thread.sleep(2000);
			save.click();
			Thread.sleep(5000);
		
		
		
		}
		
		
		
		
		
		
		
		
		public void deleteAlarms( WebDriver driver,String date ) throws Throwable
		{
			Actions act = new Actions (driver);
			manualAlarmModule.click();
			Thread.sleep(2000);
			manageAlarm.click();
			Thread.sleep(2000);
			
			
			
			
		for (int i=1;i<=100;i++)	
		{
			searchField.click();
			Thread.sleep(2000);
			act.sendKeys("BG").build().perform();
			Thread.sleep(2000);
			searchButton.click();
			Thread.sleep(2000);
			delete.click();
			Thread.sleep(2000);
			deleteYes.click();
			Thread.sleep(2000);
			Reporter.log("Alarm number-"+i+" is deleted sucessfully.", true);
			driver.navigate().refresh();
			Thread.sleep(2000);
			
		}
			
		}
			
		
		
		
		
}