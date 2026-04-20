package swings;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryList {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Country List with Capitals");

        // Countries
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Map for country -> capital
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Not Applicable");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // JList
        JList<String> list = new JList<>(countries);

        // Event handling
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();

                    if (selected != null) {
                        System.out.println("Capital of " + selected + ": " + capitals.get(selected));
                    }
                }
            }
        });

        // ScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        frame.add(scrollPane, BorderLayout.CENTER);

        // Frame settings
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}