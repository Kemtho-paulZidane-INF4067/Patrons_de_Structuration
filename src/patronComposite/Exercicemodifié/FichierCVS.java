package patronComposite.Exercicemodifié;

public class FichierCVS extends Fichier {

	public FichierCVS(String nom) {
		super();
		this.nom = nom;
		this.type="cvs";
	}




	@Override
	public void Decrire() {
		// TODO Auto-generated method stub
		System.out.println("fichier "+ this.nom+"."+this.type);
		
	}

}
