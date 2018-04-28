package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
	private BatailleNavaleLayout bnl = new BatailleNavaleLayout();
	private SetUpPanelJ1 suJ1 = new SetUpPanelJ1();
	private SetUpPanelJ2 suJ2 = new SetUpPanelJ2();
	private InGamePanel1 igJ1 = new InGamePanel1();
	private InGamePanel2 igJ2 = new InGamePanel2();
	
	public BatailleNavaleLayout() {
		
	}
}
