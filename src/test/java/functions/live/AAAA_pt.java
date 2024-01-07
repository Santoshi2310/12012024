package functions.live;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class AAAA_pt 
{

	
	public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();
        
        // Get the day of the week as a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday)
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        
        System.out.println("Today's date: " + today);
        System.out.println("Day of the week (number): " + dayOfWeekNumber);
    }	
	
	
	
	
	
}
