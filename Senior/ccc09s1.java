import java.util.Scanner;
public class ccc09s1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int firstNum = in.nextInt();
		int secondNum = in.nextInt();
		int [] powerSixNum = {1, 64, 729, 4096, 15625, 46656, 117649, 262144, 531441, 1000000, 1771561, 2985984, 4826809, 7529536, 11390625, 16777216, 24137569, 34012224, 47045881, 64000000, 85766121 };
		int counter = 0;

		for (int j = 0; j < powerSixNum.length; j++) {
			if (firstNum <= powerSixNum[j] && powerSixNum[j] <= secondNum) {
				counter++;
			}
		}

		System.out.println(counter);
		in.close();

	}
}