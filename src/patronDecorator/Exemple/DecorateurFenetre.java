package patronDecorator.Exemple;

public abstract class DecorateurFenetre extends Fenetre {

	protected Fenetre fenetre;

	public DecorateurFenetre(Fenetre fenetre) {
		super();
		this.fenetre = fenetre;
	}
	
	
}
