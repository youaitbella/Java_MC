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
import javax.swing.ProgressMonitor;
import javax.swing.SwingUtilities;

public class MachWas extends Thread {

    private ProgressMonitor pm;

    int i = 0;

    public MachWas() {
        pm = new ProgressMonitor(null, "Fortschritt anzeigen", "", 0, 100);
        pm.setMillisToDecideToPopup(1);
    }

    public void run() {
        try {
            machDochWas();
        } catch (Exception e) {
        }
    }

    public void machDochWas() {
        while (!pm.isCanceled() && i <= 100) {
            pm.setNote(new Integer(i).toString());
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    pm.setProgress(i);
                }
            });

            System.out.println(i);
            // statt rechenintensiver Aktion
            // Thread kurz unterbrechen
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            i++;
        }
    }

}
