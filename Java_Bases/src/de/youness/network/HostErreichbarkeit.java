package de.youness.network;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Wie kann die Erreichbarkeit eines Hosts in einem Netzwerk überprüft werden?
 * Die Klasse InetAdress stellt Methoden bereit. die zur Verifizierungung von
 * Netzwerkadressen verwendet werden können. Hierzu muss lediglich mit der
 * statischen Methode getByName(), der der Hostname als Argument übergeben wird,
 * ein Objekt der Klasse InetAddress erzeugt werden, das dann mit der Methode
 * isReachable() die Erreichbarkeit prüft.
 */
public class HostErreichbarkeit {

    public static void main(String[] args) {
        String host = "javabeginners.de";
        try {
            InetAddress iAdr = InetAddress.getByName(host);
            if (iAdr.isReachable(5000)) {
                System.out.println("Host '" + host
                        + "' ist erreichbar und hat die IP: "
                        + iAdr.getHostAddress());
            } else {
                System.out.println("Host '" + host + "' ist nicht erreichbar");
            }
        } catch (IOException e) {
            System.err
                    .println("IOProbleme beim Testen der Erreichbarkeit von: '"
                            + host);
        }
    }
}
