package dev2.algo.oo.lievretortue;

/**
 * Partie "vue" de la version MVC du jeu du lièvre et de la tortue.
 */
public class Vue {

    public static void afficherÉtat(LievreTortue jeu) {
        System.out.println("dé=" + jeu.getDé().getValeur()
                + ", tortue=" + jeu.getTortue().getAvancée()
                + ", lièvre=" + (jeu.getLièvre().estArrivé() ? 6 : 0));
    }

    public static void afficherVainqueur(LievreTortue jeu) {
        System.out.println("Le vainqueur est: " + jeu.getVainqueur());
    }

}
