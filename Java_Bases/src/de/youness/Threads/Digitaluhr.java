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
import java.awt.Font;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Digitaluhr extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;

    private JLabel label;

    private Date date;

    private Font font = new Font("Verdana", Font.PLAIN, 20);

    private Thread thread;

    public Digitaluhr() {
        label = new JLabel();
        label.setFont(font);
        this.add(label);
        start();
    }

    private void gibDate() {
        label.setText(date.toString());
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run() {

        while (true) {
            date = new Date();
            gibDate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Digitaluhr c = new Digitaluhr();
        JFrame f = new JFrame();
        f.add(c);
        f.setSize(350, 60);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
