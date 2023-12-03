package patronDecorator.modification;

public class DecorateurAgLuminosité extends DecorateurFenetre{

	public DecorateurAgLuminosité(Fenetre fenetre) {
		super(fenetre);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String dessiner() {
		return fenetre.dessiner()+ "  augmentation de la luminosité";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String decrire() {
		// TODO Auto-generated method stub
		return fenetre.decrire()+ "  augmentation de la luminosité";
		
	}
	

}
