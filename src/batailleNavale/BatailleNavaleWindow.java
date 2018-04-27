package batailleNavale;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BatailleNavaleWindow extends JFrame{

	public BatailleNavaleWindow() {
		this.setTitle("Fenetre");
		this.setSize(1600,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);

		this.getContentPane().add(new BatailleNavaleLayout());
		
		this.setVisible(true);
	}
}
