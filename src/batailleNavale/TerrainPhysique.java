package batailleNavale;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TerrainPhysique extends Terrain {
	//ATTRIBUTS
	private Bouton[][] bouton;

	//CONSTRUCTEURS
	public TerrainPhysique(int taille) {
		super(taille);
		this.setPreferredSize(new Dimension(500,500));
		bouton = new Bouton[taille][taille];
		this.setLayout(new GridLayout(taille,taille));
		for(int i=0; i<taille; i++) {
			for(int j=0; j<taille; j++) {
				bouton[i][j] = new Bouton();
				this.add(bouton[i][j]);
			}
		}
	}
	public TerrainPhysique() {
		this.setPreferredSize(new Dimension(500,500));
		bouton = new Bouton[TAILLE][TAILLE];
		this.setLayout(new GridLayout(TAILLE,TAILLE));
		for(int i=0; i<TAILLE; i++) {
			for(int j=0; j<TAILLE; j++) {
				bouton[i][j] = new Bouton();
				this.add(bouton[i][j]);
			}
		}
	}
	
	//METHODES
	//Methode permettant de vérouiller les boutons du terrain
	public void verBoutAll() {
		for(int i=0; i<getTaille(); i++) {
			for(int j=0; j<getTaille(); j++) {
				bouton[i][j].setEnabled(false);
			}
		}
	}
	
}
