import java.util.Scanner;
public class ccc11j3 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int difference = 1;
		int counter = 2; // Counter is set at 2 and not 0 because 2 numbers are already entered first

		while (firstNum >= secondNum) {
			difference = firstNum - secondNum; // Obtain the difference to get next number
			firstNum = secondNum; // First number is shifted down to the next number
			secondNum = difference; // Second number is shifted to the difference, which is the next number
			counter++;
		}

		System.out.println(counter);

		in.close();

	}
}
