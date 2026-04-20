package swing;

import javax.swing.*;
import java.awt.*;

public class TabbedPaneColors {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Tabbed Pane Colors");

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add to frame
        frame.add(tabbedPane);

        // Frame settings
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}