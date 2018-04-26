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
		taille = new int[x][1]; 
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
			taille = new int[1][x];
			turned=true;
		}
		else {
			taille = new int[x][1];
			turned=false;
		}
	}
}
