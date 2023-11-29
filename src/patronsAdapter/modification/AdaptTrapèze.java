package patronsAdapter.modification;

public class AdaptTrapèze implements Icarre {

	
	
	Trapèze trapèze;
	
	public AdaptTrapèze(Trapèze trapèze) {
		super();
		this.trapèze = trapèze;
	}

	@Override
	public float Aire() {
		// TODO Auto-generated method stub
		
		return trapèze.Aire();
	}

	@Override
	public float Périmètre() {
		// TODO Auto-generated method stub
		return trapèze.périmètre();
	}

}
