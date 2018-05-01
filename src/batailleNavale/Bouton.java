package batailleNavale;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Bouton extends JButton implements ActionListener {
	private int etat;
	public Bouton() {
		this.addActionListener(this);
		this.setBackground(Color.white);
	}
	public void changeColor(int i) {
		//VIDE
		if(i==0) {
			this.setBackground(Color.WHITE);
			this.setOpaque(true);	
		}
		//PLACE
		else if(i==1) {
			this.setBackground(Color.DARK_GRAY);
			this.setOpaque(true);
		}
		//MORT
		else if(i==-1) {
			this.setBackground(Color.RED);
			this.setOpaque(true);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this) {
			this.changeColor(1);
			this.setEnabled(false);
			
		}
	}
}
