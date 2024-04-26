abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    abstract void a_method();

    void non_abstract_method() {
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass {
    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }
}

public class ex_1_8 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.a_method();
        obj.non_abstract_method();
    }
}
