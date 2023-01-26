import java.util.Scanner;


import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        // déclaration du tableau qui représente la grille de Puissance 4
         String[][] grille = new String[6][7];
 
         // initialisation de la grille avec des valeurs de 0 (aucune pièce jouée)
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 7; j++) {
                    grille[i][j] = " _ ";
             }
         }
 
         // affichage de la grille
         System.out.println("\n--1---2---3---4---5---6---7--");
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 7; j++) {
                System.out.print("|"+grille[i][j]);
                
             }
             System.out.println("|"); 
             System.out.println("\n ---------------------------- ");
         }
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entrez la colonne où vous voulez placer le jeton (1-7): ");
            int col = sc.nextInt() - 1;

            // Vérifiez si la colonne sélectionnée est pleine
            boolean colIsFull = true;
            for(int i = 0; i < 6; i++) {
                if(grille[i][col].equals(" _ ")) {
                    colIsFull = false;
                    break;
                }
            }

            if(colIsFull) {
                System.out.println("La colonne sélectionnée est pleine. Veuillez sélectionner une autre colonne.");
            } else {
                // Parcourez les lignes de la colonne sélectionnée pour trouver la première case vide
                for(int i = 5; i >= 0; i--) {
                    if(grille[i][col].equals(" _ ")) {
                        grille[i][col] = "X"; // Placez le jeton
                        break;
                    }
                }
            }
        }

     }
     
    
     

 

}