import java.util.Scanner;

public class ccc11j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int antenna = in.nextInt();
		int eyes = in.nextInt();

		if (antenna >= 3 && eyes <= 4) {
			System.out.println("TroyMartian");
		}

		if (antenna <= 6 && eyes >= 2) {
			System.out.println("VladSaturnian");
		}

		if (antenna <= 2 && eyes <= 3) {
			System.out.println("GraemeMercurian");
		}
		in.close();

	}
}