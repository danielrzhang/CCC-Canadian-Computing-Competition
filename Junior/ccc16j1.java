import java.util.Scanner;

public class ccc16j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int counterW = 0;
		String result;
		for (int i = 0; i < 6; i++) {
			String letter = in.nextLine();
			if (letter.equals("W")) {
				counterW++;
			}
		}
		if (counterW == 5 || counterW == 6) {
			result = "1";
		}

		else if (counterW == 3 || counterW == 4) {
			result = "2";
		}

		else if (counterW == 1 || counterW == 2) {
			result = "3";
		}

		else {
			result = "-1";
		}
		System.out.println(result);
		in.close();

	}
}