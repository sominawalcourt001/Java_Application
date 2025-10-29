public class TypeCasting{
	public static void main(String[] agrgs){
		//widening 
		double num = 10;
		
		System.out.printf("The value is %f",num);
		
		//narrowing 
		double price = 32.89;
		int result = (int)price;
		System.out.printf("The value is %d%n",result);
	}
}