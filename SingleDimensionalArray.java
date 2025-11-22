public class SingleDimensionalArray{
	public static void main(String[] agrgs){
		String[] names = {"Kahalan","p'Ling","p'Orm","Jemma","Ala"};
		int[] ages = {17,30,23,15,18};
		
		for(int i = 0; i < 5; i++){
			System.out.printf("%s you are %d years old%n", names[i],ages[i]);
		}
	}
}	