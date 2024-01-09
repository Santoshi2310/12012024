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
		
		// Get today's date
        LocalDate today = LocalDate.now();

        // Get today's day of the week
        DayOfWeek todaysDay = today.getDayOfWeek();

        // Format today's day using DateTimeFormatter
        String formattedTodaysDay = todaysDay.getDisplayName(
                java.time.format.TextStyle.FULL, 
                Locale.getDefault()
        );

        // Display today's day
        System.out.println("Today's day: " + formattedTodaysDay);
	    }
    	
	
	
	
	
	
}
