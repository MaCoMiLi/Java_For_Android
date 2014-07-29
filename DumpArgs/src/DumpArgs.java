/**
 * 
 * @author Anil Celebi
 * @version 1.0.0
 * @since 27.07.2014
 *
 */
import java.util.Scanner;

public class DumpArgs
{
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		onur onurObject = new onur();
		
		System.out.println("İsmini buraya yaz: ");
		String name = input.nextLine();
		
		onurObject.simpleMessage(name);
		
		
	}
	
}