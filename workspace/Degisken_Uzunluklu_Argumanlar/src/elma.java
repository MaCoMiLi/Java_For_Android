
public class elma {
	
	public static void main(String[] args){
		
		System.out.println(ortalama(21,45,7,4));
		
	}
	
	public static int ortalama(int...sayılar){
		
		int total = 0;
		for(int x:sayılar)
			total+=x;
		
		return total/sayılar.length;
		
	}

}
