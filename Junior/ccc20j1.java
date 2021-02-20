import java.util.Scanner;
public class ccc20j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int thirdNum = in.nextInt();

		int result = firstNum + secondNum * 2 + thirdNum * 3;

		if (result >= 10) {
			System.out.println("happy");
		}

		else {
			System.out.println("sad");
		}
		in.close();

	}
}