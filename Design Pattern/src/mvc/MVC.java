package mvc;

import javax.swing.SwingUtilities;

public class MVC {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MVCView();
            }
        });
    }
}

//
//class MVCView extends JFrame {
//
//    JLabel label;
//
//    public MVCView() {
//        init();
//    }
//
//    private void init() {
//        label = new JLabel(" ");
//        label.setHorizontalAlignment(JLabel.CENTER);
//        JButton button = new JButton("klick");
//        button.addActionListener(new MVCController(this));
//        this.add(label, BorderLayout.NORTH);
//        this.add(button, BorderLayout.CENTER);
//        this.pack();
//        this.setTitle("MVC");
//        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setVisible(true);
//    }
//
//    public void setText(String s) {
//        label.setText(s);
//    }
//}
//class MVCController implements ActionListener {
//
//    private MVCView view;
//    private MVCModel model;
//
//    public MVCController(MVCView view) {
//        this.view = view;
//        this.model = new MVCModel();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        view.setText(model.getText());
//    }
//}
//
//class MVCModel {
//
//    private String text = "Hallo Welt!";
//
//    public String getText() {
//        return text;
//    }
//}
