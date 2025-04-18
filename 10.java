import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickCounter {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Click Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Create a label to display click count
        JLabel clickLabel = new JLabel("Click count: 0", SwingConstants.CENTER);
        clickLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Add mouse listener to count clicks
        frame.addMouseListener(new MouseAdapter() {
            int clickCount = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                clickCount++;
                clickLabel.setText("Click count: " + clickCount);
            }
        });

        // Add label to frame
        frame.add(clickLabel);

        // Display frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
