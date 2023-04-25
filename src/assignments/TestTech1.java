package assignments;
import java.util.Scanner;

public class TestTech1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter day: ");
		int weekdayNumber = s.nextInt(); 
		
		String weekdayName;
		
		if (weekdayNumber==1) {
			weekdayName = "Sunday";
		}
		else if (weekdayNumber==2) {
			weekdayName = "Monday";
		}
		else if (weekdayNumber==3) {
			weekdayName = "Tuesday";
		}
		else if (weekdayNumber==4) {
			weekdayName = "Wednesday";
		}
		else if (weekdayNumber==5) {
			weekdayName = "Thursday";
		}
		else if (weekdayNumber==6) {
			weekdayName = "Friday";
		}
		
		else if (weekdayNumber==7) {
			weekdayName = "Saturday";
		}
				
		else {
			weekdayName = "Wrong Day";
		}
		
		System.out.println("The corrosponding weekday number is: "+ weekdayName);
	}
	

}
