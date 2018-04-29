package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.LayoutManager;
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
	private BatailleNavaleWindow bnw;
	private SetUpPanel j1su = new SetUpPanel();
	private SetUpPanel j2su = new SetUpPanel();
	private JButton jbNext = new JButton("Next");

	BorderLayout bl = new BorderLayout();
	//private InGamePanel1 igJ1 = new InGamePanel1();
	//private InGamePanel2 igJ2 = new InGamePanel2();
	
	public BatailleNavaleLayout(BatailleNavaleWindow bnw) {
		this.setLayout(bl);
		this.bnw=bnw;
		bnw.setContentPane(j1su);
		bnw.repaint();
		bnw.revalidate();
		System.out.println("Premier panel");
		jbNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bnw.setContentPane(j2su);
				bnw.repaint();
				bnw.revalidate();
				System.out.println("Nouveau Panel");
			}
		});
		//Positionnement des elements dans le BorderLayout
		//this.add(j1su, BorderLayout.CENTER);
		this.add(jbNext, BorderLayout.SOUTH);
	}
}
