package batailleNavale;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

//Classe permettant de Layerer le menu
public class MenuPanelLayout extends JPanel{
	//Un serial number ID est demandé
	private static final long serialVersionUID = -5058673910875834462L;
	//ATTRIBUTS
	private JLabel jlTitle = new JLabel("BATAILLE NAVALE");
	private JRadioButton jbIa = new JRadioButton("Bataille contre IA");
	private JRadioButton jbJoueurVsJoueur = new JRadioButton("Bataille contre joueur");
	private JLabel usernames = new JLabel("Entrez vos pseudos:");
	private JTextField jtfJoueur1 = new JTextField("Joueur 1");
	private JTextField jtfJoueur2 = new JTextField("Joueur 2");
	private JButton jbStart = new JButton("START");
	private JButton jbQuit = new JButton("QUIT");
	private String nomJoueur1;
	private String nomJoueur2;
	private JLabel erreur = new JLabel("");
	private MainWindow mw;
	
	//Choix du type de layout
	BorderLayout bl = new BorderLayout();
	
	public MenuPanelLayout(MainWindow mw) {
		this.mw=mw;
		//Titre
		Font titleFont = new Font("Arial", Font.BOLD, 28);
		jlTitle.setFont(titleFont);
		jlTitle.setHorizontalAlignment(SwingConstants.CENTER);
	
		//Erreur
		erreur.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Entrez pseudos
		usernames.setHorizontalAlignment(SwingConstants.CENTER);
		
		//Ajout des boutons choix du mode de jeu
		ButtonGroup group = new ButtonGroup();
		group.add(jbJoueurVsJoueur);
		group.add(jbIa);
		JPanel choixModeJeu = new JPanel();
		choixModeJeu.setLayout(new BoxLayout(choixModeJeu,BoxLayout.Y_AXIS));
		choixModeJeu.add(jbJoueurVsJoueur);
		choixModeJeu.add(Box.createRigidArea(new Dimension(0,20)));
		choixModeJeu.add(jbIa);
		choixModeJeu.add(Box.createVerticalGlue());
		
		
		
		//Ajout des TextField 
		JPanel tField = new JPanel();
		tField.setLayout(new BoxLayout(tField,BoxLayout.Y_AXIS));
		tField.add(usernames);
		tField.add(Box.createRigidArea(new Dimension(0,5)));
		tField.add(jtfJoueur1);
		tField.add(Box.createRigidArea(new Dimension(0,5)));
		tField.add(jtfJoueur2);
		
		
		
		
		//Ajout de start et de quit
		JPanel jpLaunchButtons = new JPanel();
		jpLaunchButtons.setLayout(new FlowLayout());
		jpLaunchButtons.add(jbStart);
		jpLaunchButtons.add(jbQuit);
		//Bouton quitter
		jbQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//Bouton start
		jbStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jtfJoueur1.getText().equals("") && jtfJoueur2.getText().equals("")) {
					erreur.setText("Vous n'avez pas saisi de pseudo");
				}
				else if(jtfJoueur1.getText().equals("") || jtfJoueur2.getText().equals("")) {
					erreur.setText("Saisir pseudo du joueur");
				}
				else if(jbJoueurVsJoueur.isSelected()!= true) {
					erreur.setText("Veuillez choisir le mode Joueur vs Joueur");
				}
				else {
					nomJoueur1 = jtfJoueur1.getText();
					nomJoueur2 = jtfJoueur2.getText();
					mw.setVisible(false);
					BatailleNavaleWindow bn = new BatailleNavaleWindow();
					System.out.println("joe lopez");
					bn.setVisible(true);
				}
				
				
				
			}
		});
		
		
		//Layout du BorderLayout
		this.setLayout(bl);
		this.add(jlTitle, BorderLayout.NORTH);
		this.add(jpLaunchButtons, BorderLayout.SOUTH);
		this.add(choixModeJeu, BorderLayout.WEST);
		this.add(tField, BorderLayout.EAST);	
		this.add(erreur, BorderLayout.CENTER);
		
		
	}
	
	//GETTERS SETTERS
	public MainWindow getMainWindow() {
		return this.mw;
	}
	
}