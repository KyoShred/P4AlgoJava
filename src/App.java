import java.util.ArrayList;
import java.util.Scanner;

import model.Score;
import model.Joueur;
import model.Game;

public class App {
    Joueur joueur = new Joueur(null, null, null);
    Score score = new Score();
    public static Joueur joueur1 = new Joueur(null, null, "X");
    public static Joueur joueur2 = new Joueur(null, null, "=");
    private static Scanner _scan = new Scanner(System.in);


    public static void main(String[] args) throws Exception {
        while(true) {
            afficherMenu();
            String choix = _scan.nextLine();
            switch(choix) {
                case "1":
                    afficherMenuIA();
                    break;
                case "2":
                    Game.Multiplayer(joueur1, joueur2); 
                    break;
                case "3":
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }

    public static void afficherMenu() {
        ArrayList<String> menus = new ArrayList<>();
        menus.add("\n-- MENU PUISSANCE 4 --");
        menus.add("1- Singleplayer");
        menus.add("2- Multiplayer");
        menus.add("3- Afficher top 10");
        menus.add("3- Quit");
        for (String menu : menus) {
            System.out.println(menu);
        }
    }

    public static void afficherMenuIA() {
        ArrayList<String> menus = new ArrayList<>();
        menus.add("\n-- MENU CONTRE IA --");
        menus.add("[1] IA de niveau 1");
        menus.add("[2] IA de niveau 2");
        menus.add("[3] IA de niveau 3");
        menus.add("[4] IA de niveau 4");
        menus.add("[5] Retour");
        for (String menu : menus) {
            System.out.println(menu);
        }
    }

    public static void niveauIA() {
        afficherMenuIA();
        String choix = _scan.nextLine();
        switch(choix) {
            case "1":
                System.out.println("IA de niveau 1");
                break;
            case "2":
                System.out.println("IA de niveau 2");
                break;
            case "3":
                System.out.println("IA de niveau 3");
                return;
            case "4":
                System.out.println("IA de niveau 4");
                break;
            case "5":
                break;
        }
    }
}