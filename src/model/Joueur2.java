package model;

public class Joueur2 {
    // Attributs de la classe Joueur (nom, couleur, symbole) 
    private String nom;
    private String couleur;
    private String symbole;
    private static String joueur2ColorSymb;

    // Constructeur de la classe Joueur
    public Joueur2(String nom, String couleur, String symbole) {
        this.nom = nom;
        this.couleur = couleur;
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
    public void setSymboleCouleur(String Symbole) {
        String symbole = this.getSymbole();
        String couleur = this.getCouleur();
        int color = Integer.parseInt(couleur);
        switch (color){
            case 1:
            Joueur2.joueur2ColorSymb = "\033[31m" + symbole + "\033[0m";
                break;
            case 2:
            Joueur2.joueur2ColorSymb = "\033[32m" + symbole + "\033[0m";
                break;
            case 3:
            Joueur2.joueur2ColorSymb = "\033[33m" + symbole + "\033[0m";
                break;
            case 4:
            Joueur2.joueur2ColorSymb = "\033[34m" + symbole + "\033[0m";
                break;
            case 5:
            Joueur2.joueur2ColorSymb = "\033[35m" + symbole + "\033[0m";
                break;
            case 6:
            Joueur2.joueur2ColorSymb = "\033[36m" + symbole + "\033[0m";
                break;
            
        }
    }
    public static String getSymboleCouleur () {
        return joueur2ColorSymb;
    }
}