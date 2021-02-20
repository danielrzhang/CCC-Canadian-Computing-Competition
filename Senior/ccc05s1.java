import java.util.Scanner;
public class ccc05s1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String phoneNumber = in.nextLine();
			String [] oneString = phoneNumber.split("-");
			String emptyString = "";
			String [] fullPhoneNumber = new String [10];
			String secondEmptyString = "";

			for (int j = 0; j < oneString.length; j++) {
				emptyString += oneString[j];
			}

			for (int k = 0; k < fullPhoneNumber.length; k++) {
				String digit = emptyString.substring(k, k + 1);
				if (digit.equals("A") || digit.equals("B") || digit.equals("C"))
					fullPhoneNumber[k] = "2";

				else if (digit.equals("D") || digit.equals("E") || digit.equals("F"))
					fullPhoneNumber[k] = "3";

				else if (digit.equals("G") || digit.equals("H") || digit.equals("I"))
					fullPhoneNumber[k] = "4";

				else if (digit.equals("J") || digit.equals("K") || digit.equals("L"))
					fullPhoneNumber[k] = "5";

				else if (digit.equals("M") || digit.equals("N") || digit.equals("O"))
					fullPhoneNumber[k] = "6";

				else if (digit.equals("P") || digit.equals("Q") || digit.equals("R") || digit.equals("S"))
					fullPhoneNumber[k] = "7";

				else if (digit.equals("T") || digit.equals("U") || digit.equals("V"))
					fullPhoneNumber[k] = "8";

				else if (digit.equals("W") || digit.equals("X") || digit.equals("Y") || digit.equals("Z"))
					fullPhoneNumber[k] = "9";

				else
					fullPhoneNumber[k] = digit;

				secondEmptyString += fullPhoneNumber[k];
			}
			String result = secondEmptyString.substring(0, 3) + "-" + secondEmptyString.substring(3, 6) + "-" + secondEmptyString.substring(6);
			System.out.println(result);
		}
		in.close();

	}
}

