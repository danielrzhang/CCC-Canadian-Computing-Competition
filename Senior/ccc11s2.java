import java.util.Scanner;
public class ccc11s2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		char [] studentAnswers = new char [n];
		char [] correctAnswers = new char[n];
		int counter = 0;

		for (int i = 0; i < n; i++) {
			char ch = in.next().charAt(0);
			studentAnswers[i] = ch;
		}

		for (int j = 0; j < n; j++) {
			char ch = in.next().charAt(0);
			correctAnswers[j] = ch;
		}

		for (int k = 0; k < n; k++) {
			if (correctAnswers[k] == studentAnswers[k]) {
				counter++;
			}
		}

		System.out.println(counter);
		in.close();

	}
}


