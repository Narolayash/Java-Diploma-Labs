package Lab_28;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class P4 {
    static void checkNumber(int num) throws MyException {
        if(num < 0)
            throw new MyException("Number cannot be negative!");
        else
            System.out.println("Valid Number");
    }

    public static void main(String[] args) {
        try {
            checkNumber(-5);
        } catch(MyException e) {
            System.out.println(e);
        }
    }
}
