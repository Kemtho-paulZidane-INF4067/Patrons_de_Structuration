package patronBridge.bridgExemple;

public class Rectangle extends Forme {

	Rectangle(Couleur color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void colorier() {
		System.out.print("Rectangle filled with ");
		couleur.RemplirCouleur();
		}


}
