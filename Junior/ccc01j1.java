import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc01j1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		int numStars;
		int numSpaces;
		for (int i = 0; i < n / 2; i++) {
			numStars = (i * 2) + 1;
			numSpaces = (n * 2) - (numStars * 2);

			for (int j = 0; j < numStars; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < numSpaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < numStars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = n / 2; i >= 0; i--) {
			numStars = (i * 2) + 1;
			numSpaces = (n * 2) - (numStars * 2);

			for (int j = 0; j < numStars; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < numSpaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < numStars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
