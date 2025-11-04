//Get 10 numbers from user and find the sum of all the numbers 
import java.util.Scanner;

public class Sum {
	public static void main(String[] agrgs){
		Scanner input = new Scanner(System.in);
		
		int num;
		int i = 1;
		int sum = 0;
		
		    while(i<=10){
				System.out.printf("Enter num%d: ",i);
				num = input.nextInt();
				
				sum += num;
				i++;
			
		}
	}
}