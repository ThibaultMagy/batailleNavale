package batailleNavale;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BatailleNavaleWindow extends JFrame{

	public BatailleNavaleWindow() {
		this.setTitle("Fenetre");
		this.setSize(1800,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		BatailleNavaleLayout bnl = new BatailleNavaleLayout(this);
		this.getContentPane().add(bnl);
		
		this.setVisible(true);
	}
}
