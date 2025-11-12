import java.util.Scanner;
public class MethodOverLoading{
	public static void main(String[] agrgs){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of Different shapes");
		System.out.println("Enter 1: For Square");
		System.out.println("Enter 2: For Rectangle");
		System.out.println("Enter 3: For Triangle");
		System.out.println("Enter 4: To Exit");
		
	}
	public void perimeter(int a){
		int per = 4 * a;
		System.out.printf("The perimeter of the square is %d%n", per);
	}	
	public void perimeter(int a, int b){
		int per = 2 * (a + b);
		System.out.printf("The perimeter of the rectangle is %d%n", per);
		
	}
	public void perimeter(int a, int b,int c){
		int per = a + b + c;
		System.out.printf("The perimeter of the triangle is %d%n", per);
		
	
	}
}

