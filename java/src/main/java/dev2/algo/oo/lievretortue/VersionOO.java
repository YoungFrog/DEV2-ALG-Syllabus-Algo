package dev2.algo.oo.lievretortue;

/**
 * Version OO du jeu du lièvre et de la tortue.
 */
public class VersionOO {

    public static void main(String[] args) {
        Tortue tortue;
        Lievre lièvre;
        De dé;

        tortue = new Tortue();
        lièvre = new Lievre();
        dé = new De();

        while (!tortue.estArrivée() && !lièvre.estArrivé()) {
            dé.lancer();
            if (dé.getValeur() == 6) {
                lièvre.avancer();
            } else {
                tortue.avancer();
            }
            afficherÉtat(dé.getValeur(), tortue.getAvancée(), lièvre.estArrivé());
        }
        if (lièvre.estArrivé()) {
            System.out.println("Le lièvre a gagné");
        } else {
            System.out.println("La tortue a gagné");
        }
    }

    public static void afficherÉtat(int dé, int avancéeTortue, boolean lièvreArrivé) {
        System.out.println("dé=" + dé + ", tortue=" + avancéeTortue + ", lièvre=" + (lièvreArrivé ? 6 : 0));
    }

}
