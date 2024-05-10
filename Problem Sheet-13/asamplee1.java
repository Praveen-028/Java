import java.awt.*;
import java.awt.event.*;

public class NumberInputGUI extends Frame {
    
    Label label1, label2;
    TextField textField1, textField2;
    Button button1, button2;

    // Constructor to setup GUI components
    public NumberInputGUI() {
        // Setting GridLayout, 3 rows, 2 columns
        setLayout(new GridLayout(3, 2, 5, 5)); // 3 rows, 2 columns, 5px vertical and horizontal gaps

        // Create and add label and text field for the first number
        label1 = new Label("Enter first number: ");
        add(label1); // Add label to the frame
        textField1 = new TextField(10); // Create text field with column size 10
        add(textField1); // Add text field to the frame

        // Create and add label and text field for the second number
        label2 = new Label("Enter second number: ");
        add(label2); // Add label to the frame
        textField2 = new TextField(10); // Create text field with column size 10
        add(textField2); // Add text field to the frame

        // Create and add buttons
        button1 = new Button("Button 1");
        add(button1); // Add the first button to the frame
        button2 = new Button("Button 2");
        add(button2); // Add the second button to the frame

        setTitle("Number Input GUI"); // Set the title of the window
        setSize(300, 150); // Set initial size of the window
        setVisible(true); // Show the window

        // Add window listener to close the application
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Exit the application
            }
        });
    }

    public static void main(String[] args) {
        new NumberInputGUI(); // Create the GUI
    }
}
