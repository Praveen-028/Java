class Subclass1 {
    public String print() {
        return "Subclass1";
    }
}

class Subclass2 extends Subclass1 {
    public String print() {
        System.out.println(super.print());
        System.out.print("subclass2");
        return "";
    }
}

public class testing {
    public static void main(String[] args) {
        Subclass2 obj = new Subclass2();
        obj.print();
    }
}
