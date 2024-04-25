<<<<<<< HEAD
class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Quadrilateral {
    protected Point point1, point2, point3, point4;

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    double getArea() {
        return 0;
    }
}

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a trapezoid
        return 0;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a parallelogram
        return 0;
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a rectangle
        return 0;
    }
}

class Square extends Rectangle {
    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a square
        return 0;
    }
}

public class ex_4_7 {
    public static void main(String[] args) {
        // Instantiate objects of your classes and output each object’s area
        Quadrilateral trapezoid = new Trapezoid(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of trapezoid: " + trapezoid.getArea());

        Quadrilateral parallelogram = new Parallelogram(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of parallelogram: " + parallelogram.getArea());

        Quadrilateral rectangle = new Rectangle(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Quadrilateral square = new Square(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of square: " + square.getArea());
    }
}
=======
class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Quadrilateral {
    protected Point point1, point2, point3, point4;

    public Quadrilateral(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    double getArea() {
        return 0;
    }
}

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a trapezoid
        return 0;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a parallelogram
        return 0;
    }
}

class Rectangle extends Parallelogram {
    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a rectangle
        return 0;
    }
}

class Square extends Rectangle {
    public Square(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    @Override
    double getArea() {
        // Implement the formula to calculate the area of a square
        return 0;
    }
}

public class ex_4_7 {
    public static void main(String[] args) {
        // Instantiate objects of your classes and output each object’s area
        Quadrilateral trapezoid = new Trapezoid(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of trapezoid: " + trapezoid.getArea());

        Quadrilateral parallelogram = new Parallelogram(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of parallelogram: " + parallelogram.getArea());

        Quadrilateral rectangle = new Rectangle(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Quadrilateral square = new Square(new Point(0, 0), new Point(1, 1), new Point(2, 1), new Point(3, 0));
        System.out.println("Area of square: " + square.getArea());
    }
}
>>>>>>> 8b1c6e5b4caa5676edac8d739aa70b95d8d6a25b
