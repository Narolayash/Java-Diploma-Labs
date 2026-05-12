package Lab_15;

import java.util.Scanner;

// 2) Create a class named Candidate with Candidate_ID, Candidate_Name, Candidate_Age,
//Candidate_Weight and Candidate_Height data members. Also create a method
//GetCandidateDetails() and DisplayCandidateDetails(). Create main method to
//demonstrate the Candidate class. (B)
class Candidate {
    int Candidate_ID;
    String Candidate_Name;
    int Candidate_Age;
    double Candidate_Weight;
    double Candidate_Height;

    void GetCandidateDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        Candidate_ID = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter Name: ");
        Candidate_Name = sc.nextLine();

        System.out.print("Enter Age: ");
        Candidate_Age = sc.nextInt();

        System.out.print("Enter Weight: ");
        Candidate_Weight = sc.nextDouble();

        System.out.print("Enter Height: ");
        Candidate_Height = sc.nextDouble();
    }

    void DisplayCandidateDetails() {
        System.out.println("\n--- Candidate Details ---");
        System.out.println("ID: " + Candidate_ID);
        System.out.println("Name: " + Candidate_Name);
        System.out.println("Age: " + Candidate_Age);
        System.out.println("Weight: " + Candidate_Weight);
        System.out.println("Height: " + Candidate_Height);
    }
}

public class P2 {
    public static void main(String[] args) {
        Candidate c = new Candidate();
        c.GetCandidateDetails();
        c.DisplayCandidateDetails();
    }
}
