package lecture.chapter10;

import javax.swing.*;
import java.awt.FlowLayout;

public class FlowLayoutExample extends JFrame {

    private FlowLayoutExample(){
        super();
        this.setTitle("FlowLayout Example");

        JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        mainPanel.add(new JLabel("Bald kommt der Hund."));
        mainPanel.add(new JTextField(40));
        mainPanel.add(new JButton("Wuff"));

        this.add(mainPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }


}
