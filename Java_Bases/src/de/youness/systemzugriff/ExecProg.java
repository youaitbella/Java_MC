/**
 * Wie lässt sich ein Programm aus Java heraus starten und ausführen?
 * Mit Hilfe der Methode Runtime.exec(String s) kann ein Programm aus Java heraus ausgeführt werden.
 *
 * Das Programmbeispiel liest mit Hilfe des Unix-Befehls less die Datei '/etc/fstab' aus und gibt das Ergebnis auf der Konsole aus.
 * Mit Hilfe der statischen Methode Runtime.getRuntime() wird zunächst die aktuelle Laufzeitumgebung ermittelt. Innerhalb eines try-catch-Blockes wird der auszuführende Befehl als String-Parameter an die Methode Runtime.exec() übergeben. Die Methode gibt ein Process-Objekt zurück, das den gestarteten Prozess repräsentiert.
 * Dessen Methode getInputStream() gibt einen InputStream-Objekt zurück, das wie üblich verarbeitet werden kann.
 */
package de.youness.systemzugriff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecProg {

    public static void main(String[] args) {
        Process proc;
        String befehl = "less /etc/fstab";
        Runtime run = Runtime.getRuntime();
        InputStream inStr = null;
        BufferedReader buff = null;
        try {
            proc = run.exec(befehl);
            inStr = proc.getInputStream();
            buff = new BufferedReader(new InputStreamReader(inStr));
            String str;
            while ((str = buff.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (buff != null) {
                    buff.close();
                }
                if (inStr != null) {
                    inStr.close();
                }
            } catch (IOException ioe) {
            }
        }
    }
}
