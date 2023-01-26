package model;

public class Joueur {
    // Attributs de la classe Joueur (nom, couleur, symbole) 
    private String nom;
    private String couleur;
    private String symbole;

    // Constructeur de la classe Joueur
    public Joueur(String nom, String color, String symbole) {
        this.nom = nom;
        this.couleur = color;
        this.symbole = symbole;
    }
    public String getNom() {
        return nom; // getter nom de la classeé Joueur
    }
    public void setNom(String nom) {
        this.nom = nom; // setter nom de la classe Joueur
    }
    public String getCouleur() {
        return couleur; // getter couleur de la classe Joueur
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur; // setter couleur de la classe Joueur
    }
    public String getSymbole() {
        return symbole; // getter symbole de la classe Joueur
    }
    public void setSymbole(String symbole) {
        this.symbole = symbole; // setter symbole de la classe Joueur
    }

    public void SymboleCouleur() {
        String symbole = this.getSymbole();
        String couleur = this.getCouleur();
    
        if (couleur.equals("Rouge")) {
            String joeurColorSymb = ("\033[31m" + symbole + "\033[0m");
        } else if (couleur.equals("Vert")) {
            String joeurColorSymb = ("\033[32m" + symbole + "\033[0m");
        } else if (couleur.equals("Jaune")) {
            String joeurColorSymb = ("\033[33m" + symbole + "\033[0m");
        } else if (couleur.equals("Bleu")) {
            String joeurColorSymb = ("\033[34m" + symbole + "\033[0m");
        } else if (couleur.equals("Violet")) {
            String joeurColorSymb = ("\033[35m" + symbole + "\033[0m");
        } else if (couleur.equals("Cyan")) {
            String joueurColorSymb = ("\033[36m" + symbole + "\033[0m");
        }
    }
    
    public void getSymboleCouleur () {
        return joueurColorSymb;
    }


}
