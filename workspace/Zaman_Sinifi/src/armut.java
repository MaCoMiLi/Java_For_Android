
public class armut {
	
	private int saat;
	private int dakika;
	private int saniye;
	
	public void zamanayar(int sa, int d, int san){
		
		saat = ((sa>=0 && sa<24) ? sa : 0);
		dakika = ((d>=0 && d<60) ? d : 0);
		saniye = ((san>=0 && san<60) ? san : 0);	
	}
	
	public String sayac(){
		
		return String.format("%02d:%02d:%02d", saat, dakika, saniye);
		
	}

}
