import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("KeyEvent Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a label to show the message
        JLabel messageLabel = new JLabel("Press any key...");
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add key listener to the frame's content pane
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                messageLabel.setText("Key Pressed");
            }
        });

        // Add the label to the frame
        frame.add(messageLabel);

        // Ensure the frame is focusable to receive key events
        frame.setFocusable(true);
        frame.requestFocusInWindow();

        // Show the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
