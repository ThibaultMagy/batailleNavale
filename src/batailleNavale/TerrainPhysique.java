package batailleNavale;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class TerrainPhysique extends Terrain {
    // ATTRIBUTS
    private Bouton[][] bouton;
    private String erreur = new String("test");

<<<<<<< HEAD
    // CONSTRUCTEURS
    public TerrainPhysique(int taille) {
        super(taille);
        bouton = new Bouton[taille][taille];
        this.setLayout(new GridLayout(taille, taille));
        setTerrain(taille);
    }

    public TerrainPhysique() {
        this.setPreferredSize(new Dimension(500, 500));
        bouton = new Bouton[TAILLE][TAILLE];
        this.setLayout(new GridLayout(TAILLE, TAILLE));
        setTerrain(TAILLE);
    }

    // METHODES
    // Methode permettant de vérouiller les boutons du terrain
    public void verBoutAll() {
        for (int i = 0; i < getTaille(); i++) {
            for (int j = 0; j < getTaille(); j++) {
                bouton[i][j].setEnabled(false);
            }
        }
    }

    // Methode pour verouiller un bouton
    public void verBout(Bouton b) {
        b.setEnabled(false);
    }

    // Set un terrain
    private void setTerrain(int taille) {
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                bouton[i][j] = new Bouton();
                if (i == 0 || j == 0) {
                    if (i == 0 && j > 0) {
                        bouton[i][j].setText(Character.toString((char) ('a' + (j - 1))));
                    } else if (i > 0 && j == 0) {
                        bouton[i][j].setText(String.valueOf((i)));
                    }
                    verBout(bouton[i][j]);
                }
                this.add(bouton[i][j]);
            }
        }
    }

    // Methode permettant la mise en place d'un bateau
    public void placerBateau(Bateau b, int i, int j) {
        if (!b.isTurned() && j + b.getX() > this.getTaille()) {
            System.out.println("Impossible de placer le bateau ici !");
        } else if (b.isTurned() && i + b.getX() > this.getTaille()) {
            System.out.println("Impossible de placer le bateau ici !");
        } else if (!b.isTurned()) {
            boolean bool = true;
            for (int y = j; y < j + b.getX() && bool; y++) {
                if (this.getTerrainEtat(i, j) == 1) {
                    bool = false;
                    System.out.println("Impossible de placer un bateau ici, un autre entre en conflit avec !");
                    erreur="Impossible de placer un bateau ici, un autre entre en conflit avec !";
                }
            }
            if (bool) {
                for (int y = j; y < j + b.getX(); y++) {
                    this.setTerrainEtat(1, i, y);
                    bouton[i][y].changeColor(1);
                    verBout(bouton[i][y]);
                    System.out.println(i + "," + y);
                }
            } else {
                bool = true;
                for (int x = i; i < i + b.getX() && bool; i++) {
                    if (this.getTerrainEtat(i, j) == 1) {
                        bool = false;
                        System.out.println("Impossible de placer un bateau ici, un autre entre en conflit avec !");
                        erreur="Impossible de placer un bateau ici, un autre entre en conflit avec !";
                    }
                }
            }
        } else {
            boolean bool = true;
            for (int y = j; y < j + b.getX() && bool; y++) {
                if (this.getTerrainEtat(i, j) == 1) {
                    bool = false;
                    System.out.println("Impossible de placer un bateau ici, un autre entre en conflit avec !");
                    erreur="Impossible de placer un bateau ici, un autre entre en conflit avec !";
                }
                if (bool) {

                    for (int x = i; x < i + b.getX(); x++) {
                        this.setTerrainEtat(1, x, j);
                        bouton[x][j].changeColor(1);
                        verBout(bouton[x][j]);
                        System.out.println(x + "," + j);
                    }
                } else {
                    System.out.println("code a remplir");
                    erreur="code a remplir";
                }

            }
        }
    }

	public String getErreur() {
		return erreur;
=======
	// CONSTRUCTEURS
	public TerrainPhysique(int taille) {
		super(taille);
		bouton = new Bouton[taille][taille];
		this.setLayout(new GridLayout(taille, taille));
		setTerrain(taille, taille);
	}
	
	public TerrainPhysique(int taille1, int taille2) {
		super(taille1);
		bouton = new Bouton[taille1][taille2];
		this.setLayout(new GridLayout(taille1,taille2));
		setTerrain(taille1, taille2);
>>>>>>> refs/remotes/origin/master
	}
<<<<<<< HEAD
}
=======

	public TerrainPhysique() {
		this.setPreferredSize(new Dimension(500, 500));
		bouton = new Bouton[TAILLE][TAILLE];
		this.setLayout(new GridLayout(TAILLE, TAILLE));
		setTerrain(TAILLE, TAILLE);
	}

	// METHODES
	// Methode permettant de vérouiller les boutons du terrain
	public void verBoutAll() {
		for (int i = 0; i < getTaille(); i++) {
			for (int j = 0; j < getTaille(); j++) {
				bouton[i][j].setEnabled(false);
			}
		}
	}

	// Methode pour verouiller un bouton
	public void verBout(Bouton b) {
		b.setEnabled(false);
	}

	// Set un terrain
	private void setTerrain(int taille1, int taille2) {
		for (int i = 0; i < taille1; i++) {
			for (int j = 0; j < taille2; j++) {
				bouton[i][j] = new Bouton();
				if (i == 0 || j == 0) {
					if (i == 0 && j > 0) {
						bouton[i][j].setText(Character.toString((char) ('a' + (j - 1))));
					} else if (i > 0 && j == 0) {
						bouton[i][j].setText(String.valueOf((i)));
					}
					verBout(bouton[i][j]);
				}
				this.add(bouton[i][j]);
			}
		}
	}

	// Methode permettant la mise en place d'un bateau
	public void placerBateau(Bateau b, int i, int j) {
		if (!b.isTurned() && j + b.getX() > this.getTaille()) {
			System.out.println("Impossible de placer le bateau ici !");
		} else if (b.isTurned() && i + b.getX() > this.getTaille()) {
			System.out.println("Impossible de placer le bateau ici !");
		} else if (!b.isTurned()) {
			boolean bool = true;
			for (int y = j; y < j + b.getX() && bool; y++) {
				if (this.getTerrainEtat(i, j) == 1) {
					bool = false;
					System.out.println("Impossible de placer un bateau ici, un autre entre en conflit avec !");
				}
			}
			if (bool) {
				for (int y = j; y < j + b.getX(); y++) {
					this.setTerrainEtat(1, i, y);
					bouton[i][y].changeColor(1);
					verBout(bouton[i][y]);
					System.out.println(i + "," + y);
				}
			} else {
				bool = true;
				for (int x = i; i < i + b.getX() && bool; i++) {
					if (this.getTerrainEtat(i, j) == 1) {
						bool = false;
						System.out.println("Impossible de placer un bateau ici, un autre entre en conflit avec !");
					}
				}
			}
		} else {
			boolean bool = true;
			for (int y = j; y < j + b.getX() && bool; y++) {
				if (this.getTerrainEtat(i, j) == 1) {
					bool = false;
					System.out.println("Impossible de placer un bateau ici, un autre entre en conflit avec !");
				}
				if (bool) {

					for (int x = i; x < i + b.getX(); x++) {
						this.setTerrainEtat(1, x, j);
						bouton[x][j].changeColor(1);
						verBout(bouton[x][j]);
						System.out.println(x + "," + j);
					}
				} else {
					System.out.println("code a remplir");
				}

			}
		}
	}
}
>>>>>>> refs/remotes/origin/master
