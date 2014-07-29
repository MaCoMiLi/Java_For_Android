
public class armut {
	
	private String kızın_ismi;
	public void isimbelirle(String name){
		
		kızın_ismi=name;
		
	}
	
	public String isimedin(){
		
		return kızın_ismi;
		
	}
	
	public void soyle(){
		
		System.out.printf("İlk kız arkadaşının ismi %s", isimedin());
		
	}



}
