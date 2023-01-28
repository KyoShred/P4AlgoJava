package model;

public class Joueur {
    private String nom;
    private String symbole;
    private String couleur;
   

    

    public Joueur(String nom, String symbole, String couleur) {
        this.nom = nom;
        this.symbole = symbole;
        this.couleur = couleur;
       
    }

    public String getNom() {
        return nom;
    }
    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getSymbole() {
        return symbole;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
}
