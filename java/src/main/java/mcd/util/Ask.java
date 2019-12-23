package mcd.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Méthodes utilitaires diverses pour demander des informations au clavier.
 *
 * @author MCD
 */
public class Ask {

    private static final Scanner in = new Scanner(System.in);
    private static final List<String> yesAnswers = Arrays.asList("o","oui");
    private static final List<String> noAnswers = Arrays.asList("n","non");

    /**
     * Demande un entier à l'utilisateur.
     *
     * Un message en bleu lui est proposé. Si la valeur entrée n'est pas un
     * entier, un message d'erreur est affiché (en rouge) et la demande est
     * réitérée.
     *
     * @param message le message à afficher (en bleu) pour lui expliquer ce
     * qu'il doit entrer.
     * @return le nombre entier donné par l'utilisateur.
     */
    public static int askInt(String message) {
        info(message + ": ");
        while (!in.hasNextInt()) {
            error("Ce n'est pas un entier !");
            in.next();
            info(message + ": ");
        }
        return in.nextInt();
    }

    /**
     * Demande un entier à l'utilisateur (avec une valeur minimale).
     *
     * Un message en bleu lui est proposé. Si la valeur entrée n'est pas un
     * entier ou est plus petite que le minimum donné, un message d'erreur est
     * affiché (en rouge) et la demande est réitérée.
     *
     * @param message le message à afficher (en bleu) pour lui expliquer ce
     * qu'il doit entrer.
     * @param min la valeur minimale admise.
     * @return le nombre entier donné par l'utilisateur.
     */
    public static int askInt(String message, int min) {
        int nb;
        nb = askInt(message);
        while (nb < min) {
            error("Le nombre ne peut pas être plus petit que " + min + " !");
            nb = askInt(message);
        }
        return nb;
    }

    /**
     * Demande un entier (borné) à l'utilisateur.
     *
     * Un message en bleu lui est proposé. Si la valeur entrée n'est pas un
     * entier ou n'est pas compris entre <code>min</code> et <code>min</code>
     * inclus, un message d'erreur est affiché (en rouge) et la demande est
     * réitérée.
     *
     * @param message le message à afficher (en bleu) pour lui expliquer ce
     * qu'il doit entrer.
     * @param min la valeur minimale admise.
     * @param max la valeur maximale admise.
     * @return le nombre entier donné par l'utilisateur.
     */
    public static int askInt(String message, int min, int max) {
        int nb;
        nb = askInt(message);
        while (nb < min || nb > max) {
            error("Le nombre doit être compris entre " + min + " et " + max + " !");
            nb = askInt(message);
        }
        return nb;
    }

    /**
     * Pose une question à l'utilisateur dont la réponse est oui ou non.
     *
     * Un message en bleu lui est proposé. 
     * L'utilisateur peut entrer une des valeurs présentes dans les listes
     * <code>yesAnswers</code> et <code>noAnswers</code>
     * (dans n'importe quelle casse). 
     * Si la valeur entrée n'est pas dans la liste donnée, 
     * un message d'erreur est affiché (en rouge) et la demande est réitérée.
     *
     * @param question la question à afficher (en bleu).
     * @return <code>true</code> si l'utilisateur a répondu oui (ou équivalent)
     */
    public static boolean askBoolean(String question) {
        String answer;
        info(question + ": ");
        answer = in.next();
        while (!foundIn(yesAnswers, answer) && !foundIn(noAnswers, answer)) {
            error("Vous devez entrer " + yesAnswers 
                    + " ou " + noAnswers + " (minuscule ou majuscule) !");
            info(question + ": ");
            answer = in.next();
        }
        return foundIn(yesAnswers, answer);
    }

    private static boolean foundIn(List<String> answers, String answer) {
        return answers.contains(answer.toLowerCase());
    }

    private static void info(String msg) {
        Output.print(msg, AnsiEffect.BLUE);
    }

    private static void error(String msg) {
        Output.println(msg, AnsiEffect.RED);
    }

    public static void main(String[] args) {
        Output.box(" Démo des lectures au clavier ", AnsiEffect.BG_MAGENTA, AnsiEffect.BRIGHT_WHITE);
        int mois = askInt("Entrer un numéro de mois (1-12)", 1 , 12);
        boolean bissextile = askBoolean("Est-ce une année bissextile ?");
        Output.println("Le mois: " + mois);
        Output.println("Année bissextile: " + bissextile);
    }
}