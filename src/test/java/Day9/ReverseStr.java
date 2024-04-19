package Day9;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "This is my world";
		String output = reverse(input);
		System.out.println(output);
	}
	
	// There is no built-in reverse method for strings in Java
	// There is one with String Builder, which does not give the output we want
	private static String reverse(String input) {
		String reverse = "";
		
		if (input == null || input.isEmpty()) {
			System.out.println("Empty and null strings are not accepted");
		}
		
		if (input.length() <= 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			
			for (String item : originalArray) { 
				reverse = item + " " + reverse; 
			}
		}
		
		return reverse.trim();


	}

}
