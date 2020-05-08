/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.youness.swing.XML;

/**
 *
 * @author aitbellayo
 */
import java.io.File;
import java.io.IOException;
import java.util.List;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.JDOMException;
//import org.jdom.input.SAXBuilder;
//import org.jdom.output.XMLOutputter;

class JDOMLesen {

    public static void main(String[] args) {

//        Document doc = null;

        File f = new File("xml_file.xml");

//        try {
//            // Das Dokument erstellen
//            SAXBuilder builder = new SAXBuilder();
//            doc = builder.build(f);
//            XMLOutputter fmt = new XMLOutputter();
//
//            // komplettes Dokument ausgeben
//            fmt.output(doc, System.out);
//
//            // Wurzelelement ausgeben
//            Element element = doc.getRootElement();
//            System.out.println("\nWurzelelement: " + element);
//
//            // Wurzelelementnamen ausgeben
//            System.out.println("Wurzelelementname: " + element.getName());
//
//            // Eine Liste aller direkten Kindelemente eines Elementes erstellen
//            List alleKinder = (List) element.getChildren();
//            System.out.println("Erstes Kindelement: "
//                    + ((Element) alleKinder.get(0)).getName());
//
//            // Eine Liste aller direkten Kindelemente eines benannten
//            // Elementes erstellen
//            List benannteKinder = element.getChildren("Strasse");
//
//            // Das erste Kindelement ausgeben
//            System.out.println("benanntes Kindelement: "
//                    + ((Element) benannteKinder.get(0)).getName());
//
//            // Wert eines bestimmten Elementes ausgeben
//            Element kind = element.getChild("Nachname");
//            System.out.println("Nachname: " + kind.getValue());
//
//            // Attribut ausgeben
//            Element kind2 = element.getChild("Ort");
//            System.out.println("Ortsname: " + kind2.getAttributeValue("name"));
//        } catch (JDOMException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
