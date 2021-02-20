import java.util.Scanner;
public class ccc11j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int humidity = in.nextInt();
		int maxTime = in.nextInt();
		boolean result = false;

		for (int i = 0; i < maxTime; i++) {
			int altitude = (int) (-6 * (Math.pow(i, 4)) + humidity * (Math.pow(i, 3)) + 2 * (Math.pow(i, 2)) + i);

			if (altitude <= 0 && i != 0) {
				maxTime = i;
				result = true;
				break;
			}

			else {
				result = false;
			}
		}

		if (result) {
			System.out.println("The balloon first touches ground at hour: \n" + maxTime);
		}

		else {
			System.out.println("The balloon does not touch ground in the given time.");
		}
		in.close();

	}
}



