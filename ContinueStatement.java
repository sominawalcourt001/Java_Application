public class ContinueStatement{
	public static void main(String[] agrgs){
		int i  =1;
		while(i <= 10){
			
			if(i == 5 || i == 9){
			
			System.out.println("This line was skipped");
			i++;
			continue;
			}
		
		System.out.println("Testing the continue statement ");
		i++;
		
				
		}
	}
}
