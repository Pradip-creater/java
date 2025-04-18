import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StateSelectorFrame {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("State Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Label
        JLabel label = new JLabel("Select a State:");

        // ComboBox with Indian states
        String[] states = {
            "Maharashtra", "Gujarat", "Punjab", "Tamil Nadu",
            "Karnataka", "Rajasthan", "West Bengal", "Bihar",
            "Kerala", "Uttar Pradesh"
        };

        JComboBox<String> stateComboBox = new JComboBox<>(states);

        // Label to show selected state
        JLabel selectedLabel = new JLabel("Selected: ");

        // Add action listener to JComboBox
        stateComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedState = (String) stateComboBox.getSelectedItem();
                selectedLabel.setText("Selected: " + selectedState);
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(stateComboBox);
        frame.add(selectedLabel);

        // Center and display
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
