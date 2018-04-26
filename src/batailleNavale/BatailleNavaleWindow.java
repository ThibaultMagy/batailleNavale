package batailleNavale;

import javax.swing.JFrame;

public class BatailleNavaleWindow extends JFrame{
	/**
	 *Serial demande
	 */
	private static final long serialVersionUID = -1429477758370620888L;

	public BatailleNavaleWindow() {
		this.setTitle("Fenetre");
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);

		this.getContentPane().add(new MenuPanelLayout());
		
		this.setVisible(true);
	}
}
