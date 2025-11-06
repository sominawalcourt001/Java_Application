public class StaticMethodWithParameter{
	public static void main(String[] agrgs){
		addition(80.0,5.67,3.4);
		addition(6.0,7.5,9.0);
	}
	public static void addition(double num1, double num2, double num3){
		double sum = num1 + num2 + num3;
			
		System.out.printf("The sum is %.2f%n", sum);
		
	}
}