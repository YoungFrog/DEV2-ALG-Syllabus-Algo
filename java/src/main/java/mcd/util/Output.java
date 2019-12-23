package mcd.util;

/**
 * Helper functions to write formatted colored code to terminal.
 * Warning : there is a bug with the background when reaching the bottom of the screen.
 *
 * @author Marco Codutti (MCD)
 */
public class Output {

    /**
     * Format a string with the given effects for that terminal. Effects will be
     * visible if the returned string is sent to the terminal. Ulterior prints
     * will show no effect at all.
     *
     * @param text the string to modify.
     * @param effects the effects to apply.
     * @return the modified string.
     */
    public static String apply(String text, AnsiEffect... effects) {
        String ansiText = text;
        for (AnsiEffect effect : effects) {
            ansiText = effect.code() + ansiText;
        }
        return ansiText + AnsiEffect.DEFAULT.code() + AnsiEffect.RESET.code();
    }

    /**
     * Display a text with effects on the terminal.
     *
     * @param text the text to display
     * @param effects the effects to apply
     */
    public static void print(String text, AnsiEffect... effects) {
        System.out.print(apply(text, effects));
    }

    /**
     * Display a text with effects on the terminal then a newline.
     *
     * @param text the text to display
     * @param effects the effects to apply
     */
    public static void println(String text, AnsiEffect... effects) {
        print(text + "\n", effects);
    }

    /**
     * Display a blank line on the terminal.
     */
    public static void blankLine() {
        println("");
    }

    /**
     * Display a box with the text inside. Only useful with a background effet.
     *
     * @param text the text to display.
     * @param effects the effect to apply to the text.
     */
    public static void box(String text, AnsiEffect... effects) {
        int size = text.length();
        String box = " ";
        for (int i = 0; i < size; i++) {
            box += " ";
        }
        box += " ";
        println(box, effects);
        println(" " + text + " ", effects);
        box = " ";
        for (int i = 0; i < size; i++) {
            box += " ";
        }
        box += " ";
        println(box, effects);
    }

    public static void main(String[] args) {
        blankLine();
        box("   Démo de la classe Output   ", AnsiEffect.BG_BLUE, AnsiEffect.BRIGHT_WHITE);
        blankLine();
        println("Un texte en magenta", AnsiEffect.MAGENTA);
    }
}