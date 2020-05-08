package de.youness.Multithreading;

public class Blubb {
    boolean flag = false;
    boolean flag2 = true;

    public synchronized void first(){
        if(flag2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ich bin der erste.");
        flag=true;
        notify();
    }
    public synchronized void second(){
        if(!flag2){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ich bin der zweite.");
        flag=false;
        notify();
    }
}
