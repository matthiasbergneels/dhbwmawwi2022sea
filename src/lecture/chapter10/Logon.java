package lecture.chapter10;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;


import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame {

    private static final String ACTION_PRINT = "ACTION_PRINT";
    private static final String ACTION_CLOSE = "ACTION_CLOSE";

    public Logon() throws ParseException {
        this.setTitle("Logon");

        final String[] PROTOCOL_VALUE_HELP = {"FTP", "Telnet", "SMTP", "HTTP"};
        JComboBox<String> myComboBox = new JComboBox<>(PROTOCOL_VALUE_HELP);

        JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));
        portField.setColumns(3);

        //myComboBox.addItemListener(new ComboBoxItemListener(portField));

        myComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("StateChange: " + e.getStateChange());
                    System.out.println("Item: " + e.getItem());
                    System.out.println("ParamString: " + e.paramString());

                    //JComboBox<String> myComboBox = (JComboBox<String>) e.getSource();

                    System.out.println("Selected Item: " + myComboBox.getSelectedItem());

                    if(e.getItem().equals("HTTP")){
                        portField.setText("80");
                    }else if(e.getItem().equals("FTP")){
                        portField.setText("21");
                    }else{
                        portField.setText("");
                    }
                }
            }
        });



        // initialize Panels
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
        JPanel filePanel = new JPanel(new GridLayout(0, 2));

        FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

        //create & assign elements for connection area
        JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("User:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(3));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Passwort:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JPasswordField(5));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Art:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(myComboBox);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Host:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        JTextField host = new JTextField(5);
        flowLayoutForCell.add(host);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Port:"));
        connectionPanel.add(flowLayoutForCell);

        connectionPanel.add(portField);

        // create & add Fields for File Area
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Quelle:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Ziel:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);

        // create & assign Buttons
        JButton okButton = new JButton("Ok");
        okButton.setActionCommand(ACTION_PRINT);
        JButton cancelButton = new JButton("Schliessen");
        cancelButton.setActionCommand(ACTION_CLOSE);
        JButton printButton = new JButton("Ausgabe");
        printButton.setActionCommand(ACTION_PRINT);

        ActionListener buttonListener = e -> {

            String actionCommand = e.getActionCommand();
            System.out.println(actionCommand);

            if(actionCommand.equals("Ok") || actionCommand.equals("Ausgabe")){
                System.out.println("Button gedrückt. Aktueller Port: " + portField.getText());
            }else if(actionCommand.equals("Schliessen")){
                System.exit(0);
            }

            /*
            if(e.getSource() == okButton || e.getSource() == printButton){
                System.out.println("Button gedrückt. Aktueller Port: " + portField.getText());
            } else if(e.getSource() == cancelButton){
                System.exit(0);
            }

             */
        };

        okButton.addActionListener(buttonListener);
        cancelButton.addActionListener(buttonListener);
        printButton.addActionListener(buttonListener);

        okButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Button gedrückt! Aktueller Port: " + portField.getText());
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
        });

        southPanel.add(okButton);
        southPanel.add(cancelButton);
        southPanel.add(printButton);

        // create & assign Borders
        Border etchedBorder = BorderFactory.createEtchedBorder();
        Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
        Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
        Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        connectionPanel.setBorder(connectionBorder);
        filePanel.setBorder(fileBorder);
        centerPanel.setBorder(centerBorder);

        // combine Panels
        centerPanel.add(connectionPanel);
        centerPanel.add(filePanel);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        this.add(mainPanel);

        // set JFrame behavior
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) throws ParseException {
        new Logon();
    }
}