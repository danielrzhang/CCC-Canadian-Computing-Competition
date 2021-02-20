import java.util.Scanner;
public class ccc15j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String message = in.nextLine();
		int happyCounter = 0;
		int sadCounter = 0;

		for (int i = 3; i < message.length(); i++) {
			String str = message.substring(i - 3, i);
			if (str.equals(":-)")) {
				happyCounter++;
			}

			else if (str.equals(":-(")) {
				sadCounter++;
			}
		}

		if (happyCounter > sadCounter) {
			System.out.println("happy");
		}

		else if (sadCounter > happyCounter) {
			System.out.println("sad");
		}

		else if (sadCounter == happyCounter && happyCounter != 0 && sadCounter != 0) {
			System.out.println("unsure");
		}

		else {
			System.out.println("none");
		}
		in.close();

	}
}