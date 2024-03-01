import java.util.*;

public class Rectangle {
    double length, width;
    String color;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return width * length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle obj1 = new Rectangle();

        System.out.println("Enter length, width, and color for rectangle 1:");

        double length1 = sc.nextDouble();
        double width1 = sc.nextDouble();
        sc.nextLine(); // Consume newline character left from nextDouble()
        String color1 = sc.nextLine();
        obj1.setLength(length1);
        obj1.setWidth(width1);
        obj1.setColor(color1);
        double area1 = obj1.findArea();

        Rectangle obj2 = new Rectangle();
        System.out.println("Enter length, width, and color for rectangle 2:");
        double length2 = sc.nextDouble();
        double width2 = sc.nextDouble();
        sc.nextLine(); // Consume newline character left from nextDouble()
        String color2 = sc.nextLine();
        obj2.setLength(length2);
        obj2.setWidth(width2);
        obj2.setColor(color2);
        double area2 = obj2.findArea();

        if (color1.equals(color2) && area1 == area2) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non Matching rectangles");
        }
        sc.close();
    }
}
