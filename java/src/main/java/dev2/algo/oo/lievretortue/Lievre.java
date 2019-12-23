package dev2.algo.oo.lievretortue;

/**
 * Un lièvre dans le jeu du lièvre et de la tortue.
 */
public class Lievre {

    private boolean arrivé;

    public Lievre() {
        arrivé = false;
    }
    
    public void avancer() {
        arrivé = true;
    }
    
    public boolean estArrivé() {
        return arrivé;
    }
}
