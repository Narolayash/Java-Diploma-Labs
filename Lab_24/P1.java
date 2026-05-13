package Lab_24;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class P1 {
    public static void main(String[] args) {
        Animal obj = new Dog();   // runtime polymorphism
        obj.sound();
    }
}
