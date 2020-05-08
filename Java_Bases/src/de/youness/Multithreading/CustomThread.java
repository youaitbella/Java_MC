package de.youness.Multithreading;

public class CustomThread extends Thread {

    String name;
    Blubb blubb;
    boolean flag;

    CustomThread(String name, Blubb blubb, boolean b) {
        this.name = name;
        this.blubb = blubb;
        this.flag = b;
    }

    public void run() {
        System.out.println("Starte Thread " + name);
        for (int i = 0; i < 5; i++) {
            if(flag){
                blubb.first();
            }else{
                blubb.second();
            }
        }
        System.out.println("Beende Thread " + name);
    }
    /*
    String name;
    Integer counter;

    CustomThread(String name, Integer counter) {
        this.name = name;
        this.counter = counter;
    }

    public void run() {
        System.out.println("Starte Thread " + name);
        synchronized (counter) {

            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                    System.out.println(counter++);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Beende Thread " + name);
    }
    */
}
