import java.util.Scanner;

public class ccc08j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double weight = in.nextDouble();
		double height = in.nextDouble();

		double result = weight / (height * height);

		if (result < 18.5) {
			System.out.println("Underweight");
		}
		else if (result > 25) {
			System.out.println("Overweight");
		}
		else if (18.5 <= result && result <= 25) {
			System.out.println("Normal weight");
		}
		in.close();

	}
}