import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class Score{
    // propriété privée pour stocker le score
    private int score;
    // propriété privée pour stocker l'objet Joueur
    private Joueur joueur;

    // méthode pour récupérer l'objet Joueur
    public Joueur getJoueur () {
        return joueur;
    }

    // méthode pour définir l'objet Joueur
    public void setJoueur (Joueur joueur) {
        this.joueur = joueur;
    }

    // méthode pour récupérer la valeur du score
    public int getScore () {
        return score;
    }

    // méthode pour définir la valeur du score
    public void setScore (int score) {
        this.score = score;
    }

    public void afficherScoreCSV() {
        try {
            //Création ou ajout à un fichier CSV pour enregistrer le score du joueur
            FileWriter fw = new FileWriter("fichier.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(this.score));
            //Ajout d'une nouvelle ligne pour chaque entrée de score
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            //Affichage d'un message d'erreur et fermeture du programme en cas d'exception lors de l'écriture dans le fichier
            e.printStackTrace();
            System.out.println("Erreur lors de l'écriture du fichier");
            System.exit(0);
        }
        //Affichage du score du joueur à l'écran et fermeture du programme
        System.out.println("Le score du joueur " + this.joueur + " est de " + this.score);
        System.exit(0);
    }
    
}
