package de.youness.systemzugriff;

import java.awt.Toolkit;

public class ScreenSize {

    public static void main(String[] args) {
        System.out.println(Toolkit.getDefaultToolkit()
                .getScreenSize().width + " x " + Toolkit.getDefaultToolkit()
                        .getScreenSize().height);
    }
}
