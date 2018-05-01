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
	private BatailleNavaleWindow bnl;
	private TerrainPhysique j1OwnField;
	private TerrainPhysique j1EnemyField;
	private TerrainPhysique j2OwnField;
	private TerrainPhysique j2EnemyField;

	private JButton nextButton = new JButton("Next");
	private JLabel choixPosJ = new JLabel("Joueur 1, placez vos bateaux sur la grille");

	//BORDERLAYOUT
	BorderLayout bl = new BorderLayout();
	
	public SetUpPanelJ1() {
		this.bnl=bnl;
		TerrainPhysique j1EnemyField = new TerrainPhysique();
		TerrainPhysique j1OwnField = new TerrainPhysique();
		TerrainPhysique j2OwnField = new TerrainPhysique();
		TerrainPhysique j2EnemyField = new TerrainPhysique();
		
		j2OwnField.setVisible(false);
		Font titleFont = new Font("Arial", Font.BOLD, 28);
		choixPosJ.setFont(titleFont);
		choixPosJ.setHorizontalAlignment(SwingConstants.CENTER);
		this.setLayout(bl);
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				j1OwnField.setVisible(false);
				System.out.println("joe lopez");
				j2OwnField.setVisible(true);
				choixPosJ.setText("Joueur 2, placez vos bateaux sur la grille");
			}
		});
		//Positionnement des elements dans le BorderLayout
		this.add(j1OwnField, BorderLayout.CENTER);
		this.add(j2OwnField, BorderLayout.CENTER);
		this.add(choixPosJ, BorderLayout.NORTH);
		this.add(nextButton, BorderLayout.SOUTH);
		
	}
}
