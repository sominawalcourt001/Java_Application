public class SingleDimensionalArray1{
	public static void main(String[] agrgs){
		String[] names = new String[]{"Kahalan","P'Ling","P'Orm","Jemma","Ala"};
		int[] ages = new int[] {17,30,23,15,18};
		
		for(int i = 0; i < 5; i++){
			System.out.printf("%s you are %d years old%n", names[i],ages[i]);
		}
	}
}	
