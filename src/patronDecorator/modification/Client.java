package patronDecorator.modification;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creer une fenêtre 
		Fenetre f;
		f=new FenetreSimple();
		//dessiner et décrire
		System.out.println(f.dessiner());
		System.out.println(f.decrire());
		
		
		//décorer la fénêtre avec le curseur vertical
		System.out.println("                   décorer la fénêtre précédente avec le curseur vertical                              \n ");
		f=new DecorateurCurseurVertical(f);
		System.out.println(f.dessiner());
		System.out.println(f.decrire());
		
		//décorer la fénêtre en diminuant la luminosité
				System.out.println("                   décorer la fénêtre précédente en diminiant la luminosité                              \n ");
				f=new DecorateurDiminutionLuminosité(f);
				System.out.println(f.dessiner());
				System.out.println(f.decrire());
				
		
		//décorer la fénêtre avec le curseur horizontal
		System.out.println("                   décorer  la fénêtre précédente avec le curseur horizontal  et augmentation de la luminosité                             \n");
		
		f=new DecorateurCurseurHorizontal(new DecorateurAgLuminosité(f));
		System.out.println(f.dessiner());
		System.out.println(f.decrire());
		
		System.out.println("                   décorer  la fénêtre précédente avec le curseur horizontal ,augmentation de la luminosité ensuite vertical puis horizontalement                              \n");
		
		System.out.println(new DecorateurCurseurHorizontal(new DecorateurCurseurVertical(new DecorateurAgLuminosité(new DecorateurCurseurHorizontal(f)))).decrire());
		
		
		
		
	}

}
