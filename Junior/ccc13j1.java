import java.util.Scanner;

public class ccc13j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		int second = in.nextInt();

		int product = second * 2;
		String third = Integer.toString(product - first);
		System.out.println(third);
		in.close();

	}
}