package Lab_26;

interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void sound();
}

class Tiger extends Animal {
    void sound() {
        System.out.println("Tiger Roars");
    }
}

class Deer extends Animal {
    void sound() {
        System.out.println("Deer Bleats");
    }
}

class Camel extends Animal implements Transport {
    void sound() {
        System.out.println("Camel Grunts");
    }

    public void deliver() {
        System.out.println("Camel delivers goods");
    }
}

class Donkey extends Animal implements Transport {
    void sound() {
        System.out.println("Donkey Brays");
    }

    public void deliver() {
        System.out.println("Donkey delivers goods");
    }
}

public class P2 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        for (Animal a : animals) {
            a.sound();

            if (a instanceof Transport) {
                Transport t = (Transport) a;
                t.deliver();
            }
        }
    }
}
