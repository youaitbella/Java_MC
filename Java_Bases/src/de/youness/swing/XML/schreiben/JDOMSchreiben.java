/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.youness.swing.XML.schreiben;

/**
 *
 * @author aitbellayo
 */
import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.output.Format;
//import org.jdom.output.XMLOutputter;

public class JDOMSchreiben {

    private final static String DATNAM = "xmlTest.xml";

    private final static File FILE = new File(DATNAM);

    private final static String NAMESPACE = "https://javabeginners.de/xml";

//    private Document createDoc(String rootElement) {
//        Document doc = new Document();
//        Element root = new Element(rootElement, NAMESPACE);
//        doc.setRootElement(root);
//        return doc;
//    }
//
//    private void writeDoc(Document doc) {
//        Element e1 = new Element("e1");
//        e1.setAttribute("name", e1.getName());
//        e1.setAttribute("value", "Wert 1");
//        doc.getRootElement().addContent(e1);
//        Element e2 = new Element("e2");
//        Element n2 = new Element("name");
//        n2.setText("e2");
//        Element v2 = new Element("value");
//        v2.setText("Wert 2");
//        e2.addContent(n2);
//        e2.addContent(v2);
//        doc.getRootElement().addContent(e2);
//    }
//
//    private void writeXML(Document doc) {
//        Format format = Format.getPrettyFormat();
//        format.setIndent("    ");
//        try (FileOutputStream fos = new FileOutputStream(FILE)) {
//            XMLOutputter op = new XMLOutputter(format);
//            op.output(doc, fos);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        JDOMSchreiben jds = new JDOMSchreiben();
//        Document doc = jds.createDoc("elements");
//        jds.writeDoc(doc);
//        jds.writeXML(doc);
//    }
}
