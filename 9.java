import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Multiply Two Numbers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        // Create components
        JLabel label1 = new JLabel("Enter first number:");
        JTextField textField1 = new JTextField();

        JLabel label2 = new JLabel("Enter second number:");
        JTextField textField2 = new JTextField();

        JButton multiplyButton = new JButton("Multiply");
        JLabel resultLabel = new JLabel("Result: ");

        // Add action listener to button
        multiplyButton.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int product = num1 * num2;
                resultLabel.setText("Result: " + product);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid integers.");
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(multiplyButton);
        frame.add(resultLabel);

        // Padding cells
        frame.add(new JLabel(""));
        frame.add(new JLabel(""));

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
