package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
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
	private TerrainPhysique OwnFieldJ1 = new TerrainPhysique();
	private TerrainPhysique OwnFieldJ2 = new TerrainPhysique();
	private JLabel jlChoixPosJ = new JLabel(", placez vos bateaux sur la grille");
	//private SetUpPanel j2su = new SetUpPanel();
	private JButton jbNext = new JButton("Next");
	private JLabel erreurJ1 = new JLabel(OwnFieldJ1.getErreur());
	private JLabel erreurJ2 = new JLabel(OwnFieldJ2.getErreur());
	
	
	
	

	BorderLayout bl = new BorderLayout();
			
		public BatailleNavaleLayout(BatailleNavaleWindow bnw) {
		JPanel Error = new JPanel();
		Error.setLayout(new BoxLayout(Error,BoxLayout.X_AXIS));
		Error.add(erreurJ1);
		Error.add(erreurJ2);
		erreurJ2.setVisible(false);
		JPanel Grid = new JPanel();
		Grid.setLayout(new BoxLayout(Grid,BoxLayout.X_AXIS));
		Grid.add(OwnFieldJ1);
		Grid.add(OwnFieldJ2);
		OwnFieldJ2.setVisible(false);
		Font titleFont = new Font("Arial", Font.BOLD, 28);
		jlChoixPosJ.setFont(titleFont);
		jlChoixPosJ.setHorizontalAlignment(SwingConstants.CENTER);
		this.setLayout(bl);
		System.out.println("Premier panel");
		


		

		//TEST
		SousMarin m = new SousMarin();
		m.rotation();
		OwnFieldJ1.placerBateau(m, 9, 1);

		
		jbNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OwnFieldJ1.setVisible(false);
				OwnFieldJ2.setVisible(true);
				jlChoixPosJ.setText("Joueur 2, placez vos bateaux sur la grille");
				System.out.println("Nouveau Panel");
				erreurJ1.setVisible(false);
				erreurJ2.setVisible(true);
				
			}
		});
		//Positionnement des elements dans le BorderLayout
		//this.add(j1su, BorderLayout.CENTER);
		this.add(Error, BorderLayout.CENTER);
		this.add(jlChoixPosJ, BorderLayout.NORTH);
		this.add(Grid, BorderLayout.EAST);
		this.add(jbNext, BorderLayout.SOUTH);

	}
}
