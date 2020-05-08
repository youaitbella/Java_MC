package de.youness.network.sammlungen;

import java.util.Iterator;
import java.util.TreeSet;

public class IteratorTest {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();
        for (int i = 0; i < 20; i++) {
            set.add(new Integer(i).toString());
        }

        for (Iterator<String> it = set.iterator(); it.hasNext();) {
            String s = it.next();
            if (s.equals("15")) {
                it.remove();
            }
            System.out.println(s); // "15" noch enthalten
        }

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            // if(s.equals("15")) set.remove(s); // ConcurrentModificationException
            iter.remove();
            System.out.println(s); // "15" entfernt
        }
    }
}
