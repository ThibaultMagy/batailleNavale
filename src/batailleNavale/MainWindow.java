package batailleNavale;
import javax.swing.JFrame;

//Classe de creation de la fenetre
public class MainWindow extends JFrame {
	//Un serial number ID est demandé
	private static final long serialVersionUID = -7124081024923523881L;

	public MainWindow() {
		this.setTitle("Fenetre");
		this.setSize(600,350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);

		MenuPanelLayout mpl = new MenuPanelLayout(this);
		this.getContentPane().add(mpl);
		
		this.setVisible(true);
	}
}
