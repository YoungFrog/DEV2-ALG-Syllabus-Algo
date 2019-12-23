package dev2.algo.oo.lievretortue;

/**
 * Une tortue dans le jeu du lièvre et de la tortue.
 */
public class Tortue {

    private int avancée;

    public Tortue() {
        avancée = 0;
    }

    public void avancer() {
        avancée++;
    }

    public boolean estArrivée() {
        return avancée == 6;
    }

    public int getAvancée() {
        return avancée;
    }
}
