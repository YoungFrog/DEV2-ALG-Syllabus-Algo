package dev2.algo.tab;

/**
 *
 * @author MCD
 */
public class Parcours1D {

    public static void afficherLigne(int[][] tab, int lg) {
        for (int col = 0; col < tab[0].length; col++) {
            System.out.println(tab[lg][col]);
        }
    }

    public static void afficherColonne(int[][] tab, int col) {
        for (int lg = 0; lg < tab.length; lg++) {
            System.out.println(tab[lg][col]);
        }
    }

    public static void afficherDiagonaleDescendante(int[][] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i][i]);
        }
    }

    // Version avec deux variables
    public static void afficherDiagonaleMontanteV1(int[][] tab) {
        int col = tab[0].length - 1;
        for (int lg = 0; lg < tab.length; lg++) {
            System.out.println(tab[lg][col]);
            col--;
        }
    }

    // En Java, on peut placer les 2 variables dans le for
    public static void afficherDiagonaleMontanteV2(int[][] tab) {
        for (int lg = 0, col = tab[0].length - 1; lg < tab.length; lg++, col--) {
            System.out.println(tab[lg][col]);
        }
    }

    // Version avec la colonne calculée à partir de la ligne
    public static void afficherDiagonaleMontanteV3(int[][] tab) {
        for (int lg = 0; lg < tab.length; lg++) {
            System.out.println(tab[lg][tab.length - 1 - lg]);
        }
    }

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        afficherDiagonaleMontanteV1(tab);
        afficherDiagonaleMontanteV2(tab);
        afficherDiagonaleMontanteV3(tab);
    }
}
