import java.util.Scanner;

public class ccc03s1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		boolean notWon = true;
		int currentSquare = 1;
		while (notWon) {
			int move = in.nextInt();
			if (move <= 0) {
				System.out.println("You Quit!");
				notWon = false;
			}

			else {
				currentSquare += move;
				if (currentSquare == 9) {
					currentSquare = 34;
				}

				if (currentSquare == 40) {
					currentSquare = 64;
				}

				if (currentSquare == 67) {
					currentSquare = 86;
				}

				if (currentSquare == 54) {
					currentSquare = 19;
				}

				if (currentSquare == 90) {
					currentSquare = 48;
				}

				if (currentSquare == 99) {
					currentSquare = 77;
				}

				if (currentSquare > 100) {
					currentSquare -= move;
				}

				System.out.println("You are now on square " + currentSquare);

				if (currentSquare == 100) {
					System.out.println("You Win!");
					notWon = false;
				}

			}
		}
		in.close();

	}
}