package Lab_15;

import java.util.Scanner;

// 3) Create a class named Bank_Account with Account_No, User_Name, Email, Account_Type
//and Account_Balance data members. Also create a method GetAccountDetails() and
//DisplayAccountDetails(). Create main method to demonstrate the Bank_Account
//class. (C)
class Bank_Account {
    long Account_No;
    String User_Name;
    String Account_Type;
    double Account_Balance;

    void GetAccountDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        Account_No = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter User Name: ");
        User_Name = sc.nextLine();

        System.out.print("Enter Account Type: ");
        Account_Type = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        Account_Balance = sc.nextDouble();
    }

    void DisplayAccountDetails() {
        System.out.println("\n--- Bank Account Details ---");
        System.out.println("Account No: " + Account_No);
        System.out.println("User Name: " + User_Name);
        System.out.println("Account Type: " + Account_Type);
        System.out.println("Balance: " + Account_Balance);
    }
}
public class P3 {
    public static void main(String[] args) {
        Bank_Account acc = new Bank_Account();
        acc.GetAccountDetails();
        acc.DisplayAccountDetails();
    }
}
