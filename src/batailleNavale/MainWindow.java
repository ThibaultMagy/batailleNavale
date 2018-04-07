package batailleNavale;
import javax.swing.JFrame;

//Classe de creation de la fenetre
public class MainWindow extends JFrame {
	public MainWindow() {
		this.setTitle("Fenetre");
		this.setSize(600,350);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);

		this.getContentPane().add(new MenuPanelLayout());
		
		this.setVisible(true);
	}
}
