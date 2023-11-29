package patronBridge.bridgeModifie.AjoutForme3;

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
		
		//carrée de couleur rouge
		Forme carre=new Carre(new CouleurRouge());
		carre.colorier();
		//carrée de couleur bleu
				Forme carrebleu=new Carre(new CouleurBleu());
				carrebleu.colorier();
	}

}
