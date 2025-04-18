import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="NumberButtonsApplet" width=300 height=150>
</applet>
*/

public class NumberButtonsApplet extends Applet implements ActionListener {
    public void init() {
        setLayout(new GridLayout(2, 5, 5, 5)); // 2 rows, 5 columns
        for (int i = 0; i <= 9; i++) {
            Button btn = new Button(String.valueOf(i));
            btn.addActionListener(this);
            add(btn);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        String num = ((Button)e.getSource()).getLabel();
        showStatus("Button " + num + " clicked");
    }
}