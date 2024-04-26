interface Shape3D {
    double getVolume();
}

class Cuboid implements Shape3D {
    private double length, height, breadth;

    public Cuboid(double length, double height, double breadth) {
        this.length = length;
        this.height = height;
        this.breadth = breadth;
    }

    @Override
    public double getVolume() {
        return length * height * breadth;
    }
}

interface Solid3D extends Shape3D {
    double getDensity();
    double getMass();
}

class SolidCuboid extends Cuboid implements Solid3D {
    private double density;

    public SolidCuboid(double length, double height, double breadth) {
        this(length, height, breadth, 1.0);
    }

    public SolidCuboid(double length, double height, double breadth, double density) {
        super(length, height, breadth);
        this.density = density;
    }

    @Override
    public double getDensity() {
        return density;
    }

    @Override
    public double getMass() {
        return getVolume() * density;
    }
}

public class ex_2_8 {
    public static void main(String[] args) {
        SolidCuboid solidCuboid1 = new SolidCuboid(2, 3, 4);
        System.out.println("Volume: " + solidCuboid1.getVolume());
        System.out.println("Density: " + solidCuboid1.getDensity());
        System.out.println("Mass: " + solidCuboid1.getMass());

        SolidCuboid solidCuboid2 = new SolidCuboid(2, 3, 4, 2.5);
        System.out.println("Volume: " + solidCuboid2.getVolume());
        System.out.println("Density: " + solidCuboid2.getDensity());
        System.out.println("Mass: " + solidCuboid2.getMass());
    }
}
