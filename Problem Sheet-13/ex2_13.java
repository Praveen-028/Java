import javax.swing.*;
import java.awt.*;

public class ex2_13 extends JFrame {

    private JList<Integer> numberList1;
    private JList<Integer> numberList2;
    private JList<String> operationList;
    private JButton calculateButton;
    private JTextField resultTextField;

    public ex2_13() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        layoutComponents();
        pack();
        setLocationRelativeTo(null); 
        setVisible(true);
    }

    private void initComponents() {
        
        numberList1 = new JList<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        numberList2 = new JList<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        operationList = new JList<>(new String[]{"+", "-", "*"});
        calculateButton = new JButton("Calculate");
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);
    }

    private void layoutComponents() {
        
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(1, 3));
        topPanel.add(new JScrollPane(numberList1));
        topPanel.add(new JScrollPane(numberList2));
        topPanel.add(new JScrollPane(operationList));
        add(topPanel, BorderLayout.CENTER);

       
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(calculateButton, BorderLayout.WEST);
        bottomPanel.add(resultTextField, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ex2_13::new);
    }
}