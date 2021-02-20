import java.util.Scanner;
public class ccc96s1 {
	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int times = in.nextInt();

		for (int i = 0; i < times; i++) {
			int counter = 0;
			String result;
			int number = in.nextInt();

			for (int j = 1; j < number; j++) {
				if (number % j == 0) {
					counter += j;
				}
			}
			if (counter < number) {
				result = " is a deficient number.";
			}

			else if (counter > number) {
				result = " is an abundant number.";
			}

			else {
				result = " is a perfect number.";
			}

			System.out.println(number + result);
		}
		in.close();

	}
}

