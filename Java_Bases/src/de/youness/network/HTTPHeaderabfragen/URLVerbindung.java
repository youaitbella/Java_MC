package de.youness.network.HTTPHeaderabfragen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Set;

public class URLVerbindung {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javabeginners.de");

            URLConnection con = url.openConnection();
            con.connect();
            Set s = con.getHeaderFields().entrySet();
            Iterator<Object> iter = s.iterator();
            while (iter.hasNext()) {
                System.out.println(iter.next());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
