package dev2.algo.oo;

import java.util.Objects;

/**
 * Représente une durée avec une précision à la seconde.
 */
public class Duree {

    private int totalSecondes;

    /**
     * Construit une durée donnée par un total de secondes.
     *
     * @param secondes le nombre total de secondes de la durée.
     * @throws IllegalArgumentException si <code>secondes</code> est négatif.
     */
    public Duree(int secondes) {
        if (secondes < 0) {
            throw new IllegalArgumentException("Nb de secondes négatif: " + secondes);
        }
        totalSecondes = secondes;
    }

    /**
     * Construit une durée donnée par des heures/minutes/secondes.
     *
     * @param heure le nombre d'heures de la durée.
     * @param minute le nombre de minutes de la durée.
     * @param seconde le nombre de secondes de la durée.
     * @throws IllegalArgumentException si : 
     * heure est négatif ou minute n'est pas entre 0 et 59
     * ou seconde n'est pas entre 0 et 59
     */
    public Duree(int heure, int minute, int seconde) {
        if (heure < 0) {
            throw new IllegalArgumentException("heure invalide: " + heure);
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("minute invalide: " + minute);
        }
        if (seconde < 0 || seconde > 59) {
            throw new IllegalArgumentException("seconde invalide: " + seconde);
        }
        totalSecondes = 3600 * heure + 60 * minute + seconde;
    }

    /**
     * Donne le nombre de jours dans une représentation JJ/HH:MM:SS.
     *
     * @return le nombre de jours dans une représentation JJ/HH:MM:SS.
     */
    public int getJour() {
        return totalSecondes / (24 * 3600);
    }

    /**
     * Donne le nombre d'heures dans une représentation JJ/HH:MM:SS.
     *
     * @return le nombre d'heures dans une représentation JJ/HH:MM:SS.
     */
    public int getHeure() {
        return (totalSecondes / 3600) % 24;
    }

    /**
     * Donne le nombre de minutes dans une représentation JJ/HH:MM:SS.
     *
     * @return le nombre de minutes dans une représentation JJ/HH:MM:SS.
     */
    public int getMinute() {
        return (totalSecondes / 60) % 60;
    }

    /**
     * Donne le nombre de secondes dans une représentation JJ/HH:MM:SS.
     *
     * @return le nombre de secondes dans une représentation JJ/HH:MM:SS.
     */
    public int getSeconde() {
        return totalSecondes % 60;
    }

    /**
     * Donne le nombre total d'heures entières de la durée.
     *
     * @return le nombre total d'heures entières de la durée.
     */
    public int getTotalHeures() {
        return totalSecondes / 3600;
    }

    /**
     * Donne le nombre total de minutes entières de la durée.
     *
     * @return le nombre total de minutes entières de la durée.
     */
    public int getTotalMinutes() {
        return totalSecondes / 60;
    }

    /**
     * Donne le nombre total de secondes de la durée.
     *
     * @return le nombre total de secondes de la durée.
     */
    public int getTotalSecondes() {
        return totalSecondes;
    }

    /**
     * Ajoute une durée. La durée donnée en paramètre est ajoutée à cette durée
     * qui est ainsi modifiée.
     *
     * @param autre la durée à ajouter.
     */
    public void ajouter(Duree autre) {
        totalSecondes += autre.totalSecondes;
    }

    /**
     * Différence entre deux durées. Calcule une nouvelle durée représentant la
     * différence entre cette durée et l'autre durée donnée en paramètre.
     *
     * @param autre une seconde durée.
     * @return la dfférence entre les durées.
     */
    public Duree différence(Duree autre) {
        return new Duree(totalSecondes - autre.totalSecondes);
    }

    /**
     * Teste si cette durée est plus petite qu'une autre donnée en paramètre.
     *
     * @param autre une seconde durée.
     * @return <code>true</code> si cette durée est inférieure à celle donnée en
     * paramètre.
     */
    public boolean plusPetit(Duree autre) {
        return totalSecondes < autre.totalSecondes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalSecondes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Duree other = (Duree) obj;
        return (this.totalSecondes == other.totalSecondes);
    }

    /**
     * Représentation textuelle de la durée.
     * @return la durée sous la forme "JJ/HH:MM:SS"
     */
    @Override
    public String toString() {
        String res;
        if (getJour() == 0) {
            res = "";
        } else {
            res = (getJour() + "/");
        }
        res += String.format("%02d:%02d:%02d", getHeure(), getMinute(), getSeconde());
        return res;
    }

    public static void main(String[] args) {
        Duree durée1;
        Duree durée2;
        durée1 = new Duree(3, 4, 49);
        durée2 = new Duree(3, 24, 37);
        System.out.println("Durée 1 = " + durée1);
        System.out.println("Durée 2 = " + durée2);
        System.out.println("Différence = " + durée2.différence(durée1));
        Duree gdDurée = new Duree(123456789);
        System.out.println("Gd Durée = " + gdDurée);
    }
}
