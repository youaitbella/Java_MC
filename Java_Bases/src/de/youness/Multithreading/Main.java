package de.youness.Multithreading;

public class Main {
    public static void main(String[] args) {
        //Integer counter = 0;
        Blubb b = new Blubb();


        CustomThread t1 = new CustomThread("erster Thread", b, true);
        CustomThread t2 = new CustomThread("zweiter Thread", b, false);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ende des Programs");
    }
}
