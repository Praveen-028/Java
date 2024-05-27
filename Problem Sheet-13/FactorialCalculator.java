import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class FactorialCalculator extends JFrame {

    private JTextField inputField;
    private JTextField resultField;
    private JButton computeButton;

    public FactorialCalculator() {

        super("Factorial Calculator");


        setLayout(new BorderLayout());


        inputField = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);
        computeButton = new JButton("Compute");


        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                computeFactorial();
            }
        });


        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter an integer: "));
        inputPanel.add(inputField);


        JPanel resultPanel = new JPanel();
        resultPanel.add(new JLabel("Factorial: "));
        resultPanel.add(resultField);


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(computeButton);


        add(inputPanel, BorderLayout.NORTH);
        add(resultPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);


        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    private void computeFactorial() {
        try {
            int number = Integer.parseInt(inputField.getText());
            if (number < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            resultField.setText(factorial.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "An error occurred while computing factorial.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FactorialCalculator();
            }
        });
    }
}
