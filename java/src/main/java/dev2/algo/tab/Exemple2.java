package dev2.algo.tab;

import static mcd.util.Ask.*;

/**
 *
 * @author MCD
 */
public class Exemple2 {

    public static void statistiquesVentesSemaine() {
        int[][] cpt = new int[7][10];
        // initialiser(cpt, 0); // rien à faire : en Java, les tableaux d'entiers sont initialisés à 0.
        for (int jour = 0; jour < 7; jour++) {
            System.out.println("Jour : " + jour);
            traiterStock1Jour(cpt, jour);
            for (int produit = 0; produit < 10; produit++) {
                System.out.println("quantité vendue du produit " + produit
                        + " ce jour " + jour + " : " + cpt[jour][produit]);
            }
        }
    }

    private static void traiterStock1Jour(int[][] cpt, int jour) {
        int numéroProduit, quantité;
        // askInt est une méthode utilitaire pour lire un entier de façon conviviale et robuste
        numéroProduit = askInt("Introduisez le numéro du produit");
        while (numéroProduit >= 0 && numéroProduit < 10) {
            quantité = askInt("Introduisez la quantité vendue");
            cpt[jour][numéroProduit] += quantité;
            numéroProduit = askInt("Introduisez le numéro du produit");
        }
    }

    public static void main(String[] args) {
        statistiquesVentesSemaine();
    }

}
