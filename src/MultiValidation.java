import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiValidation {

	public static void main(String[] args) {
		
		String username = "";

		Scanner scan = new Scanner(System.in);
		
		//Calling the method that will get users name and return a message if valid.
		System.out.println(getUserName(scan));
		
		System.out.println("Press enter, please (Is not calling the other method by it self)");
		//Calling the method that will get users email.
		System.out.println(getUserEmail(scan));
		
		System.out.println("Press enter, please (Is not calling the other method by it self)");
		//Calling the method that will get the users phone number.
//		System.out.println(getUserPhone(scan));
		
		System.out.println("Press enter, please (Is not calling the other method by it self)");
		//Calling the method that will get a date from the user.
		System.out.println(getUserDate(scan));
		
		scan.close();
	}


	private static boolean isValid(String userInput, Pattern pattern) {
		
		boolean isValidInput = false;
		
		//Compare sentence with pattern.
		if(pattern.matcher(userInput).matches()) {
			isValidInput = true;
		}
		
		
		return isValidInput;
	}
	
	
	public static String getUserName(Scanner scan) {
		
		//Name: Validating for size and first letter must be capitalized.
		Pattern patternName = Pattern.compile("^(\\b[A-Z]\\w*\\s*{0,30})+$");
		
		
		System.out.println("Please enter your name: ");
		String userName = scan.nextLine();
		
		//Calling method to validate input, ask for another input if invalid
		while (!isValid(userName, patternName)) {
			System.out.println("\nThis is not a valid name.");
			System.out.println("It can only contain letters, no special characters and have 30 characters max.\n");
			System.out.println("Please enter your full name again");
			userName = scan.nextLine();
		}

		//TODO It will return "Thank you if valid.
		return "Thank you";
	}
	

	private static String getUserDate(Scanner scan) {
		
		scan.nextLine();
		//TODO See if it can be with () or not
		System.out.println("Please enter a date: (dd/mm/yyyy) ");
		String userDate = scan.nextLine();
		
		//TODO
		Pattern patternDate = Pattern.compile("^[0,3]?[0,9]/[0,1]?[0,9]/([0,9]{2}?[0,9]{2}+$");
		
		//Calling method to validate input, ask for another input if invalid
		while (!isValid(userDate, patternDate)) {
			System.out.println("\nThis is not a valid date.");
			System.out.println("It must be in the day/month/year format.\n");
			System.out.println("Please enter a date again");
			userDate = scan.nextLine();
		}

		//It will return "Thank you if valid.
		return "Thank you";
	}


	private static String getUserPhone(Scanner scan) {
		
		scan.nextLine();
		//TODO See if it can be with () or not
		System.out.println("Please enter your phone number: (Separated by a hifen) ");
		String userPhone = scan.nextLine();
		
		//TODO
		Pattern patternPhone = Pattern.compile("^\\d{3}-\\d{3}-\\d{4}$");
		
		//Calling method to validate input, ask for another input if invalid
		while (!isValid(userPhone, patternPhone)) {
			System.out.println("\nThis is not a valid phone number.");
			System.out.println("It can only contain numbers and must be separated by a hifen.\n");
			System.out.println("Please enter your phone number again");
			userPhone = scan.nextLine();
		}

		//It will return "Thank you if valid.
		return "Thank you";
	}


	private static String getUserEmail(Scanner scan) {
	
		scan.nextLine();
		System.out.println("Please enter your email: ");
		String userEmail = scan.nextLine();
		
		//TODO Email: Validating for size, alphanumeric chars, underscore and dot.
		Pattern patternEmail = Pattern.compile("^[a-z0-9_\\.]{5,30}\\@[a-z0-9]{5,10}[\\.]{1}[a-z]{2,3}$");
		
		//Calling method to validate input, ask for another input if invalid
		while (!isValid(userEmail, patternEmail)) {
			System.out.println("\nThis is not a valid email.");
			System.out.println("It can not contain special characters beyond the @.\n");
			System.out.println("Please enter your email again");
			userEmail = scan.nextLine();
		}

		//It will return "Thank you if valid.
		return "Thank you";
	}
		
		

}
