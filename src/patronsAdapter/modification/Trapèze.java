package patronsAdapter.modification;

public class Trapèze {
	private float Gbase;
	private float Pbase;
	private float Hauteur;
	private float cotè1;
	private float coté2;
	
	
	
	public Trapèze(float gbase, float pbase, float hauteur, float cotè1, float coté2) {
		this.Gbase = gbase;
		this.Pbase = pbase;
		this.Hauteur = hauteur;
		this.cotè1 = cotè1;
		this.coté2 = coté2;
	}
	public float Aire() {
		return (Gbase+Pbase)*Hauteur/2;
	}
	public float périmètre() {
		return Gbase+Pbase+cotè1+coté2;
	}
	

}
