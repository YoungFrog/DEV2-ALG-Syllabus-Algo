package mcd.util;

/**
 * Hasard.
 */
public class Hasard {
    /**
     * Donne un nombre aléatoire entre min et max.
     *
     * On suppose que min est inférieur ou égal à max.
     *
     * @param min le nombre minimum qu'on peut obtenir
     * @param max le nombre maximum qu'on peut obtenir
     * @return un nombre aléatoire entre min et max.
     */
    public static int in(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Simule le lancé d'un dé à <code>sides</code> faces
     *
     * @param sides le nombre de faces du dé.
     * @return le résultat obtenu en simulant le lancé de dé.
     */
    public static int dice(int sides) {
        return in(1, sides);
    }

    /**
     * Simule le lancé d'un dé classique à 6 faces
     *
     * @return le résultat obtenu en simulant le lancé de dé.
     */
    public static int dice() {
        return dice(6);
    }
}