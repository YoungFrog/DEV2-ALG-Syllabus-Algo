package dev2.algo.tab;

import java.util.Arrays;

/**
 *
 * @author MCD
 */
public class Exemple1 {

    public static void remplirCoins() {
        String[][] grille = new String[3][5];
        grille[0][0] = "NO";
        grille[0][4] = "NE";
        grille[2][0] = "SO";
        grille[2][4] = "SE";        
//        System.out.println(Arrays.deepToString(grille));
    }
    
    public static void main(String[] args) {
        remplirCoins();
    }
}
