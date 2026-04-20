package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButton {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Country Button Example");

        // Create label
        JLabel label = new JLabel("Press a button");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create buttons
        JButton indiaButton = new JButton("India");
        JButton srilankaButton = new JButton("Srilanka");

        // Event handling using addActionListener
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.add(indiaButton);
        panel.add(srilankaButton);

        // Add components to frame
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        // Frame settings
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}