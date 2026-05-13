package Lab_28;


class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
class Account {
    double balance = 5000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount > balance)
            throw new InsufficientBalanceException("Withdrawal exceeds balance!");
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + balance);
    }
}
public class P5 {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(2000);

        try {
            a.withdraw(8000);   // Exception
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
