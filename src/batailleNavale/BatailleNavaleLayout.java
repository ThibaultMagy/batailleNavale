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
	private TerrainPhysique j1OwnField;
	private TerrainPhysique j1EnemyField;
	private TerrainPhysique j2OwnField;
	private TerrainPhysique j2EnemyField;
	
	//BORDERLAYOUT
	BorderLayout bl = new BorderLayout();
	
	public BatailleNavaleLayout() {
		TerrainPhysique j1EnemyField = new TerrainPhysique();
		TerrainPhysique j1OwnField = new TerrainPhysique();
		TerrainPhysique j2EnemyField = new TerrainPhysique();
		TerrainPhysique j2OwnField = new TerrainPhysique();
		
		this.setLayout(bl);
		
		
		
		this.add(j1EnemyField, BorderLayout.WEST);
		this.add(j1OwnField, BorderLayout.EAST);
		
	}
}
