import java.util.Scanner;

class InvalidAgeExcetion extends Exception {
	public InvalidAgeExcetion(String msg) {
		super(msg);
	}
}

public class CustomExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int age = sc.nextInt();

			if (age < 18) {
				throw new InvalidAgeExcetion("age is invalid");
			}

			System.out.print("Yes! age is valid");
		}
		catch (InvalidAgeExcetion e) {
			System.out.print(e  );
		}
	}
}