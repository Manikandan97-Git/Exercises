package string_programs;
import java.time.*;
import java.time.format.*;
public class Model_8 {

	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Default format date and time " + dateTime);
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String format = dateTime.format(pattern);
		
		System.out.println("New format date and time " + format);
		

	}

}
