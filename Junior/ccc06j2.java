import java.util.Scanner;
public class ccc06j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstDie = in.nextInt();
		int secondDie = in.nextInt();
		int counter = 0;

		for (int i = 1; i <= firstDie; i++) {
			for (int j = 1; j <= secondDie; j++) {
				if (i + j == 10) {
					counter++;
				}
			}
		}

		if (counter == 1) {
			System.out.println("There is 1 way to get the sum 10.");
		}

		else {
			System.out.println("There are " + counter + " ways to get the sum 10.");
		}
		in.close();

	}
}