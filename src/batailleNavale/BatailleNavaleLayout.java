package batailleNavale;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JLabel jlChoixPosJ = new JLabel(jlNomJ1 + ", placez vos bateaux sur la grille");
    private JPanel glAffichageBateauxJ1 = new JPanel();
    private JPanel glAffichageBateauxJ2 = new JPanel();
    private Joueur j1 = new Joueur();
    private Joueur j2 = new Joueur();
    
    // private SetUpPanel j2su = new SetUpPanel();
    private JButton jbNext = new JButton("Next");

    BorderLayout bl = new BorderLayout();

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
        tpPorteAvion.removeText();
        TerrainPhysique tpCroiseur = new TerrainPhysique(1,4);
        tpCroiseur.removeText();
        TerrainPhysique tpContreTorpilleur = new TerrainPhysique(1,3);
        tpContreTorpilleur.removeText();
        TerrainPhysique tpSousMarin = new TerrainPhysique(1,2);
        tpSousMarin.removeText();
        TerrainPhysique tpTorpilleur = new TerrainPhysique(1,2);
        tpTorpilleur.removeText();
        //JLABELS
        JLabel nbPorteAvion = new JLabel("1");
        JLabel nbCroiseur = new JLabel("1");
        JLabel nbContreTorpilleur = new JLabel("1");
        JLabel nbSousMarin = new JLabel("1");
        JLabel nbTorpilleur = new JLabel("1");    
        //GRIDLAYOUT
        JPanel choix = new JPanel(new FlowLayout(FlowLayout.LEFT));
        choix.add(new JLabel("Choix :"));
        choix.add(jrbHorizontal);
        choix.add(jrbVertical);
        glAffichageBateauxJ1.setLayout(new GridLayout(10,1));
        glAffichageBateauxJ1.add(choix);
        //ADD
        JPanel bateau1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bateau1.add(jbrPorteAvion);
        bateau1.add(tpPorteAvion);
        bateau1.add(nbPorteAvion);
        glAffichageBateauxJ1.add(bateau1);
        
        JPanel bateau2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bateau2.add(jbrCroiseur);
        bateau2.add(tpCroiseur);
        bateau2.add(nbCroiseur);
        glAffichageBateauxJ1.add(bateau2);
        
        JPanel bateau3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bateau3.add(jbrContreTorpilleur);
        bateau3.add(tpContreTorpilleur);
        bateau3.add(nbContreTorpilleur);
        glAffichageBateauxJ1.add(bateau3);

        JPanel bateau4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bateau4.add(jbrSousMarin);
        bateau4.add(tpSousMarin);
        bateau4.add(nbSousMarin);
        glAffichageBateauxJ1.add(bateau4);
        
        JPanel bateau5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bateau5.add(jbrTorpilleur);
        bateau5.add(tpTorpilleur);
        bateau5.add(nbTorpilleur);
        glAffichageBateauxJ1.add(bateau5);
        
        
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

        //PLACEMENT DES ELEMENTS
        int i=0;
        //while(OwnFieldJ1.getNbTerrainPlace()<5) {
            //ECRIRE LE CODE
            /*FAIRE EN SORTE QU'Y IL EST DES LISTENER SUR LES RADIOBUTTONS*/
        //}
        
        // TEST
        SousMarin m = new SousMarin();
        m.rotation();
        OwnFieldJ1.placerBateau(m, 1, 1);
        OwnFieldJ1.placerBateau(m, 2, 1);

        jbNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OwnFieldJ1.setVisible(false);
                OwnFieldJ2.setVisible(true);
                jlChoixPosJ.setText(jlNomJ2 + ", placez vos bateaux sur la grille");
                System.out.println("Nouveau Panel");

            }
        });
        // Positionnement des elements dans le BorderLayout
        // this.add(j1su, BorderLayout.CENTER);
        this.add(jlChoixPosJ, BorderLayout.NORTH);
        this.add(glAffichageBateauxJ1, BorderLayout.WEST);
        this.add(Grid, BorderLayout.EAST);
        this.add(jbNext, BorderLayout.SOUTH);

    }
}
