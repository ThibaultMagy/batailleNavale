package batailleNavale;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerrainPhysique extends Terrain {
	//ATTRIBUTS
	private Bouton[][] bouton;

	//CONSTRUCTEURS
	public TerrainPhysique(int taille) {
		super(taille);
		bouton = new Bouton[taille][taille];
		this.setLayout(new GridLayout(taille,taille));
		setTerrain(taille);
	}
	public TerrainPhysique() {
		this.setPreferredSize(new Dimension(500,500));
		bouton = new Bouton[TAILLE][TAILLE];
		this.setLayout(new GridLayout(TAILLE,TAILLE));
		setTerrain(TAILLE);
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
	//Set un terrain
	private void setTerrain(int taille) {
		for(int i=0; i<taille; i++) {
			for(int j=0; j<taille; j++) {
				bouton[i][j] = new Bouton();
				if(i==0 || j==0) {
					if(i==0 && j>0) {
						bouton[i][j].setText(Character.toString((char) ('a'+(j-1))));
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
	//Methode permettant la mise en place d'un bateau
	public void placerBateau(Bateau b,int i, int j) {
		if(!b.isTurned() && j+b.getX()>this.getTaille()) {
			System.out.println("Impossible de placer le beateu ici");
		}
		else if(b.isTurned() && i+b.getX()>this.getTaille()) {
			System.out.println("Impossible de placer le bateau ici");
		}
		else if(!b.isTurned()) {
			
			for(int y=j; y<j+b.getX();y++) {
				this.setTerrainEtat(1, i, j);
				verBout(bouton[i][j]);
			}
		}
		else {
			for(int x=i; i<i+b.getX();i++)
				this.setTerrainEtat(1, i, j);
				verBout(bouton[i][j]);
		}
	}
	//Changer la couleur d'un bouton
}
