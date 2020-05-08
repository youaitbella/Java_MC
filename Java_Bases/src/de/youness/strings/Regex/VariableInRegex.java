package de.youness.strings.Regex;

/**
 * jb enthält den zu prüfenden Text, var definiert ein Pattern, auf das jb
 * geprüft werden soll. Wird das Pattern gefunden, so soll es durch den neuen
 * String Kaffee ersetzt werden. In der Methode matches() der Klasse String wird
 * auf das Vorkommen von var geprüft: jb besteht, vereinfacht ausgedrückt, aus
 * einer Reihe beliebiger Zeichen, dann dem Pattern (Snippets) und dann wieder
 * einer Reihe beliebiger Zeichen.
 */
/**
 * Genau darauf filtert der reguläre Ausdruck. Er wird als Argument der Methode
 * matches() übergeben. Die Variable var wird links und rechts mit zwei Strings
 * durch den Plus-Operator verbunden. Beide Strings bestehen aus einem Punkt und
 * einem Stern. Der Punkt steht für ein beliebiges Zeichen, der Stern für eine,
 * keine- oder mehrmalige Wiederholung des vorangegangenen Ausdrucks. Ersetzt
 * man den Variablen-Bezeichner durch den Variablen-Inhalt, so ergibt dies:
 * .*Snippets.*. Der Begriff Snippets wird also durch Kaffee ersetzt:
 */
public class VariableInRegex {

    public static void main(String[] args) {
        String jb = "Javabeginners, Quelltexte und Snippets f\u00fcr Java-Anf\u00e4nger.";
        String var = "Snippets";
        if (jb.matches(".*" + var + ".*")) {
            jb = jb.replaceAll(var, "Kaffee");
            System.out.println(jb);
        }
    }
}
