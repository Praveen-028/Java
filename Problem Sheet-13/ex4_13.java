import javax.swing.*;
import java.awt.*;

public class ex4_13 {
    public static void main(String[] args) {
            // Create the JFrame
            JFrame frame = new JFrame();
            frame.setTitle("Colorful Layouts");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);

            // Top panel with yellow background
            JPanel topPanel = new JPanel();
            topPanel.setBackground(Color.YELLOW);
            topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            JButton smallButton = new JButton("one");
            smallButton.setPreferredSize(new Dimension(80, 30));
            topPanel.add(smallButton);

            // Middle panel with cyan background
            JPanel middlePanel = new JPanel();
            middlePanel.setBackground(Color.CYAN);
            middlePanel.setLayout(new FlowLayout());
            middlePanel.setPreferredSize(new Dimension(300, 100));
            middlePanel.add(new JButton("two"));
            middlePanel.add(new JButton("three"));
            middlePanel.add(new JButton("four"));

            // Bottom panel with pink background
            JPanel bottomPanel = new JPanel();
            bottomPanel.setBackground(Color.PINK);
            bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            JButton smallButton2 = new JButton("five");
            smallButton2.setPreferredSize(new Dimension(80, 30));
            bottomPanel.add(smallButton2);

            // Set the layout for the content pane
            frame.getContentPane().setLayout(new BorderLayout());
            frame.getContentPane().add(topPanel, BorderLayout.NORTH);
            frame.getContentPane().add(middlePanel, BorderLayout.CENTER);
            frame.getContentPane().add(bottomPanel, BorderLayout.SOUTH);

            // Make the frame visible
            frame.setVisible(true);
    }
}
