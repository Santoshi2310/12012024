package functions.live;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class AAAA_pt 
{

	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();

        // Calculate the date after two days
        LocalDate dateAfterTwoDays = today.plusDays(2);
        LocalDate dateAfterFourDays = today.plusDays(4);

        // Get the day of the week for the date after two days
        DayOfWeek dayOfWeekAfterTwoDays = dateAfterTwoDays.getDayOfWeek();
        DayOfWeek dayOfWeekAfterForeDays = dateAfterFourDays.getDayOfWeek();
        

        // Format the date and day of the week using DateTimeFormatter
        
        String dayOfWeekStringTow = dayOfWeekAfterTwoDays.getDisplayName(
                java.time.format.TextStyle.FULL, 
                java.util.Locale.getDefault()
        );
        String dayOfWeekStringFour = dayOfWeekAfterForeDays.getDisplayName(
                java.time.format.TextStyle.FULL, 
                java.util.Locale.getDefault()
        );
        

        // Display the result
     
        System.out.println("Day of the week after two days: " + dayOfWeekStringTow);
        
        System.out.println("Day of the week after two days: " + dayOfWeekStringFour);          
	               
	        
	    
        
        
        
        }
	
	
	
	
	
	
}
