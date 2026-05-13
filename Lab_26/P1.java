package Lab_26;

interface Father {
    void showFather();
}

interface Mother {
    void showMother();
}

class Child implements Father, Mother {
    public void showFather() {
        System.out.println("This is Father interface method");
    }

    public void showMother() {
        System.out.println("This is Mother interface method");
    }
}

public class P1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.showFather();
        c.showMother();
    }
}
