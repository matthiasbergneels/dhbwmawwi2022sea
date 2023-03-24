package lecture.chapter10;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxItemListener implements ItemListener {

    private JFormattedTextField portField;

    ComboBoxItemListener(JFormattedTextField portField){
        this.portField = portField;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED) {
            System.out.println("StateChange: " + e.getStateChange());
            System.out.println("Item: " + e.getItem());
            System.out.println("ParamString: " + e.paramString());

            JComboBox<String> myComboBox = (JComboBox<String>) e.getSource();

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
}
