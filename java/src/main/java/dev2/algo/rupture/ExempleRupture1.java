package dev2.algo.rupture;

import java.time.LocalDate;
import java.util.List;

/**
 * Calcul du nombre d'étudiants par option.
 *
 * @author MCD
 */
public class ExempleRupture1 {

    public static void nbEtudiantsParOption(List<Etudiant> étudiants) {
        int cptEtudiantsOption, i;

        i = 0;
        while (i < étudiants.size()) {
            String saveOption = étudiants.get(i).getOption();
            cptEtudiantsOption = 0;
            while (i < étudiants.size() && étudiants.get(i).getOption().equals(saveOption)) {
                cptEtudiantsOption++;
                i++;
            }
            System.out.println("Il y a " + cptEtudiantsOption
                    + " étudiants dans l'option " + saveOption);
        }
    }

    public static void main(String[] args) {
        List<Etudiant> étudiants = List.of(
                new Etudiant(1001, "Etd01", "Gestion", LocalDate.of(2000, 2, 1)),
                new Etudiant(1002, "Etd02", "Gestion", LocalDate.of(2000, 2, 4)),
                new Etudiant(1003, "Etd03", "Gestion", LocalDate.of(2000, 6, 1)),
                new Etudiant(1004, "Etd04", "Gestion", LocalDate.of(2001, 2, 1)),
                new Etudiant(1005, "Etd05", "Gestion", LocalDate.of(2001, 3, 1)),
                new Etudiant(1006, "Etd06", "Gestion", LocalDate.of(2001, 4, 3)),
                new Etudiant(1007, "Etd07", "Gestion", LocalDate.of(2001, 6, 2)),
                new Etudiant(1008, "Etd08", "Gestion", LocalDate.of(2002, 6, 21)),
                new Etudiant(1009, "Etd09", "Gestion", LocalDate.of(2002, 6, 29)),
                new Etudiant(1010, "Etd10", "Gestion", LocalDate.of(2002, 12, 1)),
                new Etudiant(1011, "Etd11", "Gestion", LocalDate.of(2002, 12, 11)),
                new Etudiant(1012, "Etd12", "Industrielle", LocalDate.of(2000, 2, 1)),
                new Etudiant(1013, "Etd13", "Industrielle", LocalDate.of(2000, 2, 2)),
                new Etudiant(1014, "Etd14", "Industrielle", LocalDate.of(2000, 9, 1)),
                new Etudiant(1015, "Etd15", "Réseau", LocalDate.of(2000, 2, 2)),
                new Etudiant(1016, "Etd16", "Réseau", LocalDate.of(2000, 2, 11)),
                new Etudiant(1017, "Etd17", "Réseau", LocalDate.of(2000, 4, 1)),
                new Etudiant(1018, "Etd18", "Réseau", LocalDate.of(2001, 2, 1)),
                new Etudiant(1019, "Etd19", "Réseau", LocalDate.of(2001, 3, 1)),
                new Etudiant(1020, "Etd20", "Réseau", LocalDate.of(2001, 3, 1)),
                new Etudiant(1021, "Etd21", "Réseau", LocalDate.of(2002, 2, 1))
        );
        nbEtudiantsParOption(étudiants);
    }
}
