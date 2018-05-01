package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.BrokenBarrierException;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class BatailleNavaleLayout extends JPanel {
	// Etapes
	// 1 Joueur 1 place ses bateaux et confirme son placement
	// Un ecran noir avec un bouton continuer apparait
	// 2 Joueur 2 appuis sur continuer et place place ses bateaux
	// -->confirme --> écran noir continuer
	// Joueur 1 joue etc...

	// Creation d'un état de placement des bateau
	// A l'etat 2 c'est au joueur 1 de placer ses bateaux
	// A l'etat 1 c'est au joueur 2 de placer ses bateaux
	// A l'état 0 la partie commence

	// ELEMENTS
	private MenuPanelLayout mpl = new MenuPanelLayout(null);
	private BatailleNavaleWindow bnw;
	private JLabel jlNomJ1;
	private JLabel jlNomJ2;
	private TerrainPhysique OwnFieldJ1 = new TerrainPhysique();
	private TerrainPhysique OwnFieldJ2 = new TerrainPhysique();
<<<<<<< HEAD
	private JLabel jlChoixPosJ = new JLabel(", placez vos bateaux sur la grille");
	//private SetUpPanel j2su = new SetUpPanel();
=======
	private JLabel jlChoixPosJ = new JLabel(jlNomJ1 + ", placez vos bateaux sur la grille");
	private JPanel glAffichageBateauxJ1 = new JPanel();
	private JPanel glAffichageBateauxJ2 = new JPanel();
	
	// private SetUpPanel j2su = new SetUpPanel();
>>>>>>> refs/remotes/origin/master
	private JButton jbNext = new JButton("Next");
<<<<<<< HEAD
	private JLabel erreurJ1 = new JLabel(OwnFieldJ1.getErreur());
	private JLabel erreurJ2 = new JLabel(OwnFieldJ2.getErreur());
	
	
	
	
=======
>>>>>>> refs/remotes/origin/master

	BorderLayout bl = new BorderLayout();
<<<<<<< HEAD
			
		public BatailleNavaleLayout(BatailleNavaleWindow bnw) {
		JPanel Error = new JPanel();
		Error.setLayout(new BoxLayout(Error,BoxLayout.X_AXIS));
		Error.add(erreurJ1);
		Error.add(erreurJ2);
		erreurJ2.setVisible(false);
=======

	public BatailleNavaleLayout(BatailleNavaleWindow bnw) {
		jlNomJ1 = new JLabel(mpl.getNomJoueur1());
		jlNomJ2 = new JLabel(mpl.getNomJoueur2());
		
		//AFFICHAGE BATEAU A PLACER
		//Choix placement horizontal ou vertical
		JRadioButton jrbHorizontal = new JRadioButton("Horizontal");
		JRadioButton jrbVertical = new JRadioButton("Vertical");	
		ButtonGroup group1 = new ButtonGroup();
		group1.add(jrbHorizontal);
		group1.add(jrbVertical);
		//Choix du bateau a placer
		JRadioButton jbrPorteAvion = new JRadioButton("");
		JRadioButton jbrCroiseur = new JRadioButton("");
		JRadioButton jbrContreTorpilleur = new JRadioButton("");
		JRadioButton jbrSousMarin = new JRadioButton("");
		JRadioButton jbrTorpilleur = new JRadioButton("");
		ButtonGroup group2 = new ButtonGroup();
		group2.add(jbrPorteAvion);
		group2.add(jbrCroiseur);
		group2.add(jbrContreTorpilleur);
		group2.add(jbrSousMarin);
		group2.add(jbrTorpilleur);
		//BATEAUX
		TerrainPhysique tpPorteAvion = new TerrainPhysique(1,5);
		TerrainPhysique tpCroiseur = new TerrainPhysique(1,4);
		TerrainPhysique tpContreTorpilleur = new TerrainPhysique(1,3);
		TerrainPhysique tpSousMarin = new TerrainPhysique(1,2);
		TerrainPhysique tpTorpilleur = new TerrainPhysique(1,2);
		//JLABELS
		JLabel nbPorteAvion = new JLabel("1");
		JLabel nbCroiseur = new JLabel("1");
		JLabel nbContreTorpilleur = new JLabel("1");
		JLabel nbSousMarin = new JLabel("1");
		JLabel nbTorpilleur = new JLabel("1");	
		//GRIDLAYOUT
		glAffichageBateauxJ1.setLayout(new GridLayout(10,3));
		glAffichageBateauxJ1.add(new JLabel("Choix : "));
		glAffichageBateauxJ1.add(jrbHorizontal);
		glAffichageBateauxJ1.add(jrbVertical);
		//ADD
		glAffichageBateauxJ1.add(jbrPorteAvion);
		glAffichageBateauxJ1.add(tpPorteAvion);
		glAffichageBateauxJ1.add(nbPorteAvion);
		
		glAffichageBateauxJ1.add(jbrCroiseur);
		glAffichageBateauxJ1.add(tpCroiseur);
		glAffichageBateauxJ1.add(nbCroiseur);
		
		glAffichageBateauxJ1.add(jbrContreTorpilleur);
		glAffichageBateauxJ1.add(tpContreTorpilleur);
		glAffichageBateauxJ1.add(nbContreTorpilleur);
		
		glAffichageBateauxJ1.add(jbrSousMarin);
		glAffichageBateauxJ1.add(tpSousMarin);
		glAffichageBateauxJ1.add(nbSousMarin);
		
		glAffichageBateauxJ1.add(jbrTorpilleur);
		glAffichageBateauxJ1.add(tpTorpilleur);
		glAffichageBateauxJ1.add(nbTorpilleur);
		
		
>>>>>>> refs/remotes/origin/master
		JPanel Grid = new JPanel();
		Grid.setLayout(new BoxLayout(Grid, BoxLayout.X_AXIS));
		Grid.add(OwnFieldJ1);
		Grid.add(OwnFieldJ2);
		OwnFieldJ2.setVisible(false);
		Font titleFont = new Font("Arial", Font.BOLD, 28);
		jlChoixPosJ.setFont(titleFont);
		jlChoixPosJ.setHorizontalAlignment(SwingConstants.CENTER);
		this.setLayout(bl);
		System.out.println("Premier panel");
<<<<<<< HEAD
		


		

		//TEST
		SousMarin m = new SousMarin();
=======

		// TEST
		SousMarin m = new SousMarin();
>>>>>>> refs/remotes/origin/master
		m.rotation();
<<<<<<< HEAD
		OwnFieldJ1.placerBateau(m, 9, 1);

		
=======
		OwnFieldJ1.placerBateau(m, 1, 1);
		OwnFieldJ1.placerBateau(m, 2, 1);

>>>>>>> refs/remotes/origin/master
		jbNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				OwnFieldJ1.setVisible(false);
				OwnFieldJ2.setVisible(true);
				jlChoixPosJ.setText(jlNomJ2 + ", placez vos bateaux sur la grille");
				System.out.println("Nouveau Panel");
<<<<<<< HEAD
				erreurJ1.setVisible(false);
				erreurJ2.setVisible(true);
				
=======

>>>>>>> refs/remotes/origin/master
			}
		});
<<<<<<< HEAD
		//Positionnement des elements dans le BorderLayout
		//this.add(j1su, BorderLayout.CENTER);
		this.add(Error, BorderLayout.CENTER);
=======
		// Positionnement des elements dans le BorderLayout
		// this.add(j1su, BorderLayout.CENTER);
>>>>>>> refs/remotes/origin/master
		this.add(jlChoixPosJ, BorderLayout.NORTH);
		this.add(glAffichageBateauxJ1, BorderLayout.CENTER);
		this.add(Grid, BorderLayout.EAST);
		this.add(jbNext, BorderLayout.SOUTH);

	}
}
