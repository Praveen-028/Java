import javax.swing.*;
import java.awt.*;

public class ex4_13 extends JFrame {
    public ex4_13() {
        setTitle("Colorful Layouts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.YELLOW);
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton smallButton = new JButton("one");
        smallButton.setPreferredSize(new Dimension(80, 30));
        topPanel.add(smallButton);

        JPanel middlePanel = new JPanel();
        middlePanel.setBackground(Color.CYAN);
        middlePanel.setLayout(new FlowLayout());
        middlePanel.setPreferredSize(new Dimension(300, 100));
        middlePanel.add(new JButton("two"));
        middlePanel.add(new JButton("three"));
        middlePanel.add(new JButton("four"));

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.PINK);
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        JButton smallButton2 = new JButton("five");
        smallButton2.setPreferredSize(new Dimension(80, 30));
        bottomPanel.add(smallButton2);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(middlePanel, BorderLayout.CENTER);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
    }

    public static void ex4_13(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ex4_13 colorfulLayouts = new ex4_13();
            colorfulLayouts.setVisible(true);
        });
    }
}