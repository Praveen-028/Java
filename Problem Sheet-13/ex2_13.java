import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2_13 {
    public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setTitle("Simple Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());

            JList<Integer> numberList1 = new JList<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            JList<Integer> numberList2 = new JList<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            JList<String> operationList = new JList<>(new String[]{"+", "-", "*"});
            JButton calculateButton = new JButton("Calculate");
            JTextField resultTextField = new JTextField(10);
            resultTextField.setEditable(false);

            JPanel topPanel = new JPanel(new GridLayout(1, 3));
            topPanel.add(new JScrollPane(numberList1));
            topPanel.add(new JScrollPane(numberList2));
            topPanel.add(new JScrollPane(operationList));
            frame.add(topPanel, BorderLayout.CENTER);

            JPanel bottomPanel = new JPanel(new BorderLayout());
            bottomPanel.add(calculateButton, BorderLayout.WEST);
            bottomPanel.add(resultTextField, BorderLayout.CENTER);
            frame.add(bottomPanel, BorderLayout.SOUTH);

            calculateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Integer number1 = numberList1.getSelectedValue();
                    Integer number2 = numberList2.getSelectedValue();
                    String operation = operationList.getSelectedValue();

                    if (number1 != null && number2 != null && operation != null) {
                        int result = 0;
                        switch (operation) {
                            case "+":
                                result = number1 + number2;
                                break;
                            case "-":
                                result = number1 - number2;
                                break;
                            case "*":
                                result = number1 * number2;
                                break;
                        }
                        resultTextField.setText(String.valueOf(result));
                    } else {
                        resultTextField.setText("Error");
                    }
                }
            });

            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
    }
}
