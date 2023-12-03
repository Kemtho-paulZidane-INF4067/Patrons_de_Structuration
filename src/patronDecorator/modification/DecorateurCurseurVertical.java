package patronDecorator.modification;

public class DecorateurCurseurVertical extends DecorateurFenetre{

	public DecorateurCurseurVertical(Fenetre fenetre) {
		super(fenetre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String dessiner() {
		return fenetre.dessiner()+ "  défilement du texte verticalement";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String decrire() {
		// TODO Auto-generated method stub
		return fenetre.decrire()+ "  défilement du texte  verticalement";
		
	}
	

}
