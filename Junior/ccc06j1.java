import java.util.Scanner;

public class ccc06j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();
		int third = in.nextInt();
		int fourth = in.nextInt();

		int calories = 0;

		if (first == 1) {
			calories += 461;
		}

		else if (first == 2) {
			calories += 431;
		}

		else if (first == 3) {
			calories += 420;
		}

		else if (first == 4) {
			calories += 0;
		}

		if (second == 1) {
			calories += 100;
		}

		else if (second == 2) {
			calories += 57;
		}

		else if (second == 3) {
			calories += 70;
		}

		else if (second == 4) {
			calories += 0;
		}

		if (third == 1) {
			calories += 130;
		}

		else if (third == 2) {
			calories += 160;
		}

		else if (third == 3) {
			calories += 118;
		}

		else if (third == 4) {
			calories += 0;
		}

		if (fourth == 1) {
			calories += 167;
		}

		else if (fourth == 2) {
			calories += 266;
		}

		else if (fourth == 3) {
			calories += 75;
		}

		else if (fourth == 4) {
			calories += 0;
		}
		String finalCalories = Integer.toString(calories);
		System.out.println("Your total Calorie count is " + finalCalories + ".");
		in.close();

	}
}