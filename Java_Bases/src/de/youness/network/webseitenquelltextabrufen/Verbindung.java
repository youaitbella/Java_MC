package de.youness.network.webseitenquelltextabrufen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Verbindung {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javabeginners.de");
            show(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show(URL url) throws IOException {
        InputStream in = url.openStream();
        BufferedReader buff = new BufferedReader(new InputStreamReader(in));
        String s;
        while ((s = buff.readLine()) != null) {
            System.out.println(s);
        }
    }
}
