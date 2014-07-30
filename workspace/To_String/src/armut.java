
public class armut {
	
	private int ay;
	private int gun;
	private int yil;

	public armut(int a, int g, int y){
		
		ay= a;
		gun = g;
		yil = y;
		
		System.out.printf("Bu proje %s tarihi içindir\n", this );
		
	}
	
	public String toString(){
		
		return String.format("%d/%d/%d", gun, ay, yil);
		
	}
	
}
