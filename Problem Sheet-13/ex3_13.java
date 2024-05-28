import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex3_13 {

    public static void main(String[] args) {
        
            JFrame frame = new JFrame();
            frame.setTitle("Temperature Converter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(3, 2));
            frame.setSize(300, 150);

            JTextField celsiusField = new JTextField(10);
            JTextField fahrenheitField = new JTextField(10);
            JButton celsiusToFahrenheitButton = new JButton("Convert to Fahrenheit");
            JButton fahrenheitToCelsiusButton = new JButton("Convert to Celsius");

            celsiusToFahrenheitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        double celsius = Double.parseDouble(celsiusField.getText());
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        fahrenheitField.setText(String.format("%.2f", fahrenheit));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input for Celsius", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            fahrenheitToCelsiusButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                        double celsius = (fahrenheit - 32) * 5 / 9;
                        celsiusField.setText(String.format("%.2f", celsius));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid input for Fahrenheit", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            frame.add(new JLabel("Celsius:"));
            frame.add(celsiusField);
            frame.add(new JLabel("Fahrenheit:"));
            frame.add(fahrenheitField);
            frame.add(celsiusToFahrenheitButton);
            frame.add(fahrenheitToCelsiusButton);

            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
    }
}
