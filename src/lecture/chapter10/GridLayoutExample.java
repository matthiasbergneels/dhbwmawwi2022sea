package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {


    private GridLayoutExample(){
        super();
        this.setTitle("GridLayout Example");

        JPanel mainPanel = new JPanel(new GridLayout(0,2));

        //this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(new JLabel("Header Bereich"), BorderLayout.NORTH);

        mainPanel.add(new JButton("Button 1"));
        mainPanel.add(new JButton("Button 2"));

        JPanel cellThreePanel = new JPanel(new FlowLayout());
        cellThreePanel.add(new JButton("Button 3"));
        mainPanel.add(cellThreePanel);
        mainPanel.add(new JPanel());

        mainPanel.add(new JButton("Button 4"));
        mainPanel.add(new JButton("Button 5"));
        mainPanel.add(new JButton("Button 6"));
        mainPanel.add(new JButton("Button 7"));
        mainPanel.add(new JButton("Button 8"));
        mainPanel.add(new JButton("Button 9"));

        this.add(mainPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
