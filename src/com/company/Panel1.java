package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel1 extends JPanel implements MouseListener {
    public Panel1(){
        addMouseListener(this);

    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(0,0,getWidth(), getHeight());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.setVisible(false);
        Shared.panel2.setVisible(true);
        System.out.println(Shared.panel2.isVisible());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
