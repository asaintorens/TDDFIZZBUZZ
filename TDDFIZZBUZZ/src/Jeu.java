
public class Jeu {
	private String BUZZ ="BUZZ";
	private String WIZZ ="FIZZ";
	private int nombre;
	
	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public Jeu() {
		super();
	}

	public  String Parler(int i) {
		
		String res = "";
		
		Boolean modulo3 = i % 3==0;
		Boolean modulo5 = i%5==0;
		
		if (modulo3)
			res += this.BUZZ;
		if (modulo5)
			res += this.WIZZ;
		
		if (!modulo3 && !modulo5)
			res = i+"";
		return res;
	}

}
