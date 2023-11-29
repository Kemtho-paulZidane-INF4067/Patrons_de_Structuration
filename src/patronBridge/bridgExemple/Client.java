package patronBridge.bridgExemple;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//rectangle de couleur rouge
		Forme s1=new Rectangle(new CouleurRouge());
		s1.colorier();
		
		//cercle de couleur rouge:
		Forme C1=new Cercle(new CouleurRouge());
		C1.colorier();
		
		//rectangle de couleur Bleu
		Forme s2=new Rectangle(new CouleurBleu());
		s2.colorier();
		
		//cercle de couleur Bleu
		Forme C2=new Cercle(new CouleurBleu());
		C2.colorier();
	}

}
