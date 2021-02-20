import java.util.Scanner;

public class ccc10j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();

		if (number == 1 || number == 9 || number == 10) {
			System.out.println("1");
		}

		else if (number == 2 || number == 3 || number == 7 || number == 8) {
			System.out.println("2");
		}

		else {
			System.out.println("3");
		}
		in.close();

	}
}