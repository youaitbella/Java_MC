/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.youness.swing.SwingElemente.baeume;

/**
 *
 * @author aitbellayo
 */
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

public class CustomTreeIcons extends JFrame {

    public CustomTreeIcons() {
        this.setLayout(new GridLayout(1, 1));
        initTree();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setTitle("Custom Tree Icons");
        this.setVisible(true);
    }

    private void initTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        root.add(new DefaultMutableTreeNode("Blatt 1"));
        root.add(new DefaultMutableTreeNode("Blatt 2"));
        DefaultTreeModel model = new DefaultTreeModel(root);
        JTree tree = new JTree(model);
        tree.setCellRenderer(new MyCellRenderer());
        this.add(tree);
    }

    public static void main(String[] args) {
        new CustomTreeIcons();

    }
}

class MyCellRenderer extends DefaultTreeCellRenderer {

    public MyCellRenderer() {
        openIcon = createImageIcon("img/open.png");
        closedIcon = createImageIcon("img/closed.png");
        leafIcon = createImageIcon("img/leaf.png");
    }

    protected ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = getClass().getClassLoader().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        }
        System.err.println(path + " nicht gefunden!");
        return null;
    }
}
