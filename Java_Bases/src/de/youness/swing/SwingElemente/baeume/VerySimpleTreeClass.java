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
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class VerySimpleTreeClass extends JFrame {

    private JTree tree;

    public VerySimpleTreeClass() {
        initTree();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Ein sehr einfacher Baum");
        this.setVisible(true);
    }

    private void initTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultTreeModel model = new DefaultTreeModel(root);
        root.add(new DefaultMutableTreeNode("Version 1"));
        tree = new JTree(model);
        tree.setRootVisible(true);
        tree.setShowsRootHandles(true);
        this.add(new JScrollPane(tree));
    }

    public static void main(String[] args) {
        new VerySimpleTreeClass();
    }
}
