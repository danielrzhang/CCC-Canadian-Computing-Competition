import java.util.Scanner;

public class ccc19j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int app3 = in.nextInt();
		int app2 = in.nextInt();
		int app1 = in.nextInt();

		int ban3 = in.nextInt();
		int ban2 = in.nextInt();
		int ban1 = in.nextInt();

		int applePoint = (app3 * 3) + (app2 * 2) + app1;
		int bananaPoint = (ban3 * 3) + (ban2 * 2) + ban1;

		if (applePoint > bananaPoint) {
			System.out.println("A");
		}

		else if (bananaPoint > applePoint) {
			System.out.println("B");
		}

		else {
			System.out.println("T");
		}
		in.close();

	}
}