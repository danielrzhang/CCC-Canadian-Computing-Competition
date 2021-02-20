import java.util.Scanner;

public class ccc18j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dig1 = in.nextInt();
		int dig2 = in.nextInt();
		int dig3 = in.nextInt();
		int dig4 = in.nextInt();

		if ((dig1 == 8 || dig1 == 9) && (dig4 == 8 || dig4 == 9) && dig2 == dig3) {
			System.out.println("ignore");
		}

		else {
			System.out.println("answer");
		}
		in.close();

	}
}