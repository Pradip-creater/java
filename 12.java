import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class HostToIP {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Hostname to IP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLayout(new FlowLayout());

        // Create UI components
        JLabel label = new JLabel("Enter Hostname:");
        JTextField hostField = new JTextField(20);
        JButton getIPButton = new JButton("Get IP Address");
        JLabel resultLabel = new JLabel("IP Address will be shown here");

        // Add button action
        getIPButton.addActionListener(e -> {
            String hostname = hostField.getText().trim();
            try {
                InetAddress address = InetAddress.getByName(hostname);
                resultLabel.setText("IP Address: " + address.getHostAddress());
            } catch (UnknownHostException ex) {
                resultLabel.setText("Invalid Hostname or Network Error");
            }
        });

        // Add components to frame
        frame.add(label);
        frame.add(hostField);
        frame.add(getIPButton);
        frame.add(resultLabel);

        // Show frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
