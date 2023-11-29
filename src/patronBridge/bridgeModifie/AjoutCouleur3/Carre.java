package patronBridge.bridgeModifie.AjoutCouleur3;

public class Carre extends Forme {

	Carre(Couleur color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	public void colorier() {
		System.out.print("square filled with ");
		couleur.RemplirCouleur();
		}


}
