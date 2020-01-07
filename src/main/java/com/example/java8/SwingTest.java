package com.example.java8;

import javax.swing.*;

/**
 * @author NR
 * @version 1.0
 * @Description TODO
 * @date 2020/1/5 15:50
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My Jbutton");
        jButton.addActionListener( event -> {
            System.out.println("Jbutton press1");
            System.out.println("Jbutton press2");
            System.out.println("Jbutton press3");
        });
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Jbutton press");
//            }
//        });
        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
