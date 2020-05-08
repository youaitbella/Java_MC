package de.youness.strings.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map.Entry;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import javax.json.JsonValue;
import javax.json.JsonValue.ValueType;

/**
 * Innerhalb eines try-catch-Blockes, der Fehler beim Auslesen der Datei
 * abfangen soll, wird ein JsonReader-Objekt mit einem FileReader als Parameter
 * gebildet. Die Methode read() liefert eine JsonStructure, die ein
 * Ober-Interface von JasonObject und JasonArray darstellt. Beide wiederum
 * implementieren JsonValue, sodass ein Casten in diesen Typ im nächsten Schritt
 * problemlos möglich ist. Es wird an die Methode print() übergeben, die das
 * schrittweise Ermittln der eingetragenen Werte teilweise rekursiv übernimmt.
 *
 * Hier wird unterschieden, ob der übergebene Parameter vom Typ JsonObject oder
 * JsonArray ist. In beiden Fällen findet als erstes ein explizites Wandeln in
 * diesen Typ statt. Ein Objekt wird innerhalb des Kopfes einer for-Schleife
 * zunächst in ein Set einzelner Einträge vom Typ Map.Entry zerlegt, die jeweils
 * aus Key-Value-Paaren bestehen. Ist dieser Eintrag ein JsonArray, so wird die
 * Methode mit diesem Eintrag rekursiv aufgerufen, ansonsten werden Schlüssel
 * und Wert ausgegeben.
 *
 * Ein Array wird im Gegensatz zu einem JsonObject in seine einzelnen Einträge
 * zerlegt. Sie bestehen ja ihrerseits aus Key-Value-Paaren, die dann bei einer
 * erneuten Rekursion der Methode ausgegeben werden können.
 */
public class ReadJson {

    public static void main(String[] args) {
        FileReader fr;
        JsonStructure struct;
        try {
            fr = new FileReader("test.txt");
            JsonReader reader = Json.createReader(fr);
            struct = reader.read();
            JsonValue value = struct;
            print(value);
            reader.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void print(JsonValue value) {
        JsonObject object = null;
        if (value.getValueType() == ValueType.OBJECT) {
            object = (JsonObject) value;
            for (Entry<String, JsonValue> set : object.entrySet()) {
                if (set.getValue() instanceof JsonArray) {
                    System.out.println("Array: ");
                    print((JsonValue) set.getValue());
                } else {
                    System.out.println(set.getKey() + ": " + set.getValue());
                }
            }
        } else if (value.getValueType() == ValueType.ARRAY) {
            JsonArray array = (JsonArray) value;
            for (JsonValue val : array) {
                print(val);
            }
        }
    }
}
