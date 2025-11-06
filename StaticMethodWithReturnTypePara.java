import java.util.Scanner;
public class StaticMethodWithReturnTypePara{
	public static void main(String[] agrgs){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter full name: ");
		
		String name = input.nextLine();
		
		String displayName = myName(name);
		System.out.printf("Welcome %s to my website%n",displayName);
		System.out.println("*****************************");
		
		int result = addition(67,45,32);
		
		System.out.printf("The result is %d%n", result);
		System.out.println("******************");
		
	}
	public static String myName (String name) {
		return name;
	}
	public static int addition (int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		
		return sum;
	}
}