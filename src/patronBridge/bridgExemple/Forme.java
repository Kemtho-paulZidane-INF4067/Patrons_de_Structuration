package patronBridge.bridgExemple;

public abstract class Forme {
	Couleur couleur;
	Forme(Couleur color)
	{
	this.couleur=color;
	}
	abstract public void colorier();
}
