package batailleNavale;

public class Bateau {
	//ATTRIBUTS
	private boolean turned;
	private int x;
	private int[][] taille;
	//false coulé, true ok
	private boolean etat;
	
	//CONSTRUCTEUR
	public Bateau(int x) {
		this.x = x;
		taille = new int[1][x]; 
		turned = false;
		etat = true;
	}
	
	//METHODES
	//Methode permettant la rotation d'un bateau lors du placement
	public void rotation() {
		if(x==1) {
			System.out.println("Il ne sert a rien d'effectuer une rotation sur un element de taille 1 !");
		}
		else if(turned==false) {
			taille = new int[x][1];
			turned=true;
		}
		else {
			taille = new int[1][x];
			turned=false;
		}
	}
	
	//GETTERS SETTERS
	public boolean isTurned() {
		return turned;
	}
	public void setTurned(boolean turned) {
		this.turned = turned;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int[][] getTaille() {
		return taille;
	}
	public void setTaille(int[][] taille) {
		this.taille = taille;
	}
	public boolean isEtat() {
		return etat;
	}
	public void setEtat(boolean etat) {
		this.etat = etat;
	}
}
