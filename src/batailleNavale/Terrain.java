package batailleNavale;
import javax.swing.JPanel;

public class Terrain extends JPanel{
	//ATTRIBUTS
	private int taille;
	private int terrain[][];
	protected static final int TAILLE = 10;
	
	//CONSTRUCTEUR
	//0 case non vide non touchée --> Affichage blanc
	//1 case vide touchée --> Affichage gris
	//2 case occupée non touchée --> verte
	//3 case occupée touchée --> rouge
	public Terrain(int taille) {
		this.taille = taille;
		this.terrain = new int[taille][taille];
		for(int i=0; i<taille; i++) {
			for(int j=0; j<taille; j++) {
				terrain[i][j]=0;
			}
		}
	}
	
	public Terrain() {
		this(TAILLE);
	}

	//GETTERS SETTERS
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int[][] getTerrain() {
		return terrain;
	}
	public void setTerrain(int[][] terrain) {
		this.terrain = terrain;
	}
}