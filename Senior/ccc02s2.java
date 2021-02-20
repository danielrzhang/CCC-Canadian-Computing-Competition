import java.util.Scanner;
public class ccc02s2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int result = 0;
		int reducedFirst = 0;
		int reducedSecond = 0;
		int wholeNumber = 0;
		int numerator = 0;

		if (firstNum % secondNum == 0) {
			result = firstNum / secondNum;
			System.out.println(result);
		}

		else {
			for (int i = 1; i <= Math.min(firstNum, secondNum); i++) {
				if (firstNum % i == 0 && secondNum % i == 0) {
					reducedFirst = firstNum / i;
					reducedSecond = secondNum / i;
				}
			}

			if (firstNum / secondNum > 0) {
				wholeNumber = reducedFirst / reducedSecond;
				numerator = reducedFirst % reducedSecond;
				System.out.println(wholeNumber + " " + numerator + "/" + reducedSecond);
			}

			else {
				System.out.println(reducedFirst + "/" + reducedSecond);
			}
		}
		in.close();
	}
}

