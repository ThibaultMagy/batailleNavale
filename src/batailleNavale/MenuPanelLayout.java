package batailleNavale;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//Classe permettant de Layerer le menu
public class MenuPanelLayout extends JPanel{
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
		JPanel glElements = new JPanel();
		glElements.setLayout(new GridLayout(2,2,10,50));
		glElements.add(jbIa);
		glElements.add(jtfJoueur1);
		glElements.add(jbJoueurVsJoueur);
		glElements.add(jtfJoueur2);
		//Faire en sorte que l'afficheage soit mieux
		JPanel tinyElements = new JPanel();
		tinyElements.setLayout(new BorderLayout());
		tinyElements.add(glElements, BorderLayout.CENTER);
		tinyElements.add(new JPanel(), BorderLayout.WEST);
		tinyElements.add(new JPanel(), BorderLayout.NORTH);
		tinyElements.add(new JPanel(), BorderLayout.SOUTH);
		
		this.setLayout(bl);
		this.add(jlTitle, BorderLayout.NORTH);
		this.add(tinyElements, BorderLayout.WEST);
	}
}
