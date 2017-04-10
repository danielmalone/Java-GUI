package com.finepointstudios;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Main extends Frame implements ActionListener, WindowListener {

    private Label label;

    public Main() {
        setLayout(new FlowLayout());
        label = new Label("asdf");
        setTitle("Fine Point Mobile");
        setSize(400, 400);
        setVisible(true);

        addWindowListener(this);
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("asdf44");
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
