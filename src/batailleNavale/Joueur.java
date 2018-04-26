package batailleNavale;

public class Joueur {
	//ATTRIBUTS
	private Bateau bateaux[];
	private boolean etat;
	
	//CONSTRUCTEUR
	public Joueur(Bateau[] bateaux) {
		this.bateaux = bateaux;
		etat = true;
	}
	
	public Joueur(boolean etat) {
		PorteAvion pt = new PorteAvion();
		Croiseur c = new Croiseur();
		ContreTorpilleur ct = new ContreTorpilleur();
		SousMarin sm = new SousMarin();
		Torpilleur tp = new Torpilleur();
		bateaux = new Bateau[]{pt, c, ct, sm, tp};
		etat = true;
	}
	
	
}
