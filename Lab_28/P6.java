package Lab_28;

class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) { super(msg); }
}

class DivisibleByTenException extends Exception {
    DivisibleByTenException(String msg) { super(msg); }
}

class RangeException extends Exception {
    RangeException(String msg) { super(msg); }
}

public class P6 {
    public static void main(String[] args) {

        int sum = 0;

        for(String s : args) {
            try {
                int num = Integer.parseInt(s);

                if(num < 0)
                    throw new NegativeNumberException("Negative number: " + num);

                if(num % 10 == 0)
                    throw new DivisibleByTenException("Divisible by 10: " + num);

                if(num > 1000 && num < 2000)
                    throw new RangeException("Between 1000 and 2000: " + num);

                if(num > 7000) {
                    System.out.println("Skipping number >7000: " + num);
                    continue;
                }

                sum += num;

            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Total Sum = " + sum);
    }
}
