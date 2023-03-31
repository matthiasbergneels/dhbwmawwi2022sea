package lecture.chapter10.structured;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.ParseException;
import java.util.List;
import java.util.ArrayList;

public class LogonUi extends JFrame {

    private final JComboBox<String> myComboBox;
    private final JFormattedTextField portField;

    public LogonUi() throws ParseException {
        super();
        this.setTitle("Logon");


        final String[] PROTOCOL_VALUE_HELP = {"FTP", "Telnet", "SMTP", "HTTP"};
        myComboBox = new JComboBox<>(PROTOCOL_VALUE_HELP);

        portField = new JFormattedTextField(new MaskFormatter("#####"));
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
        fillGridPanel(connectionPanel, prepareConnectionPanelComponents());

        // create & add Fields for File Area
        fillGridPanel(filePanel, prepareFilePanelComponents());


        // create & assign Buttons
        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Schliessen");

        southPanel.add(okButton);
        southPanel.add(cancelButton);

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


        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        System.out.println(UIManager.getLookAndFeel());
        JFrame.setDefaultLookAndFeelDecorated(true);
        new LogonUi();
    }

    private List<JComponent> prepareConnectionPanelComponents(){
        List<JComponent> components = new ArrayList<>();

        JLabel label = new JLabel("User:");
        label.setName(LogonController.LabelConstants.LABEL_USER);
        components.add(label);
        components.add(new JTextField(3));
        components.add(new JLabel("Passwort:"));
        components.add(new JPasswordField(5));
        components.add(new JLabel("Art:"));
        components.add(myComboBox);
        components.add(new JLabel("Host:"));
        components.add(new JTextField(5));
        components.add(new JLabel("Port:"));
        components.add(portField);

        return components;
    }

    private List<JComponent> prepareFilePanelComponents(){
        List<JComponent> components = new ArrayList<>();

        components.add(new JLabel("Quelle:"));
        components.add(new JTextField(10));
        components.add(new JLabel("Ziel:"));
        components.add(new JTextField(10));

        return components;
    }

    private void fillGridPanel(JPanel gridPanel, List<JComponent> components){
        FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);
        for(JComponent currentComponent : components){
            JPanel cellPanel = new JPanel(cellFlowLayout);
            cellPanel.add(currentComponent);
            gridPanel.add(cellPanel);
        }
    }
}