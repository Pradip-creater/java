import javax.swing.*;
import java.awt.*;

public class ThreeButtonsPanelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Three Buttons with Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel with GridLayout
        JPanel panel = new JPanel(new GridLayout(1, 3, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create buttons
        JButton okButton = new JButton("OK");
        JButton resetButton = new JButton("RESET");
        JButton cancelButton = new JButton("CANCEL");

        // Customize buttons
        okButton.setBackground(Color.GREEN);
        resetButton.setBackground(Color.YELLOW);
        cancelButton.setBackground(Color.RED);

        // Set preferred size for buttons
        Dimension buttonSize = new Dimension(100, 50);
        okButton.setPreferredSize(buttonSize);
        resetButton.setPreferredSize(buttonSize);
        cancelButton.setPreferredSize(buttonSize);

        // Add action listeners with dialog only
        okButton.addActionListener(e -> 
            JOptionPane.showMessageDialog(frame, "OK button clicked", "Message", JOptionPane.INFORMATION_MESSAGE)
        );

        resetButton.addActionListener(e -> 
            JOptionPane.showMessageDialog(frame, "RESET button clicked", "Message", JOptionPane.WARNING_MESSAGE)
        );

        cancelButton.addActionListener(e -> 
            JOptionPane.showMessageDialog(frame, "CANCEL button clicked", "Message", JOptionPane.ERROR_MESSAGE)
        );

        // Add buttons to panel
        panel.add(okButton);
        panel.add(resetButton);
        panel.add(cancelButton);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Center and show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
