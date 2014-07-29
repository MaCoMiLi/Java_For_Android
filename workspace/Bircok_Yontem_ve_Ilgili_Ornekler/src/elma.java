import java.util.Scanner;

public class elma {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		armut armutObject = new armut();
		System.out.print("Kız arakadaşının ismini buraya yaz: ");
		String girdi = input.nextLine();
		armutObject.isimbelirle(girdi);
		armutObject.soyle();
		
		
	}

}
