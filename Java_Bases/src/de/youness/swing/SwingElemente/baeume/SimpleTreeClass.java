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
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.LineBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

public class SimpleTreeClass extends JFrame implements TreeSelectionListener {

    private JTree tree;

    public SimpleTreeClass() {
        this.setLayout(new BorderLayout());
        initTree();
        JButton butt = new JButton("Anderes Model");
        butt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Wurzel")));
                tree.updateUI();
            }
        });
        this.add(butt, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("Ein einfacher Baum");
        this.setVisible(true);
    }

    private void initTree() {
        MyLeaf root = new MyLeaf("", "Mitarbeiter");
        DefaultTreeModel model = new MyModel(root);
        root.add(new MyLeaf("Paul", "Meier"));
        tree = new JTree(model);
        tree.addTreeSelectionListener(this);
        tree.setCellRenderer(new MyRenderer());
        tree.setRootVisible(true);
        tree.setShowsRootHandles(true);
        this.add(new JScrollPane(tree), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new SimpleTreeClass();
    }

    public void valueChanged(TreeSelectionEvent e) {
        MyLeaf node = (MyLeaf) tree.getLastSelectedPathComponent();
        if (node != tree.getModel().getRoot() && node != null) {
            System.out.println(((MyLeaf) node).getFirstName() + " "
                    + ((MyLeaf) node).getLastName());
        }
    }
}

class MyLeaf extends DefaultMutableTreeNode {

    String firstName, lastName;

    public MyLeaf(String firstName, String lastName) {
        super(lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class MyModel extends DefaultTreeModel {

    public MyModel(DefaultMutableTreeNode node) {
        super(node);
        DefaultMutableTreeNode wurzel = node;
        wurzel.add(new MyLeaf("Karl", "Schmitz"));
    }
}

class MyRenderer extends DefaultTreeCellRenderer {

    public MyRenderer() {
        setTextSelectionColor(new Color(120, 120, 120));
        setOpaque(true);
    }

    public Component getTreeCellRendererComponent(JTree tree, Object value,
            boolean sel, boolean expanded, boolean leaf, int row,
            boolean hasFocus) {
        super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf,
                row, hasFocus);

        if (sel) {
            this.setBorder(new LineBorder(Color.BLACK));
        } else {
            this.setBorder(null);
        }

        if (leaf) {
            this.setBackground(Color.RED);
        } else {
            this.setBackground(Color.GREEN);
        }

        if (sel) {
            this.setBackground(Color.YELLOW);
        }

        return this;
    }
}
