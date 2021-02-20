import java.util.Scanner;
public class ccc05j2 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int numCounter = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			int counter = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 4) {
				numCounter++;
			}
		}
		System.out.println("The number of RSA numbers between " + firstNum + " and " + secondNum + " is " + numCounter);
		in.close();

	}
}