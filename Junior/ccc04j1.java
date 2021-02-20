import java.util.Scanner;

public class ccc04j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int result = (int) Math.floor(Math.sqrt(num));

		System.out.println("The largest square has side length " + result + ".");
		in.close();

	}
}