package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    private BorderLayoutExample(){
        super();
        this.setTitle("BorderLayout Example");

        JPanel mainPanel = new JPanel(new BorderLayout());

        mainPanel.add(new JButton("North"), BorderLayout.NORTH);
        mainPanel.add(new JButton("South"), BorderLayout.SOUTH);
        mainPanel.add(new JButton("East"),BorderLayout.EAST);
        mainPanel.add(new JButton("West"), BorderLayout.WEST);

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel.add(new JLabel("Drück mich:"));
        centerPanel.add(new JButton("Center"));

        mainPanel.add(centerPanel, BorderLayout.CENTER);

        this.add(mainPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
