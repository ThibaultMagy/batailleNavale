package batailleNavale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Classe permettant de Layerer le menu
public class MenuPanelLayout extends JFrame{
	//ATTRIBUTS
	private JLabel jlTitle = new JLabel("BATAILLE NAVALE");
	private JButton jbIa = new JButton("Bataille contre IA");
	private JButton jbJoueurVsJoueur = new JButton("Joueur contre joueur");
	private JTextField jtfJoueur1 = new JTextField();
	private JTextField jtfJoueur2 = new JTextField();
	private JButton jbStart = new JButton("START");
	private JButton jbQuit = new JButton("QUIT");
	
	//
	
	public MenuPanelLayout() {
		
	}
}
