package dev2.algo.oo.lievretortue;

/**
 * Partie "contrôleur" de la version MVC du jeu du lièvre et de la tortue.
 */
public class JeuLievreTortue {

    public static void main(String[] args) {
        LievreTortue jeu = new LievreTortue();
        while (!jeu.estFini()) {
            jeu.jouerCoup();
            Vue.afficherÉtat(jeu);
        }
        Vue.afficherVainqueur(jeu);
    }
}
