package string_programs;

public class Model_12 {

	public static void main(String[] args) {
		String text = "This </htmel> is a <?htme: sentence> sentence";
		
		String removeHTML = text.replaceAll("\\<.*?\\>", "");
		System.out.println(removeHTML);
		
		
		
		
		

	}

}
