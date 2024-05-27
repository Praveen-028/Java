import javax.swing.*;
import java.awt.*;

public class ex1_13 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setLayout(new FlowLayout());


        JLabel label1 = new JLabel("Enter first number:");
        JTextField textField1 = new JTextField(11);

        JLabel label2 = new JLabel("Enter second number:");
        JTextField textField2 = new JTextField(11);


        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");



        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(button1);
        frame.add(button2);


        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}