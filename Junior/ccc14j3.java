import java.util.Scanner;
public class ccc14j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int antoniaPoints = 100;
		int davidPoints = 100;

		for (int i = 0; i < n; i++) {
			int antoniaRoll = in.nextInt();
			int davidRoll = in.nextInt();

			if (antoniaRoll > davidRoll) {
				davidPoints -= antoniaRoll;
			}

			else if (davidRoll > antoniaRoll) {
				antoniaPoints -= davidRoll;
			}
		}
		System.out.println(antoniaPoints);
		System.out.println(davidPoints);
		in.close();

	}
}
