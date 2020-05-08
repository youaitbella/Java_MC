/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.youness.Threads;

/**
 *
 * @author aitbellayo
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AufMethodeWarten1 {

    static String file = "test.txt";

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            public void run() {
                write();
                System.out.println("writing finished");
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                read();
                System.out.println("reading finished");
            }
        };
        t2.start();

    }

    static void write() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(file), true);
            for (int i = 0; i < 10; i++) {
                System.out.println("writing " + i);
                writer.write(new Integer(i).toString() + "\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }

    static void read() {
        BufferedReader reader = null;
        String zeile;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((zeile = reader.readLine()) != null) {
                System.out.println("reading " + zeile);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ioe) {
            }
        }
    }
}
