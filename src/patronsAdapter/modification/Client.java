package patronsAdapter.modification;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculer l'aire et le périmètre d'un carré
		Carre carre=new Carre(10);
	System.out.println(carre.Aire());
	System.out.println(carre.Périmètre());

	//calculer l'aire et le périmetre d'un rectangle
	
	AdaptRectangle adRectangle=new AdaptRectangle(new Rectangle(12,2));

	System.out.println(" l'aire du rectangle est:"+adRectangle.Aire());
	System.out.println("le périmètre du rectangle est: "+adRectangle.Périmètre());
	
	//calculer l'aire et le périmètre du trapèze
	AdaptTrapèze Adtrapèze=new AdaptTrapèze(new Trapèze(10,5,7,2,3));
	
	System.out.println(" l'aire du trapèze est:"+Adtrapèze.Aire());
	System.out.println("le périmètre du trapèze est: "+Adtrapèze.Périmètre());
	
	
	}

}
