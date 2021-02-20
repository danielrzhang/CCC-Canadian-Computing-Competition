import java.util.Scanner;

public class ccc09j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();

		int result = 91 + num1 + (num2 * 3) + num3;
		String answer = Integer.toString(result);
		System.out.println("The 1-3-sum is " + answer);
		in.close();

	}
}