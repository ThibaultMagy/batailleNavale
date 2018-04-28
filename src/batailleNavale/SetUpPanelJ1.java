package batailleNavale;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class SetUpPanelJ1 extends JPanel{
	//ELEMENTS
	private BatailleNavaleWindow bnw;
	private TerrainPhysique j1OwnField;
	private TerrainPhysique j1EnemyField;
	private TerrainPhysique j2OwnField;
	private TerrainPhysique j2EnemyField;

	private JButton jbNext = new JButton("Next");
	private JLabel jlChoixPosJ = new JLabel("Joueur 1, placez vos bateaux sur la grille");

	//BORDERLAYOUT
	BorderLayout bl = new BorderLayout();
	
	public SetUpPanelJ1(BatailleNavaleWindow bnw) {
		this.setLayout(bl);
		this.bnw=bnw;
		//TerrainPhysique j1EnemyField = new TerrainPhysique();
		TerrainPhysique j1OwnField = new TerrainPhysique();
		//TerrainPhysique j2OwnField = new TerrainPhysique();
		//TerrainPhysique j2EnemyField = new TerrainPhysique();
		
		Font titleFont = new Font("Arial", Font.BOLD, 28);
		jlChoixPosJ.setFont(titleFont);
		jlChoixPosJ.setHorizontalAlignment(SwingConstants.CENTER);
		jbNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("joe lopez");
			}
		});
		//Positionnement des elements dans le BorderLayout
		this.add(j1OwnField, BorderLayout.CENTER);
		this.add(jlChoixPosJ, BorderLayout.NORTH);
		this.add(jbNext, BorderLayout.SOUTH);
		
	}
}
