package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Image Button Example");

        JLabel label = new JLabel("Press a button");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 18));

        // Load images
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        JButton clockButton = new JButton("Digital Clock", clockIcon);
        JButton hourglassButton = new JButton("Hour Glass", hourglassIcon);

        // Event handling
        clockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        hourglassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.add(clockButton);
        panel.add(hourglassButton);

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        // Frame settings
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}