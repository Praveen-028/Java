class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public void eat() {
        // Default implementation (could be empty)
    }

    public void walk() {
        System.out.println("This animal walks with " + legs + " legs.");
    }
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider eats an insect.");
    }
}

class Pet extends Animal {
    protected String name;

    public Pet(String name, int legs) {
        super(legs);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        // Default implementation (could be empty)
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name, 4);
    }

    public Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("The cat eats a mouse.");
    }

    @Override
    public void play() {
        System.out.println("The cat plays with a ball of yarn.");
    }
}

class Fish extends Pet {
    public Fish() {
        super("", 0);
    }

    @Override
    public void eat() {
        System.out.println("The fish eats sea plants.");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and don't have legs.");
    }

    @Override
    public void play() {
        System.out.println("The fish is swimming.");
    }
}

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        // Experiment by calling the methods in each object
        d.eat();
        c.walk();
        a.walk();
        e.eat();
        p.play();

        // Experiment with casting objects
        ((Cat) p).walk();

        // Experiment with polymorphism
        Animal animal = c;
        animal.walk();

        // Experiment with using super to call super class methods
        // This is not applicable in this context as none of the subclasses override the walk method
    }
}