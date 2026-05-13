package Lab_22;

// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// ---------- Single Inheritance ----------
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// ---------- Multilevel Inheritance ----------
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// ---------- Hierarchical Inheritance ----------
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class P1 {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
