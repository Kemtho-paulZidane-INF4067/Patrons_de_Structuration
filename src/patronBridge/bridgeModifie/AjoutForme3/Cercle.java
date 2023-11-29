package patronBridge.bridgeModifie.AjoutForme3;

public class Cercle extends Forme {

	Cercle(Couleur color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void colorier() {
		System.out.print("Circle filled with ");
		couleur.RemplirCouleur();
		}


}
