package mcd.util;

/**
 * Effects that can be applied on ansi text terminals. At the moment, we provide
 * essentially color effects. Some ansi-aware terminals may implement only part
 * of the effects.
 *
 * @author Marco Codutti (MCD)
 */
public enum AnsiEffect {

    /**
     * Reset all effects, falling back to default foreground and background
     * color.
     */
    RESET(0),
    DEFAULT(39,49),
    BLACK(30), RED(31), GREEN(32), YELLOW(33),
    BLUE(34), MAGENTA(35), CYAN(36), WHITE(37),
    BRIGHT_BLACK(90), BRIGHT_RED(91), BRIGHT_GREEN(92), BRIGHT_YELLOW(93), 
    BRIGHT_BLUE(94), BRIGHT_MAGENTA(95), BRIGHT_CYAN(96), BRIGHT_WHITE(97),
    BG_BLACK(40), BG_RED(41), BG_GREEN(42), BG_YELLOW(43),
    BG_BLUE(44), BG_MAGENTA(45), BG_CYAN(46), BG_WHITE(47),
    BG_BRIGHT_BLACK(100), BG_BRIGHT_RED(101), BG_BRIGHT_GREEN(102), BG_BRIGHT_YELLOW(103),
    BG_BRIGHT_BLUE(104), BG_BRIGHT_MAGENTA(105), BG_BRIGHT_CYAN(106), BG_BRIGHT_WHITE(107)
    ;

    private final String codeString;

    /**
     * Create an effect using one or many codes.
     * @param codes 
     */
    private AnsiEffect(int... codes) {
        String cs = "";
        for (int code : codes) {
            cs += "\033[" + code + "m";
        }
        this.codeString = cs;
    }

    /**
     * Code to write for that given effect.
     *
     * @return the code to send to the terminal to obtain the given effect.
     */
    public String code() {
        return codeString;
    }

}