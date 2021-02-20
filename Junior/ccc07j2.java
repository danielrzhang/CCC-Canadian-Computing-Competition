import java.util.Scanner;
public class ccc07j2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		boolean running = true;
		while (running) {
			String shortString = in.nextLine();
			String result;
			if (shortString.equals("CU")) {
				result = "see you";
			}

			else if (shortString.equals(":-)")) {
				result = "I'm happy";
			}

			else if (shortString.equals(":-(")) {
				result = "I'm unhappy";
			}

			else if (shortString.equals(";-)")) {
				result = "wink";
			}

			else if (shortString.equals(":-P")) {
				result = "stick out my tongue";
			}

			else if (shortString.equals("(~.~)")) {
				result = "sleepy";
			}

			else if (shortString.equals("TA")) {
				result = "totally awesome";
			}

			else if (shortString.equals("CCC")) {
				result = "Canadian Computing Competition";
			}

			else if (shortString.equals("CUZ")) {
				result = "because";
			}

			else if (shortString.equals("TY")) {
				result = "thank-you";
			}

			else if (shortString.equals("YW")) {
				result = "you're welcome";
			}

			else if (shortString.equals("TTYL")) {
				result = "talk to you later";
				running = false;
			}

			else {
				result = shortString;
			}
			System.out.println(result);
		}
		in.close();

	}
}
