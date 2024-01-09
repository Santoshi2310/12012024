package functions.live;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.TimeZone;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AAA_timeClasss 
{

	String germanyTodaysDate;
	String germanycurrentTime;
	String germanyTimeAfter7Minutes;
	String germanyTimeAfter22Minutes;
	String germanyTimeAfter67Minutes;
	String germanyTimeAfter82Minutes;
	 
	 String germanyTomorrowDate2;
	 String germanyDateAfterTwoDyas;
	 String TodaysDay;
	

	public void catchTime(WebDriver driver) {
		// Specify the Germany time zone
        String germanyTimeZone = "Europe/Berlin";

        // Get the current date and time in the specified time zone
        ZonedDateTime currentGermanDateTime = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());

        // Calculate the time after 15 minutes
        ZonedDateTime germanDateTimeAfter7Minutes = currentGermanDateTime.plusMinutes(7);
        ZonedDateTime germanDateTimeAfter22Minutes = currentGermanDateTime.plusMinutes(22);
        

        // Format the date and times using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

         germanyTodaysDate = currentGermanDateTime.format(dateFormatter);
         germanycurrentTime = currentGermanDateTime.format(timeFormatter);
        
         germanyTimeAfter7Minutes = germanDateTimeAfter7Minutes.format(timeFormatter);
        
         germanyTimeAfter22Minutes = germanDateTimeAfter22Minutes.format(timeFormatter);
         
         
        

        // Display the formatted date and times
//        Reporter.log("Today's date in Germany: " + germanyTodaysDate,true);
//        Reporter.log("Current time in Germany: " + germanycurrentTime,true);
//        Reporter.log("Time in Germany after 5 minutes: " + germanyTimeAfter5Minutes,true);
//        Reporter.log("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes,true);
        
        
//        System.out.println("Today's date in Germany: " + germanyTodaysDate);
//        System.out.println("Current time in Germany: " + germanycurrentTime);
//        System.out.println("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes);
   
        
        ZoneId germanyTimeZone2 = ZoneId.of("Europe/Berlin");
        
        LocalDate tomorrowInGermany = LocalDate.now(germanyTimeZone2).plusDays(1);
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        germanyTomorrowDate2 = tomorrowInGermany.format(formatter2);
        
        
        LocalDate dateAfterTwoDys = LocalDate.now(germanyTimeZone2).plusDays(3);
        germanyDateAfterTwoDyas = dateAfterTwoDys.format(formatter2);
        		
        
        Reporter.log("date after two days : " +germanyDateAfterTwoDyas ,true);
        
        //System.out.println("Tomorrow's date in Germany: " + germanyTomorrowDate);
        
        
        
        
     // Get today's date
        LocalDate today = LocalDate.now();

        // Get today's day of the week
        DayOfWeek todaysDay = today.getDayOfWeek();

        // Format today's day using DateTimeFormatter
        TodaysDay = todaysDay.getDisplayName(
                java.time.format.TextStyle.FULL, 
                Locale.getDefault()
        );

        // Display today's day
      //  System.out.println("Today's day: " + TodaysDay);
	    
		
	
	
	
	
		}
	
	
	
	
	
	public void catchTime2 (WebDriver driver) {
		// Specify the Germany time zone
		
		
        String germanyTimeZone = "Europe/Berlin";

        // Get the current date and time in the specified time zone
        ZonedDateTime currentGermanDateTime = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());

        // Calculate the time after 15 minutes
        ZonedDateTime germanDateTimeAfter7Minutes = currentGermanDateTime.plusMinutes(7);
        ZonedDateTime germanDateTimeAfter22Minutes = currentGermanDateTime.plusMinutes(22);
        ZonedDateTime germanDateTimeAfter67Minutes = currentGermanDateTime.plusMinutes(67);
        ZonedDateTime germanDateTimeAfter82Minutes = currentGermanDateTime.plusMinutes(82);

        // Format the date and times using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

         germanyTodaysDate = currentGermanDateTime.format(dateFormatter);
         germanycurrentTime = currentGermanDateTime.format(timeFormatter);
        
         germanyTimeAfter7Minutes = germanDateTimeAfter7Minutes.format(timeFormatter);
        
         germanyTimeAfter22Minutes = germanDateTimeAfter22Minutes.format(timeFormatter);
         
         germanyTimeAfter67Minutes = germanDateTimeAfter67Minutes.format(timeFormatter);
         
         germanyTimeAfter82Minutes = germanDateTimeAfter82Minutes.format(timeFormatter);
        

         
         
         // Second day date 
      
         
         
         
        // Display the formatted date and times
//        Reporter.log("Today's date in Germany: " + germanyTodaysDate,true);
//        Reporter.log("Current time in Germany: " + germanycurrentTime,true);
//        Reporter.log("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes,true);
//        Reporter.log("Time in Germany after 15 minutes: " + germanyTimeAfter20Minutes,true);
//         Reporter.log("Time in Germany after 67 minutes: " + germanyTimeAfter67Minutes,true);
//         Reporter.log("Time in Germany after 82 minutes: " + germanyTimeAfter82Minutes,true);
        
        
//        System.out.println("Today's date in Germany: " + germanyTodaysDate);
//        System.out.println("Current time in Germany: " + germanycurrentTime);
//        System.out.println("Time in Germany after 15 minutes: " + germanyTimeAfter15Minutes);
   
	
		
	
	
	
	
		}

		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
}
