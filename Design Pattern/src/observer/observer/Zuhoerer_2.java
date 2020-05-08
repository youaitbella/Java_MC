package observer.observer;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Zuhoerer_2 extends JFrame implements Observer {

    private JTextField field2;

    public Zuhoerer_2() {
        field2 = new JTextField("b");
        add(field2);

        setTitle("Zuhoerer 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    public void update(Observable o, Object arg) {
        field2.setText((String) arg);
    }
}
