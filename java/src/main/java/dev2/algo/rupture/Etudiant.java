package dev2.algo.rupture;

import java.time.LocalDate;

/**
 * Un étudiant. Sert de support pour expliciter des algorithmes de rupture.
 *
 * @author MCD
 */
public class Etudiant {

    private final int numéro;
    private final String nom;
    private final String option;
    private LocalDate naissance;

    public Etudiant(int numéro, String nom, String option, LocalDate naissance) {
        this.numéro = numéro;
        this.nom = nom;
        this.option = option;
        this.naissance = naissance;
    }

    public int getNuméro() {
        return this.numéro;
    }

    public String getNom() {
        return this.nom;
    }

    public String getOption() {
        return this.option;
    }

    public LocalDate getNaissance() {
        return this.naissance;
    }
}
