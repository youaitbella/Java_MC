package de.youness.strings.json;

import java.io.FileWriter;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;

/**
 * Im Beispiel wird als erstes ein JasonObjectBuilder-Objekt erzeugt, dem in der
 * Folge zunächst drei Einträge hinzugefügt werden. Die Einträge bestehen aus
 * jeweils zwei Werten, einem Schlüssel als String und einem Wert, der bei den
 * ersten beiden Einträgen ebenfalls ein String und beim dritten ein Integer
 * ist. Im darauf folgenden Quelltextbereich wird deutlich, wie ein Array
 * erzeugt und dies dann ebenfalls dem Builder hinzugefügt werden kann. Hier
 * muss zunächst ein Objekt vom Typ JsonArrayBuilder erzeugt werden. Pro Eintrag
 * wird nun wiederum ein JsonObjectBuilder erzeugt, dem die Daten hinzugefügt
 * werden und der anschließend dem JsonArrayBuilder angefügt wird. Das
 * JasonArrayBuilder-Objekt wird schließlich in das oberste
 * JasonObjectBuilder-Objekt eingefügt. Bevor das JsonObject über die Methode
 * build() erstellt wird, wird noch demonstriert, dass auch boolsche Werte
 * abgelegt werden können.
 */
public class WriteJson {

    public static void main(String[] args) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        builder.add("vorname", "Paul");
        builder.add("nachname", "Schmitz");
        builder.add("alter", 14);

        JsonArrayBuilder arrb = Json.createArrayBuilder();

        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("stil", "rock");
        job.add("band", "U2");
        arrb.add(job);

        job = Json.createObjectBuilder();
        job.add("stil", "metal");
        job.add("band", "Black Sabbath");
        arrb.add(job);

        builder.add("musik", arrb);
        builder.add("hungrig", true);
        JsonObject jo = builder.build();

        try {
            FileWriter fw = new FileWriter("test.txt");
            JsonWriter jsonWriter = Json.createWriter(fw);
            jsonWriter.writeObject(jo);
            jsonWriter.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
