package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SetUpPanel extends JPanel{
	//ELEMENTS
	private BatailleNavaleWindow bnw;
	private TerrainPhysique OwnField = new TerrainPhysique();
	private TerrainPhysique EnemyField;
	private JButton jbNext = new JButton("Next");
	private JLabel jlChoixPosJ = new JLabel("Joueur 1, placez vos bateaux sur la grille");
	private SetUpPanel j2su = new SetUpPanel();

	//BORDERLAYOUT
	BorderLayout bl = new BorderLayout();
	
	public SetUpPanel() {
		this.setLayout(bl);
		//TerrainPhysique j1EnemyField = new TerrainPhysique();
		//TerrainPhysique j2OwnField = new TerrainPhysique();
		//TerrainPhysique j2EnemyField = new TerrainPhysique();
		System.out.println("okek");
		
		Font titleFont = new Font("Arial", Font.BOLD, 28);
		jlChoixPosJ.setFont(titleFont);
		jlChoixPosJ.setHorizontalAlignment(SwingConstants.CENTER);
		jbNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bnw.setContentPane(j2su);
				bnw.repaint();
				bnw.revalidate();
				System.out.println("joe lopez");
			}
		});
		//Positionnement des elements dans le BorderLayout
		this.add(OwnField, BorderLayout.CENTER);
		this.add(jlChoixPosJ, BorderLayout.NORTH);
		this.add(jbNext, BorderLayout.SOUTH);
		
	}
}
