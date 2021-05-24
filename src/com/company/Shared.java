package com.company;

import javax.swing.*;

public class Shared {
    public static JFrame window = new JFrame("panele");
    public static Panel1 panel1 = new Panel1();
    public static Panel2 panel2 = new Panel2();


    public static void start(){

        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel1.setBounds(0,0,800,600);
        panel2.setBounds(0,0,800,600);
        window.setBounds(100,100,800, 600);
        window.add(panel1);
        window.add(panel2);


        window.setLocationRelativeTo(null);

        window.setVisible(true);

    }
}
