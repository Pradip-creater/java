import javax.swing.*;
import java.awt.*;

public class CustomPasswordField {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Custom PasswordField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Label
        JLabel label = new JLabel("Enter Password:");

        // JPasswordField with '#' as echo character
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setEchoChar('#');  // Set echo char to #

        // Add components to frame
        frame.add(label);
        frame.add(passwordField);

        // Display frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
