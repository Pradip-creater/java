import java.awt.*;
import java.awt.event.*;

public class ColorMenuExample extends Frame {
    public ColorMenuExample() {
        setTitle("Color Menu Example");
        setSize(400, 300);
        
        // Create menu bar
        MenuBar menuBar = new MenuBar();
        
        // Create "Colors" menu
        Menu colorMenu = new Menu("Colors");
        
        // Create menu items for different colors
        MenuItem redItem = new MenuItem("Red");
        MenuItem greenItem = new MenuItem("Green");
        MenuItem blueItem = new MenuItem("Blue");
        MenuItem blackItem = new MenuItem("Black");
        
        // Disable the black color menu item
        blackItem.setEnabled(false);
        
        // Add action listeners to change background color
        redItem.addActionListener(e -> setBackground(Color.RED));
        greenItem.addActionListener(e -> setBackground(Color.GREEN));
        blueItem.addActionListener(e -> setBackground(Color.BLUE));
        blackItem.addActionListener(e -> setBackground(Color.BLACK));
        
        // Add menu items to color menu
        colorMenu.add(redItem);
        colorMenu.add(greenItem);
        colorMenu.add(blueItem);
        colorMenu.add(blackItem);
        
        // Add color menu to menu bar
        menuBar.add(colorMenu);
        
        // Set menu bar to frame
        setMenuBar(menuBar);
        
        // Close window event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        ColorMenuExample frame = new ColorMenuExample();
        frame.setVisible(true);
    }
}