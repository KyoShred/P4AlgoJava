package model;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Game {
    private static Scanner _scan = new Scanner(System.in);
   
    public static void Multiplayer(Joueur joueur1, Joueur joueur2){
        boolean won = false;
        boolean turn = false;
        String color1 = joueur1.getCouleur();
        String color2 = joueur2.getCouleur();
        String symb1 = joueur1.getSymbole();
        String symb2 = joueur2.getSymbole();
        ArrayList<ArrayList<String>> grille = Grid.createGrid();


        System.out.println("Player1's name: ");
        String nom1 = _scan.nextLine();
        
        System.out.println("Player2's name: ");
        String nom2 = _scan.nextLine();

        joueur1.setNom(color1 + nom1);
        joueur1.setSymbole(color1 + symb1);

        joueur2.setNom(color2 + nom2);
        joueur2.setSymbole(color2 + symb2);

        // ça continue tant que personne n'a gagné
        while(!won){
            if(!turn){
                
                System.out.println();
                System.out.println();
                System.out.println(joueur1.getNom() + "select column: ");
                System.out.println();
                Grid.affichage(grille);
                Grid.play(grille, "", joueur1.getSymbole());
                turn = true;
                System.out.println();
            } else {
                System.out.println();
                System.out.println();
                System.out.println(joueur2.getNom() + "select column: ");
                System.out.println();
                Grid.affichage(grille);
                Grid.play(grille, "", joueur2.getSymbole());
                turn = false;
                System.out.println();
            }
        }
    }
}

