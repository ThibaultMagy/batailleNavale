package batailleNavale;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class BatailleNavaleLayout extends JPanel{
	//Etapes
	//1 Joueur 1 place ses bateaux et confirme son placement
	//Un ecran noir avec un bouton continuer apparait
	//2 Joueur 2 appuis sur continuer et place place ses bateaux
	//-->confirme --> écran noir continuer
	//Joueur 1 joue etc...
	
	//Creation d'un état de placement des bateau
	//A l'etat 2 c'est au joueur 1 de placer ses bateaux
	//A l'etat 1 c'est au joueur 2 de placer ses bateaux
	//A l'état 0 la partie commence
	
	//ELEMENTS
	private Terrain j1OwnField;
	private Terrain j1EnemyField;
	private Terrain j2OwnField;
	private Terrain j2EnemyField;
	
	//BORDERLAYOUT
	BorderLayout bl = new BorderLayout();
	
	public BatailleNavaleLayout() {
		for(int i=0; i<j1OwnField.getTaille(); i++) {
			for(int j=0; j<j1OwnField.getTaille(); j++) {
				//code a faire
			}
		}
		
		
		
		
		
		this.setLayout(bl);
		
		
	}
}
