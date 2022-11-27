import java.util.Scanner;

public class HomeWorkTwo {

	public static void main(String[] args) {
//		Ask the user for a string input. Print out the following
//		Change the user input to all uppercase
//		Change the user input to all lowercase
//		Find out the length of the string
//		Remove all spaces from the string
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userStr = input.nextLine();
		System.out.println("Uppercase: "+ userStr.toUpperCase() );
		System.out.println("Lowercase: "+ userStr.toLowerCase() );
		System.out.println("Length: "+userStr.length() );
		System.out.println(userStr.replace(" ", ""));
		System.out.println(userStr.replace("w", ""));
	}
	

}
