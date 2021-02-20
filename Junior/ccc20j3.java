import java.util.Scanner;
public class ccc20j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		in.nextLine();
		int minX = 101;
		int minY = 101;
		int maxX = -1;
		int maxY = -1;

		for (int i = 0; i < number; i++) {
			String input = in.nextLine();
			String [] xy = input.split(",");
			for (int j = 0; j < xy.length; j += 2) {
				int x = Integer.parseInt(xy[j]);
				if (x >= maxX) {
					maxX = x + 1;
				}

				if (x <= minX) {
					minX = x - 1;
				}
			}

			for (int k = 1; k < xy.length; k += 2) {
				int y = Integer.parseInt(xy[k]);
				if (y >= maxY) {
					maxY = y + 1;
				}

				if (y <= minY) {
					minY = y - 1;
				}
			}
		}
		System.out.println(minX + "," + minY);
		System.out.println(maxX + "," + maxY);
		in.close();

	}
}
