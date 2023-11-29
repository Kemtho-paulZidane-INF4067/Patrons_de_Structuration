package patronsAdapter.modification;

public class Carre implements Icarre{

	public float coté; 
	
	
	
	public Carre(float coté) {
		super();
		this.coté = coté;
	}


	public float Aire() {
		// TODO Auto-generated method stub
		return coté*coté;
	}

	
	public float Périmètre() {
		// TODO Auto-generated method stub
		return coté*4;
	}

}
