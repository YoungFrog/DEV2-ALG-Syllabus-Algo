package dev2.algo.oo.lievretortue;

/**
 * Partie "modèle" de la version MVC du jeu du lièvre et de la tortue.
 */
public class LievreTortue {

    private final Tortue tortue;
    private final Lievre lièvre;
    private final De dé;

    public LievreTortue() {
        tortue = new Tortue();
        lièvre = new Lievre();
        dé = new De();
    }

    public Tortue getTortue() {
        return tortue;
    }

    public Lievre getLièvre() {
        return lièvre;
    }

    public De getDé() {
        return dé;
    }

    public void jouerCoup() {
        dé.lancer();
        if (dé.getValeur() == 6) {
            lièvre.avancer();
        } else {
            tortue.avancer();
        }
    }

    public boolean estFini() {
        return tortue.estArrivée() || lièvre.estArrivé();
    }

    public String getVainqueur() {
        if (lièvre.estArrivé()) {
            return "lièvre";
        } else {
            return "tortue";
        }
    }
}
