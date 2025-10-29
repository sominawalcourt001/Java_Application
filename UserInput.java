import java.util.Scanner;
public class UserInput{
	public static void main (String[] agrgs) {
		Scanner input = new Scanner(System.in);
		
		double bal = 5678.98;
		
		System.out.print("Enter your firstname: ");
		String firstName = input.nextLine();
		
		char dollar = '$';
		
		//System.out.printf("Hello %s", firstName: ");
		
		System.out.print("Enter your lastName: ");
		String lastName = input.nextLine();
		
		System.out.print("Enter your age: ");
		short age = input.nextShort();
		
		System.out.printf("Welcome %s %s to FirstBank", firstName, lastName );
		System.out.printf("You are %d year old %n", age);
		System.out.printf("Your account is %c%2f%n", dollar,bal);
		
	}
}