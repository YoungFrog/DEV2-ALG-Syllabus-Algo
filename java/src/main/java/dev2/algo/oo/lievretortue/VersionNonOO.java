package dev2.algo.oo.lievretortue;

import mcd.util.Hasard;

/**
 * Version non OO du jeu de lièvre et de la tortue.
 */
public class VersionNonOO {

    public static void main(String[] args) {
        int avancéeTortue;
        boolean lièvreArrivé;
        int dé;

        avancéeTortue = 0;
        lièvreArrivé = false;
        while (avancéeTortue < 6 && !lièvreArrivé) {
            dé = Hasard.dice();     // Hasard est une classe utilitaire personnelle
            if (dé == 6) {
                lièvreArrivé = true;
            } else {
                avancéeTortue++;
            }
            afficherÉtat(dé, avancéeTortue, lièvreArrivé);
        }
        if (lièvreArrivé) {
            System.out.println("Le lièvre a gagné");
        } else {
            System.out.println("La tortue a gagné");
        }
    }

    public static void afficherÉtat(int dé, int avancéeTortue, boolean lièvreArrivé) {
        System.out.println("dé=" + dé + ", tortue=" + avancéeTortue + ", lièvre=" + (lièvreArrivé?6:0));
    }
}
