package de.youness.files;


import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

public class HTMLDarstellenClass extends JFrame {

    private static final long serialVersionUID = 1L;

    private JEditorPane htmlPane, textPane;

    public HTMLDarstellenClass() {
        htmlPane = new JEditorPane();
        htmlPane.setContentType("text/html");
        JScrollPane htmlSP = new JScrollPane(htmlPane);
        textPane = new JEditorPane();
        textPane.setContentType("text/plain");
        JTabbedPane tabbedPane = new JTabbedPane();
        JScrollPane textSP = new JScrollPane(textPane);
        tabbedPane.add(htmlSP, "HTML");
        tabbedPane.add(textSP, "Quelltext");

        setURL();

        this.add(tabbedPane);
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void setURL() {
        try {
            URL url = new URL("http://www.javabeginners.de");
            InputStream in = url.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            StringBuffer buff = new StringBuffer();

            int len;
            while ((len = isr.read()) != -1) {
                buff.append((char) len);
            }
            in.close();
            isr.close();
            htmlPane.setPage(url);
            textPane.setText(buff.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new HTMLDarstellenClass();
    }

}
