package patronDecorator.modification;

public class DecorateurDiminutionLuminosité extends DecorateurFenetre{

	public DecorateurDiminutionLuminosité(Fenetre fenetre) {
		super(fenetre);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String dessiner() {
		return fenetre.dessiner()+ "  Diminution de la luminosité";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String decrire() {
		// TODO Auto-generated method stub
		return fenetre.decrire()+ "  Diminution de la luminosité";
		
	}
	

}
