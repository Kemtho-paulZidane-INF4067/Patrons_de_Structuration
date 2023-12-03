package patronComposite.Exercicemodifié;

public class Fichierpdf extends Fichier {

	public Fichierpdf(String nom) {
		super();
		this.nom = nom;
		this.type="pdf";
	}




	@Override
	public void Decrire() {
		// TODO Auto-generated method stub
		System.out.println("fichier "+ this.nom+"."+this.type);
		
	}

}
