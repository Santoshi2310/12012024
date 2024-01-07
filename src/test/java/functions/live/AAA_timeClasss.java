package functions.live;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AAA_timeClasss 
{

	String germanyTodaysDate;
	String germanycurrentTime;
	 String germanyTimeAfter15Minutes;
	 String germanyTimeAfter20Minutes;
	
	

	public void catchTime(WebDriver driver) {
		// Specify the Germany time zone
        String germanyTimeZone = "Europe/Berlin";

        // Get the current date and time in the specified time zone
        ZonedDateTime currentGermanDateTime = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());

        // Calculate the time after 15 minutes
        ZonedDateTime germanDateTimeAfter15Minutes = currentGermanDateTime.plusMinutes(15);
        ZonedDateTime germanDateTimeAfter20Minutes = currentGermanDateTime.plusMinutes(20);

        // Format the date and times using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

         germanyTodaysDate = currentGermanDateTime.format(dateFormatter);
         germanycurrentTime = currentGermanDateTime.format(timeFormatter);
        
         germanyTimeAfter15Minutes = germanDateTimeAfter15Minutes.format(timeFormatter);
        
         germanyTimeAfter20Minutes = germanDateTimeAfter20Minutes.format(timeFormatter);
        

        // Display the formatted date and times
//        Reporter.log("Today's date in Germany: " + germanyTodaysDate,true);
//        Reporter.log("Current time in Germany: " + germanycurrentTime,true);
//        Reporter.log("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes,true);
//        Reporter.log("Time in Germany after 15 minutes: " + germanyTimeAfter20Minutes,true);
//        
        
//        System.out.println("Today's date in Germany: " + germanyTodaysDate);
//        System.out.println("Current time in Germany: " + germanycurrentTime);
//        System.out.println("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes);
   
	
		
	
	
	
	
		}
	
	public void catchTime2 (WebDriver driver) {
		// Specify the Germany time zone
        String germanyTimeZone = "Europe/Berlin";

        // Get the current date and time in the specified time zone
        ZonedDateTime currentGermanDateTime = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());

        // Calculate the time after 15 minutes
        ZonedDateTime germanDateTimeAfter15Minutes = currentGermanDateTime.plusMinutes(15);
        ZonedDateTime germanDateTimeAfter20Minutes = currentGermanDateTime.plusMinutes(20);

        // Format the date and times using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

         germanyTodaysDate = currentGermanDateTime.format(dateFormatter);
         germanycurrentTime = currentGermanDateTime.format(timeFormatter);
        
         germanyTimeAfter15Minutes = germanDateTimeAfter15Minutes.format(timeFormatter);
        
         germanyTimeAfter20Minutes = germanDateTimeAfter20Minutes.format(timeFormatter);
        

        // Display the formatted date and times
//        Reporter.log("Today's date in Germany: " + germanyTodaysDate,true);
//        Reporter.log("Current time in Germany: " + germanycurrentTime,true);
//        Reporter.log("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes,true);
//        Reporter.log("Time in Germany after 15 minutes: " + germanyTimeAfter20Minutes,true);
        
        
//        System.out.println("Today's date in Germany: " + germanyTodaysDate);
//        System.out.println("Current time in Germany: " + germanycurrentTime);
//        System.out.println("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes);
   
	
		
	
	
	
	
		}

		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
}
