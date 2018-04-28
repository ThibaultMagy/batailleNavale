package batailleNavale;
import java.awt.Dimension;
import java.awt.GridLayout;

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
				if(i==0 || j==0) {
					if(i==0 && j>0) {
						bouton[i][j].setText("a"+(i-1));
					}
					else if(i>0 && j==0) {
						bouton[i][j].setText(String.valueOf((i-1)+1));
					}
					verBout(bouton[i][j]);
				}
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
				if(i==0 || j==0) {
					if(i==0 && j>0) {
						bouton[i][j].setText("a"+(i-1));
					}
					else if(i>0 && j==0) {
						bouton[i][j].setText(String.valueOf((i)));
					}
					verBout(bouton[i][j]);
				}
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
	//Methode pour verouiller un bouton
	public void verBout(Bouton b) {
		b.setEnabled(false);
	}
	//Changer la couleur d'un bouton
	
}
