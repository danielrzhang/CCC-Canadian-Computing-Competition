import java.util.Scanner;

public class ccc07j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int result = 0;

		if (a <= b && b <= c) {
			result = b;
		}

		else if (a <= c && c <= b) {
			result = c;
		}

		else if (b <= a && a <= c) {
			result = a;
		}

		else if (b <= c && c <= a) {
			result = c;
		}

		else if (c <= a && a <= b) {
			result = a;
		}

		else if (c <= b && b <= a) {
			result = b;
		}

		System.out.println(result);
		in.close();

	}
}