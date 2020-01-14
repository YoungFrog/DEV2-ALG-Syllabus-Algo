package dev2.algo.oo.lievretortue;

import mcd.util.Hasard; // Classe utilitaire pour le hasard

/**
 * Un dé à 6 faces.
 */
public class De {
    
    private int valeur;
    
    public void lancer() {
        valeur = Hasard.in(1, 6);
    }
    
    public int getValeur() {
        return valeur;
    }
}
