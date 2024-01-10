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
	String germanyTimeAfter9Minutes;
	String germanyTimeAfter11Minutes;
	
	String germanyTimeAfter22Minutes;
	String germanyTimeAfter67Minutes;
	String germanyTimeAfter82Minutes;
	 
	 String germanyTomorrowDate2;
	 String germanyDateAfterTwoDyas;
	 String TodaysDay;
	 String dayTow;
	 String dayFour;
	

	public void catchTime(WebDriver driver) throws Throwable {
		// Specify the Germany time zone
        String germanyTimeZone = "Europe/Berlin";

        // Get the current date and time in the specified time zone
        ZonedDateTime currentGermanDateTime = ZonedDateTime.now(TimeZone.getTimeZone(germanyTimeZone).toZoneId());

        // Calculate the time after 15 minutes
        ZonedDateTime germanDateTimeAfter7Minutes = currentGermanDateTime.plusMinutes(7);
        ZonedDateTime germanDateTimeAfter9Minutes = currentGermanDateTime.plusMinutes(9);
        ZonedDateTime germanDateTimeAfter11Minutes = currentGermanDateTime.plusMinutes(11);
        
        ZonedDateTime germanDateTimeAfter22Minutes = currentGermanDateTime.plusMinutes(22);
        

        // Format the date and times using DateTimeFormatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

         germanyTodaysDate = currentGermanDateTime.format(dateFormatter);
         germanycurrentTime = currentGermanDateTime.format(timeFormatter);
        
         germanyTimeAfter7Minutes = germanDateTimeAfter7Minutes.format(timeFormatter);
         germanyTimeAfter9Minutes = germanDateTimeAfter9Minutes.format(timeFormatter);
         germanyTimeAfter11Minutes = germanDateTimeAfter11Minutes.format(timeFormatter);
         
         
         
        
         germanyTimeAfter22Minutes = germanDateTimeAfter22Minutes.format(timeFormatter);
         
         
        

        // Display the formatted date and times
//        Reporter.log("Today's date in Germany: " + germanyTodaysDate,true);
//        Reporter.log("Current time in Germany: " + germanycurrentTime,true);
//        Reporter.log("Time in Germany after 7 minutes: " + germanyTimeAfter7Minutes,true);
//        Reporter.log("Time in Germany after 9 minutes: " + germanyTimeAfter9Minutes,true);
//        Reporter.log("Time in Germany after 11 minutes: " + germanyTimeAfter11Minutes,true);
//        Reporter.log("Time in Germany after 22 minutes: " + germanyTimeAfter22Minutes,true);
//        
//        Thread.sleep(10000);
        
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
        
        
        
        
     
	    
		
	
	
	
	
		}
	
	public void getDays (WebDriver driver) 
	
	
	{
	
		// Get today's date
        LocalDate today = LocalDate.now();

        // Get today's day of the week
        DayOfWeek todaysDay = today.getDayOfWeek();

        // Format today's day using DateTimeFormatter
        TodaysDay = todaysDay.getDisplayName(java.time.format.TextStyle.FULL,Locale.getDefault() );

        // Display today's day
   
        
        
        
       

        // Calculate the date after two days
        LocalDate dateAfterTwoDays = today.plusDays(2);
        LocalDate dateAfterFourDays = today.plusDays(4);

        // Get the day of the week for the date after two days
        DayOfWeek dayOfWeekAfterTwoDays = dateAfterTwoDays.getDayOfWeek();
        DayOfWeek dayOfWeekAfterForeDays = dateAfterFourDays.getDayOfWeek();
        

        // Format the date and day of the week using DateTimeFormatter
        
      dayTow = dayOfWeekAfterTwoDays.getDisplayName(
                java.time.format.TextStyle.FULL, 
                java.util.Locale.getDefault()  );
      
     dayFour = dayOfWeekAfterForeDays.getDisplayName(
                java.time.format.TextStyle.FULL, 
                java.util.Locale.getDefault()  );
        

        // Display the result
        
     
//        System.out.println("Today's day: " + TodaysDay);
//        System.out.println("Day of the week after two days: " + dayTow);
//        
//        System.out.println("Day of the week after two days: " + dayFour);          
//	               
        
        
        
		
		
		
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
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

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
