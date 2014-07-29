import java.util.Random;

public class elma {
	
	public static void main(String arg[]){
		
		Random dice = new Random();
	
		int sayi;
	
		for(int sayac=1; sayac<=10; sayac++){
			
			sayi =1+dice.nextInt(100);
		
			System.out.println(sayi);
		
		}

	}
}
