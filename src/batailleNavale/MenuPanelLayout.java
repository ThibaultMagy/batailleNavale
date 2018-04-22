package batailleNavale;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

//Classe permettant de Layerer le menu
public class MenuPanelLayout extends JPanel{
	//Un serial number ID est demandé
	private static final long serialVersionUID = -5058673910875834462L;
	//ATTRIBUTS
	private JLabel jlTitle = new JLabel("BATAILLE NAVALE");
	private JButton jbIa = new JButton("Bataille contre IA");
	private JButton jbJoueurVsJoueur = new JButton("Bataille contre joueur");
	private JTextField jtfJoueur1 = new JTextField("Joueur 1");
	private JTextField jtfJoueur2 = new JTextField("Joueur 2");
	private JButton jbStart = new JButton("START");
	private JButton jbQuit = new JButton("QUIT");
	
	//Choix du type de layout
	BorderLayout bl = new BorderLayout();
	
	public MenuPanelLayout() {
		//Titre
		Font titleFont = new Font("Arial", Font.BOLD, 28);
		jlTitle.setFont(titleFont);
		jlTitle.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Ajout des elements principaux pour le centre du borderlayout
		//A mettre dans une nouvelle classe
		SpringLayout jpElements = new SpringLayout();
		jpElements.putConstraint(SpringLayout.WEST, jbIa, 10, SpringLayout.WEST, this);
		jpElements.putConstraint(SpringLayout.NORTH, jbIa, 25, SpringLayout.NORTH, this);
		jpElements.putConstraint(SpringLayout.NORTH, jtfJoueur1, 25, SpringLayout.NORTH, this);
		jpElements.putConstraint(SpringLayout.WEST, jtfJoueur1, 20, SpringLayout.WEST, this);
		/*jpElements.add(jtfJoueur1);
		jpElements.add(jbJoueurVsJoueur);
		jpElements.add(jtfJoueur2);*/
		//Ajout de start et de quit
		JPanel jpLaunchButtons = new JPanel();
		jpLaunchButtons.setLayout(new FlowLayout());
		jpLaunchButtons.add(jbStart);
		jpLaunchButtons.add(jbQuit);
		
		//Faire en sorte que l'affichage soit mieux
		JPanel tinyElements = new JPanel();
		tinyElements.setLayout(new BorderLayout());
		tinyElements.add(jpElements, BorderLayout.CENTER);
		tinyElements.add(new JPanel(), BorderLayout.WEST);
		tinyElements.add(new JPanel(), BorderLayout.NORTH);
		tinyElements.add(new JPanel(), BorderLayout.SOUTH);
		
		this.setLayout(bl);
		this.add(jlTitle, BorderLayout.NORTH);
		this.add(tinyElements, BorderLayout.WEST);
		this.add(jpLaunchButtons, BorderLayout.SOUTH);
	}
}
