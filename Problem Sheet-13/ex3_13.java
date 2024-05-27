import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex3_13 extends JFrame {

    private JTextField celsiusField;
    private JTextField fahrenheitField;
    private JButton celsiusToFahrenheitButton;
    private JButton fahrenheitToCelsiusButton;

    public ex3_13() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        layoutComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {

        celsiusField = new JTextField(10);
        fahrenheitField = new JTextField(10);
        celsiusToFahrenheitButton = new JButton("Convert to Fahrenheit");
        fahrenheitToCelsiusButton = new JButton("Convert to Celsius");


        celsiusToFahrenheitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCelsiusToFahrenheit();
            }
        });

        fahrenheitToCelsiusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertFahrenheitToCelsius();
            }
        });
    }

    private void layoutComponents() {

        setLayout(new GridLayout(3, 2));

       
        add(new JLabel("Celsius:"));
        add(celsiusField);
        add(new JLabel("Fahrenheit:"));
        add(fahrenheitField);
        add(celsiusToFahrenheitButton);
        add(fahrenheitToCelsiusButton);
    }

    private void convertCelsiusToFahrenheit() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            fahrenheitField.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input for Celsius", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void convertFahrenheitToCelsius() {
        try {
            double fahrenheit = Double.parseDouble(fahrenheitField.getText());
            double celsius = (fahrenheit - 32) * 5 / 9;
            celsiusField.setText(String.format("%.2f", celsius));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input for Fahrenheit", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ex3_13::new);
    }
}