import java.util.Scanner;
import model.Joueur;
import model.Joueur2;

public class App{
    
    private static Scanner scanner = new Scanner(System.in);
    public static String[][] grid = createGrid();
    private static boolean SinglePlayer = false;
    private static boolean multiplayer = false;
    public static Joueur player = new Joueur("Joueur 1", "1", "@");
    public static Joueur2 player2 = new Joueur2("Joueur 2", "3", "=");

    public static void main(String[] args) throws Exception{
        mainMenu(args);
        closeScanner(scanner);
    }

    public static void printMainMenu() {
        System.out.println("--Menu--");
        System.out.println("1- Singleplayer");
        System.out.println("2- Multiplayer");
        System.out.println("3- Display Top 10");
        System.out.println("4- Exit");
    }

    public static int getMenuChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        return choice;
    }

    public static void closeScanner(Scanner scanner) {
        scanner.close();
    }

    public static void mainMenu(String[] args) throws Exception{
        int userchoice;
        do {
            printMainMenu();
            userchoice = getMenuChoice();
            switch (userchoice) {
                case 1:
                    SinglePlayer = true;
                    singleplayerMenu(args);
                    break;
                case 2:
                    multiplayer = true;
                    //multiplayerMenu(args);
                    break;
                case 3:
                    System.out.println("display");

                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Input");

            }
        } while (userchoice != 5);
    }

    public static void singleplayerMenu(String[] args) throws Exception {
        System.out.println("---Singleplayer---");
        System.out.println("Joueur 1, Entre un nom : ");
        String nom = scanner.nextLine();
        System.out.println("Player Color");
        System.out.println("1- \033[31mRouge\033[0m");
        System.out.println("2- \033[32mVert\033[0m");
        System.out.println("3- \033[33mJaune\033[0m");
        System.out.println("4- \033[34mBleu\033[0m");
        System.out.println("5- \033[35mViolet\033[0m");
        System.out.println("6- \033[36mCyan\033[0m");
        System.out.println("pick your color : ");
        if (scanner.hasNextLine()) {
            String color = scanner.nextLine();
            System.out.println("Choisis un symbole :");
            if (scanner.hasNextLine()) {
                String logo = scanner.nextLine();
                player = new Joueur(nom, color, logo);
                System.out.println("1- Niveau 1");
                System.out.println("2- Niveau 2");
                System.out.println("3- Niveau 3");
                System.out.println("4- Niveau 4");
                System.out.println(player.getNom() + ", Choisis le niveau de difficulté");
                while(true){
                    if (scanner.hasNextInt()) {
                        int difficultyLvl = scanner.nextInt();
                        switch (difficultyLvl) {
                            case 1:
                                
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                return;
                        }
                    } else {
                            System.out.println("Entre un chiffre entre 1 et 4");
                            scanner.next();
                    }
                }
            }
        }
    }

    public static void multiplayerMenu(String[] args, Joueur player)throws Exception{
        System.out.println("---Multiplayer---");
        //joueur 1
        System.out.println("Joueur 1, Entre un nom : ");
        String nom = scanner.nextLine();
        System.out.println("pick your color : ");
        System.out.println("1. \033[31mRouge\033[0m");
        System.out.println("2. \033[32mVert\033[0m");
        System.out.println("3. \033[33mJaune\033[0m");
        System.out.println("4. \033[34mBleu\033[0m");
        System.out.println("5. \033[35mViolet\033[0m");
        System.out.println("6. \033[36mCyan\033[0m");
        String color = scanner.nextLine();
        System.out.println("Choisis un symbole");
        String logo = scanner.nextLine();
        player = new Joueur(nom, color, logo);
        //Joueur 2
        System.out.println("Joueur 2, Entre un nom : ");
        String nom2 = scanner.nextLine();
        System.out.println("pick your color : ");
        System.out.println("1. \033[31mRouge\033[0m");
        System.out.println("2. \033[32mVert\033[0m");
        System.out.println("3. \033[33mJaune\033[0m");
        System.out.println("4. \033[34mBleu\033[0m");
        System.out.println("5. \033[35mViolet\033[0m");
        System.out.println("6. \033[36mCyan\033[0m");
        String color2 = scanner.nextLine();
        System.out.println("Choisis un symbole");
        String logo2 = scanner.nextLine();
        player2 = new Joueur2(nom2, color2, logo2);
        inputPlayer(args, player, grid);
    }

    public static String[][] createGrid(){
        String[][] grid = new String[6][7];
        for (int y = 0; y < 6; y++){
            for (int x = 0; x < 7; x++){
                grid[y][x] = " ";
            }
        }
        return grid;
    }

    public static void displayGrid(String[][] grid, String[][] playerJeton){
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 7; x++) {
                System.out.print("|"+ grid[y][x] + playerJeton[y][x]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static void gameStart(Joueur player, String[][] playerJeton){
        while(true){
            displayGrid(grid, playerJeton);
            inputPlayer(player, grid);
        }
    }

    public static void inputPlayer(Joueur player, String[][] playerJeton){
        while(true){
            System.out.println(player.getNom()+ "Entrez une valeur : ");
            if(scanner.hasNextInt()){
                int inputPlayer1 = scanner.nextInt()-1;
                if(inputPlayer1 < 0 || inputPlayer1 > 6 ){
                    System.out.println("Entrez un chiffre entre 1 et 7");
                }else{
                    playerMove(inputPlayer1, grid, player);
                    displayGrid(grid, playerJeton);
                }
            } else {
                System.out.println("Entrez un chiffre valide : ");
                scanner.next();
            }
        }
    }
    
    public static void playerMove(int inputPlayer1, String[][] grid, Joueur player) {
        // loop through the rows starting from the bottom
        for (int y = grid.length - 1; y >= 0; y--) {
            // check if the current cell is empty
            if (grid[y][inputPlayer1].equals(" ")) {
                // update the cell with the player's symbol or color
                grid[y][inputPlayer1] = player.getSymboleCouleur();
                break;
            }
        }
    }
    
    
}