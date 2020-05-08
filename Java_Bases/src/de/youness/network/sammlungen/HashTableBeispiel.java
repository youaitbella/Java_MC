package de.youness.network.sammlungen;

/**
 * Was sind Hashtable und Hashmap? Hashtable und Hashmap stellen Suchtabellen
 * dar, deren Einträge aus Schlüssel-Wert-Paaren bestehen.
 *
 * Die Schlüssel sind immer eindeutig, da das Setzen eines neuen Wertes mit
 * put() bei einem vorhandenen Schlüssel dessen Wert überschreibt. Schlüssel und
 * Wert müssen Objekte beliebigen Typs außer null sein. Primitive Datentypen
 * sind nicht erlaubt und werden beim Setzen als Schlüssel oder Wert durch
 * Boxing in Objekte der entsprecheden Wrapper-Klassen gewandelt. Hashtable und
 * Hashmap besitzen zwei Parameter, die für die Effizienz und Geschwindigkeit
 * ihres Arbeitens entscheidend sind: die initial capacity (anfängliche
 * Kapazität) und ihr load factor (Füllfaktor). Werden beide Werte im
 * Konstruktor nicht gesetzt, beträgt die Kapazität anfänglich 11 Elemente, bei
 * einem Füllfaktor von 75% (0.75). Der Füllfaktor gibt an, in welchem Maße die
 * Sammlung maximal gefüllt sein darf. Wird dieser Wert beim Einfügen neuer
 * Elemente überschritten, wird sie intern neu angelegt und berechnet. Der
 * benötigte Overhead der Sammlung hat mit der internen Umsetzung der Einträge
 * in ein Array und der Behandlung von doppelten Werten zu tun. Für eine wenig
 * zeitkritische Verwendung ist es empfehlenswert, den Füllfaktor nicht zu
 * ändern. So ist der effizienteste Kompromiss zwischen Geschwindigkeit und
 * Speicherbedarf gewährleistet.
 *
 */
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableBeispiel {

    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        String s;

        ht.put(2, "Hund");
        ht.put(1, "Katze");
        ht.put(3, "Regenwurm");
        System.out.println("Durchlauf 1:");
        for (Integer elem : ht.keySet()) {
            s = ht.get(elem);
            System.out.println(elem + " - " + s);
        }
        // Wert unter Key "1" wird ersetzt
        ht.put(1, "Pferd");
        System.out.println("\nDurchlauf 2:");
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            Integer i = keys.nextElement();
            s = ht.get(i);
            System.out.println(i + " - " + s);
        }

        System.out.println("\nKatze vorhanden? " + ht.containsValue("Katze"));

        ht.put(4, "Hund");
        System.out.println("\nAnzahl Elemente nach einf\u00FCgen von '4': "
                + ht.size());
        System.out.println("\nDurchlauf 3:");
        Enumeration<String> vals = ht.elements();
        while (vals.hasMoreElements()) {
            System.out.println(vals.nextElement());
        }

        ht.remove(4);
        System.out.println("\nAnzahl Elemente nach entfernen von '4': "
                + ht.size());

        ht.clear();
        System.out.println("\nAnzahl Elemente nach clear(): " + ht.size());
    }
}
