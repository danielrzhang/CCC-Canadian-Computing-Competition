import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc13s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int intNum = Integer.parseInt(in.readLine());
		String stringNum = "";
		char digit;
		boolean loopCut;
		boolean notFound = true;
		boolean matchingDigits;

		while (notFound) {
			loopCut = false;
			matchingDigits = false;
			intNum++;
			stringNum = Integer.toString(intNum);

			for (int i = 0; i < stringNum.length(); i++) {
				digit = stringNum.charAt(i);

				for (int j = i + 1; j < stringNum.length(); j++) {
					if (digit == stringNum.charAt(j)) {
						loopCut = true;
						matchingDigits = true;
						break;
					}
				}
				if (loopCut && matchingDigits) {
					notFound = true;
					break;
				}
				else {
					notFound = false;
				}
			}
		}
		System.out.println(stringNum);
	}
}