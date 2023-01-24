public class Pion {

    private Joueur Joueur; // propriété privée 

    public Pion(Joueur joueur) {
        Joueur = joueur; // constructeur
    }
    public Joueur getJoueur() {
        return Joueur; // getter
    }

    public void setJoueur(Joueur joueur) {
        Joueur = joueur; // setter
    }

}
