import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Score {
    private int score;
    private int joueur;
    
    public Score(int score, int joueur) {
        this.score = score;
        this.joueur = joueur;
    }
    
    public int getScore() {
        return score;
    }
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getJoueur() {
        return joueur;
    }
    
    public void setJoueur(int joueur) {
        this.joueur = joueur;
    }
    
    public void afficherScore() {
        System.out.println("Le score du joueur " + this.joueur + " est de " + this.score);
    }
    
    // Le score du joueur dans un fichier csv
    public void afficherScoreCSV() {
        try {
            FileWriter fw = new FileWriter("score.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(this.score));
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erreur lors de l'écriture du fichier");
            System.exit(0);
        }
        System.out.println("Le score du joueur " + this.joueur + " est de " + this.score);
        System.exit(0);

    }
}
