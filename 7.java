import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class TreeExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");

        // Create state nodes
        DefaultMutableTreeNode maharashtra = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode gujarat = new DefaultMutableTreeNode("Gujarat");

        // Add cities to Maharashtra
        maharashtra.add(new DefaultMutableTreeNode("Mumbai"));
        maharashtra.add(new DefaultMutableTreeNode("Pune"));

        // Add cities to Gujarat
        gujarat.add(new DefaultMutableTreeNode("Ahmedabad"));
        gujarat.add(new DefaultMutableTreeNode("Surat"));

        // Add states to root
        root.add(maharashtra);
        root.add(gujarat);

        // Create the tree using the root node
        JTree tree = new JTree(root);

        // Put the tree inside a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);

        // Add scroll pane to frame
        frame.add(scrollPane);

        // Center and show the frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
