import java.util.Dictionary;
import java.util.Scanner;
import java.util.Hashtable;
public class dict {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Dictionary <String, String> weekDays = new Hashtable<>();
		weekDays.put("MO", "Monday");
		weekDays.put("TU", "Tuesday");
		weekDays.put("WD", "Wednesday");
		weekDays.put("TH", "Thursday");
		weekDays.put("FD", "Friday");
		weekDays.put("SA", "Saturday");
		weekDays.put("SU", "Sunday");
		
		System.out.print("Day (MO, TU, WD, TH, FD, SA, SU): ");
		String weekDay = scan.nextLine();
		
		System.out.println("Day of the week: " + weekDays.get(weekDay));
	}

}
