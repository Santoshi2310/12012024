package functions.live;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B_baseClass 
{
	WebDriver driver;
	public void  browserLounch() throws Throwable
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://live.retteralarm.de/admin/users/login");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
	}
	
	
}
