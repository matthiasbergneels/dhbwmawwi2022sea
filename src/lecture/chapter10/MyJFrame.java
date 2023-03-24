package lecture.chapter10;

import javax.swing.*;

public class MyJFrame {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame();

        myFrame.setTitle("My First JFrame");

        myFrame.add(new JLabel("Hier wird bald der Hund stehen!"));
        myFrame.add(new JButton("Feierabend"));
        myFrame.getContentPane().add(new JButton("Feierabend on Content Pane"));
        //myFrame.getLayeredPane().add(new JButton("Feierabend on Layered Pane"));


        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
