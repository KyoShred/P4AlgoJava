public class Ia {
    
    public static void Ia (String[][] grille) {
        int col = 0;
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
