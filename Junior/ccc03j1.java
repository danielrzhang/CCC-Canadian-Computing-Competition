import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc03j1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int tineLength = Integer.parseInt(in.readLine());
		int tineSpace = Integer.parseInt(in.readLine());
		int handleLength = Integer.parseInt(in.readLine());

		for (int i = 0; i < tineLength; i++) {
			System.out.print("*");

			for (int j = 0; j < tineSpace; j++) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 0; j < tineSpace; j++) {
				System.out.print(" ");
			}

			System.out.println("*");
		}

		int bladeLength = (tineSpace * 2) + 3;

		for (int i = 0; i < bladeLength; i++) {
			System.out.print("*");
		}
		System.out.println();

		for (int i = 0; i < handleLength; i++) {
			for (int j = 0; j < bladeLength / 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
