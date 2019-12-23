package dev2.algo.tab;

/**
 *
 * @author MCD
 */
public class Parcours2D {

    public static void afficherLigneParLigne(int[][] tab) {
        for (int lg = 0; lg < tab.length; lg++) {
            for (int col = 0; col < tab[0].length; col++) {
                System.out.println(tab[lg][col]);
            }
        }
    }

    public static void afficherColonneParColonne(int[][] tab) {
        for (int col = 0; col < tab[0].length; col++) {
            for (int lg = 0; lg < tab.length; lg++) {
                System.out.println(tab[lg][col]);
            }
        }
    }

    public static void afficherLigneParLigneV2(int[][] tab) {
        int nbÉléments = tab.length * tab[0].length;
        int lg = 0;
        int col = 0;
        for (int i = 0; i < nbÉléments; i++) {
            System.out.println(tab[lg][col]);
            col++;
            if (col == tab[0].length) {
                col = 0;
                lg++;
            }
        }
    }

    public static boolean chercherLigneParLigneV1(int[][] tab, int élt) {
        int lg, col;
        boolean trouvé;

        trouvé = false;
        lg = 0;
        while (lg < tab.length && !trouvé) {
            col = 0;
            while (col < tab[0].length && !trouvé) {
                if (tab[lg][col] == élt) {
                    trouvé = true;
                } else {
                    col++;
                }
            }
            if (!trouvé) {
                lg++;
            }
        }
        return trouvé;
    }

    public static boolean chercherLigneParLigneV2(int[][] tab, int élt) {
        int nbÉléments = tab.length * tab[0].length;
        int lg = 0;
        int col = 0;
        int i = 1;
        while (i <= nbÉléments && tab[lg][col] != élt) {
            col++;
            if (col == tab[0].length) {
                col = 0;
                lg++;
            }
            i++;
        }
        return i <= nbÉléments;
    }

    public static void parcoursSerpent(int[][] tab) {
        int nbÉléments = tab.length * tab[0].length;
        int lg = 0;
        int col = 0;
        int sens = 1;
        for (int i = 0; i < nbÉléments; i++) {
            System.out.println(tab[lg][col]);
            if (0 <= col + sens && col + sens < tab[0].length) {
                col += sens;
            } else {
                lg++;
                sens = -sens;
            }
        }
    }

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        afficherLigneParLigne(tab);
//        afficherColonneParColonne(tab);
//        afficherLigneParLigneV2(tab);
//        chercherLigneParLigneV1(tab, 7);
//        chercherLigneParLigneV2(tab, 7);
        parcoursSerpent(tab);
    }

}
