package string_programs;

public class Model_13 {

	public static void main(String[] args) {
		String text = "Hi! I am \nManikandan. \nGood \nmorning";
	int	countLine = 1;
		for(int i = 0; i < text.length();i++) {
			if(text.charAt(i)=='\n') {
				countLine++;
			}
		}

System.out.println("Number of line in this string " + countLine);

		  
	}

}
