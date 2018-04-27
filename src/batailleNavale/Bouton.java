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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this) {
			this.setEnabled(false);
		}
	}
}
