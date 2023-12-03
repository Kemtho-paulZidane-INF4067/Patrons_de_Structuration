package patronComposite.Exercice;

public class FichierTXT extends Fichier {

	
	
	
	


	public FichierTXT(String nom) {
		super();
		this.nom = nom;
		this.type="txt";
		
	}




	@Override
	public void Decrire() {
		// TODO Auto-generated method stub
		System.out.println("fichier "+ this.nom+"."+this.type);
		
	}

}
