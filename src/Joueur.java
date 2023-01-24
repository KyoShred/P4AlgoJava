public class Joueur {

    // Attributs de la classe Joueur (nom, couleur, symbole) initialisés dans le constructeur

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
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getCouleur() {
        return couleur;
    }
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
    public String getSymbole() {
        return symbole;
    }
    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }
    public void afficherJoueur() {
        System.out.println("Le joueur " + this.nom + " est de couleur " + this.couleur + " et son symbole est " + this.symbole);
    }
    public String toString() {
        return "Joueur{" + "nom=" + nom + ", couleur=" + couleur + ", symbole=" + symbole + '}';
    }

}
