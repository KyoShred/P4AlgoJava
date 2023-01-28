package model;
import java.util.Scanner;

import java.util.ArrayList;

public class Grid {
    private static int li;
    private static Scanner _scan = new Scanner(System.in);
    
    public static ArrayList<ArrayList<String>> createGrid(){
        ArrayList<ArrayList<String>> grille = new ArrayList<ArrayList<String>>();
        for (int col = 0; col < 6; col++) {
            ArrayList<String> colonne = new ArrayList<>();
            for (int li = 0; li < 7; li++) {
                colonne.add("-");
            }
            grille.add(colonne);
        }
        return grille;
    }
    
    public static void affichage (ArrayList<ArrayList<String>> grille){
        for (int li = 5; li >= 0; li--) {
            for (int col = 0; col < 7; col++) {
                System.out.print("|" + grille.get(li).get(col) + "");
            }
            System.out.println("");
            System.out.println("--------------");
        }
    }
    
    public static ArrayList<ArrayList<String>> play(ArrayList<ArrayList<String>> grille, String message, String symbole){
        System.out.println(message);
        String invalidinput1 = "Invalid column";
        String invalidinput2 = "Invalid input";
        int coor = 0;
        boolean error = true;

        String choix = _scan.nextLine();

        while(error){
            try {
                String coorString = choix;
                coor = Integer.parseInt(coorString);
                error = false;
            } catch (NumberFormatException e) {
                return play(grille, invalidinput2, symbole);
            }
        }

        if(coor < 1 || coor > 7) {
            return play(grille, invalidinput1, symbole);
        }


        if(!(grille.get(5).get(coor-1)).equals("-")){
            return play(grille, invalidinput1, symbole);
        }
        
        for(li = 5; li > 0 ; li -- ){
            if((grille.get(li).get(coor-1)).equals("-")){
                
                if(!(grille.get(li-1).get(coor-1)).equals("-")){
                    break;
                }
            }
            if(li == 0 || !grille.get(li).contains("-")){
                return play(grille, invalidinput1, symbole);
            }
        }

        grille.get(li).set(coor-1, symbole);
        return grille;
    }

}