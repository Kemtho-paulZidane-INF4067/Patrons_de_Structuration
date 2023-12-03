package patronDecorator.Exemple;

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
		
		//décorer la fénêtre avec le curseur horizontal
		System.out.println("                   décorer  la fénêtre précédente avec le curseur horizontal                               \n");
		
		f=new DecorateurCurseurHorizontal(f);
		System.out.println(f.dessiner());
		System.out.println(f.decrire());
		
		System.out.println("                   décorer  la fénêtre précédente avec le curseur horizontal ensuite vertical puis horizontalement                              \n");
		
		System.out.println(new DecorateurCurseurHorizontal(new DecorateurCurseurVertical(new DecorateurCurseurHorizontal(f))).decrire());
		
		
		
		
	}

}
