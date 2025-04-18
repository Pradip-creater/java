import java.awt.*;
import javax.swing.*;

/*
<applet code="ScrollPaneApplet.class" width=400 height=300>
</applet>
*/

public class ScrollPaneApplet extends JApplet {
    public void init() {
        setLayout(new BorderLayout());

        // Create a panel with a GridLayout
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(10, 2, 5, 5)); // 10 rows, 2 columns

        // Add buttons to panel
        for (int i = 0; i < 20; i++) {
            jp.add(new JButton("Button: " + i));
        }

        // Create JScrollPane
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jp, v, h);

        // Add JScrollPane to Applet
        add(jsp, BorderLayout.CENTER);
    }
}
