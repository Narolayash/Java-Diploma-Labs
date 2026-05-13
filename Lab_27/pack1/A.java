package Lab_27.pack1;

public class A {
    private int privateVar = 10;
    public int publicVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;   // default access

    public void display() {
        System.out.println("Inside class A");
        System.out.println("Private: " + privateVar);
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}
