public class ThrowsDemo {
	static void divide(int a, int b) throws ArithmeticException {
		int result = a / b;
		System.out.print(result);
	}

	public static void main(String[] args) {
		try {
			divide(12, 0);
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}