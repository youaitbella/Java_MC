package observer.observer;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Zuhoerer extends JFrame implements Observer {

    private JTextField field;

    public Zuhoerer() {
        field = new JTextField("a");
        add(field);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public void update(Observable o, Object arg) {
        field.setText((String) arg);
    }
}
