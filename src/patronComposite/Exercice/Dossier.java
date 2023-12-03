package patronComposite.Exercice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Dossier extends Component {

	private String nom;
	private String type="Dossier";
	private List<Component> sousdossiers;
	
	


	public Dossier(String nom) {
		super();
		this.nom = nom;
		this.sousdossiers = new ArrayList<Component>();
	}

	@Override
	public void Decrire() {
		int i;
		// TODO Auto-generated method stub
		System.out.println("..................Dossier "+ this.nom+"..................");
		
		//parcourir les sous éléments
		for( i=0;i<sousdossiers.size();i++) {
			if(sousdossiers.get(i) instanceof Dossier) {
			sousdossiers.get(i).Decrire();
		}else if(sousdossiers.get(i) instanceof Fichier) {
			sousdossiers.get(i).Decrire();
		}
	}
	}
	
	public void Ajouter(Component sousdossier) {
		sousdossiers.add(sousdossier);
	}
	
	 public void Supprimer(Component sousdossier) {
		 int i;
		 for( i=0;i<sousdossiers.size();i++) {
			 if(sousdossiers.get(i)==sousdossier) {
					sousdossiers.remove(i);
				}
		 }
	 }

	 public Component Obtenir(int i) {
		 return sousdossiers.get(i);
		 }
}
