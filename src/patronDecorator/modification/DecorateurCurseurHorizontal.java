package patronDecorator.modification;

public class DecorateurCurseurHorizontal extends DecorateurFenetre {

	public DecorateurCurseurHorizontal(Fenetre fenetre) {
		super(fenetre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String dessiner() {
		return fenetre.dessiner()+ "  défilement du texte horizotalement";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String decrire() {
		// TODO Auto-generated method stub
		return fenetre.decrire()+ "  défilement du texte  horizotalement";
		
	}
	

}
