import java.util.Scanner;
public class ccc14j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		in.nextInt();
		in.nextLine();
		String votes = in.nextLine();

		int aCounter = 0;
		int bCounter = 0;

		for (int i = 0; i < votes.length(); i++) {
			char ch = votes.charAt(i);
			if (ch == 'A') {
				aCounter++;
			}

			else {
				bCounter++;
			}
		}

		if (aCounter > bCounter) {
			System.out.println("A");
		}

		else if (bCounter > aCounter) {
			System.out.println("B");
		}

		else {
			System.out.println("Tie");
		}
		in.close();

	}
}