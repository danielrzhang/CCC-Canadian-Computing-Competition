import java.util.Scanner;
public class ccc19j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int number = in.nextInt();
			char character = in.next().charAt(0);
			for (int j = 0; j < number; j++) {
				System.out.print(character);
			}
			System.out.print("\n");
		}
		in.close();

	}
}