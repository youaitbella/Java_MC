/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.youness.Threads.ThreadInAndererKlasse;

/**
 *
 * @author aitbellayo
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ThreadInAndererKlasse extends JFrame implements ActionListener {

    private final JButton button;

    public ThreadInAndererKlasse() {

        button = new JButton("auf geht's");
        button.addActionListener(this);

        this.add(button);
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ThreadInAndererKlasse();
    }

    public void actionPerformed(ActionEvent arg0) {
        MachWas machDoch = new MachWas();
        machDoch.start();
    }
}
