public class Joueur {
    // Attributs de la classe Joueur (nom, couleur, symbole) 
    private String nom;
    private int couleur;
    private String symbole;

    // Constructeur de la classe Joueur
    public Joueur(String nom, int couleur, String symbole) {
        this.nom = nom;
        this.couleur = couleur;
        this.symbole = symbole;
    }
    public String getNom() {
        return nom; // getter
    }
    public void setNom(String nom) {
        this.nom = nom; // setter
    }
    public int getCouleur() {
        return couleur; // getter
    }
    public void setCouleur(int couleur) {
        this.couleur = couleur; // setter
    }
    public String getSymbole() {
        return symbole; // getter
    }
    public void setSymbole(String symbole) {
        this.symbole = symbole; // setter
    }
}
