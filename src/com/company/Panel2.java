package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel2 extends JPanel implements MouseListener {
    public Panel2(){
        addMouseListener(this);
        this.setPreferredSize(new Dimension(800,600));
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(0,0,getWidth(), getHeight());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.setVisible(false);
        Shared.panel1.setVisible(true);
        System.out.println(Shared.panel1.isVisible());
        Shared.panel1.repaint();
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
