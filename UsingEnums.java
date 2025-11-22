import java.util.Scanner;
public class UsingEnums{
	public enum AccountType{
		SAVINGS,
		CURRENT,
		FIXED_DEPOSIT,
	}
	public static void main(String[] agrgs){
		Scanner scan = new Scanner(System.in);
		System.out.println("");
		
		System.out.println("Enter Account type as (SAVINGS, CUURENT OR FIXED_DEPOSIT): ");
		System.out.println("");
		
		System.out.print("Please enter account type: ");
		String userChoice = scan.nextLine().toUpperCase();
		
		AccountType selectedType = null;
		
		if(userChoice.equals("SAVINGS")){
			selectedType = AccountType.SAVINGS;
			System.out.println("Your account was created succesfully");
		}
		else if(userChoice.equals("CURRENT")){
			selectedType = AccountType.CURRENT;	
			System.out.println("Your account was created succesfully");
			
		}
		else if(userChoice.equals("FIXED_DEPOSIT")){
			selectedType = AccountType.FIXED_DEPOSIT;
			System.out.println("Your account was created succesfully ");
			
		}
        if (selectedType != null){
			System.out.println("Selected account type is " + selectedType);
		}
		else{
			System.out.println("Invalid AccountType ");
		}
	}
}