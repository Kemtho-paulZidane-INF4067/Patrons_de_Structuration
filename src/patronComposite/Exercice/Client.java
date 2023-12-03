package patronComposite.Exercice;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//création d'un fichierpdf
		System.out.println("      creation du ficfhier patron_de_structuration.pdf et description    \n");
		Fichier fichier=new Fichierpdf("patron_de_structuration");
		fichier.Decrire();
		System.out.println("           \n");
		
		System.out.println("      creation du ficfhier patron_de_structuration.txt et description    \n");
		//création d'un fichierTXT
			Fichier fichiertxt=new FichierTXT("patron_de_structuration");
				fichiertxt.Decrire();
				
				System.out.println("           \n");
				
	    //création d'un dossier
				System.out.println("      creation du Dossier patron_de_structuration en y ajoutant les deux fichiers precédent    \n");
				Dossier dossier=new Dossier("patrons_de_structuration");
	    //ajouter du premier fichier à au dossier
				dossier.Ajouter(fichier);	
	  //ajout du deusieme fichier au dossier
				dossier.Ajouter(fichiertxt);
				System.out.println("    description du dossier   patron_de_structuration     \n");
				dossier.Decrire();
				
				System.out.println("           \n");
				
				System.out.println("      creation du Dossier patron_de_conception en y ajoutant le dossier patron_de_structuration    \n");
				//creation d'un nouveau dossier
				Dossier dossier1=new Dossier("patrons_de_conception");
				//ajout du dossier patron de structurationdans à patron_de_conception
				dossier1.Ajouter(dossier);
				System.out.println("    description du dossier   patron_de_conception     \n");
				dossier1.Decrire();
				System.out.println("           \n");
				
				//ajout du dossier patron_de_construction dans patron_de_conception contenant un fichier de type pdf
				System.out.println("    ajout du dossier patron_de_construction dans patron_de_conception contenant un fichier de type pdf     \n");
				Dossier dossier2=new Dossier("patrons_de_construction");
				//ajout d'un fichier au dossier patrons de construction
				dossier2.Ajouter(new Fichierpdf("patron_de_construction"));
				//ajout du dossier patron_de_construction au dossier patron_de_conception
				dossier1.Ajouter(dossier2);
				
				System.out.println("    description du dossier   patron_de_conception     \n");
				dossier1.Decrire();
				
				System.out.println("           \n");
				
				//supression du dosier patron de construction dans patron de conception

				System.out.println("    supression du dosier patron de construction dans patron de conception    \n");
				
				dossier1.Supprimer(dossier2);
				System.out.println("    description du dossier   patron_de_conception     \n");
				dossier1.Decrire();
				
				//suppression du fichier patron_de_structuration.pdf dans le sous dossier patron_de_structuration de patron_de_conception
System.out.println("    suppression du fichier patron_de_structuration.pdf dans le sous dossier patron_de_structuration de patron_de_conception   \n");
				
                dossier.Supprimer(fichier);
				System.out.println("    description du dossier   patron_de_conception     \n");
				dossier1.Decrire();
				
				//ajout du fichier models.pdf dans le sous dossier patron_de_structuration de patron_de_conception
				System.out.println("    ajout du fichier models.pdf dans le sous dossier patron_de_structuration de patron_de_conception   \n");
								
				                dossier.Ajouter(new Fichierpdf("models"));;
								System.out.println("    description du dossier   patron_de_conception     \n");
								dossier1.Decrire();
								
								
				//retourner le premier élement du dossier patron de construnction
								System.out.println(" description du   premier élement du dossier   patron_de_conception     \n");
								dossier1.Obtenir(0).Decrire();
			    //description du deuxieme élement du dossier patrons de structuration contenu dans le dossier patron de conception	
								System.out.println("             description du deuxieme élement du dossier patrons de structuration contenu dans le dossier patron de conception           \n");
								dossier.Obtenir(1).Decrire();
	}

}
