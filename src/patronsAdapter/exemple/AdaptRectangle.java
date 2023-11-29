package patronsAdapter.exemple;

public class AdaptRectangle implements Icarre {

	
	
	Rectangle rect;
	

	public AdaptRectangle(Rectangle rect) {
		super();
		this.rect = rect;
	}

	@Override
	public float Aire() {
		// TODO Auto-generated method stub
		
		return rect.Aire();
	}

	@Override
	public float Périmètre() {
		// TODO Auto-generated method stub
		return rect.périmètre();
	}

}
