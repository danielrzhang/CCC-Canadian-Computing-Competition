import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc06j3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input = in.readLine();
		int counter;

		String one = "abc";
		String two = "def";
		String three = "ghi";
		String four = "jkl";
		String five = "mno";
		String six = "pqrs";
		String seven = "tuv";
		String eight = "wxyz";
		String ch = " ", nextCh = " ";

		while (!input.equals("halt")) {
			counter = 0;
			for (int i = 0; i < input.length(); i++) {
				ch = Character.toString(input.charAt(i));

				if (i < input.length() - 1) {
					nextCh = Character.toString(input.charAt(i + 1));
				}

				if (one.contains(ch)) {
					if (i < input.length() - 1 && one.contains(nextCh)) {
						counter += 2;
					}
					counter += one.indexOf(ch) + 1;
				} else if (two.contains(ch)) {
					if (i < input.length() - 1 && two.contains(nextCh)) {
						counter += 2;
					}
					counter += two.indexOf(ch) + 1;
				} else if (three.contains(ch) && three.contains(nextCh)) {
					if (i < input.length() - 1) {
						counter += 2;
					}
					counter += three.indexOf(ch) + 1;
				} else if (four.contains(ch) && four.contains(nextCh)) {
					if (i < input.length() - 1) {
						counter += 2;
					}
					counter += four.indexOf(ch) + 1;
				} else if (five.contains(ch)) {
					if (i < input.length() - 1 && five.contains(nextCh)) {
						counter += 2;
					}
					counter += five.indexOf(ch) + 1;
				} else if (six.contains(ch)) {
					if (i < input.length() - 1 && six.contains(nextCh)) {
						counter += 2;
					}
					counter += six.indexOf(ch) + 1;
				} else if (seven.contains(ch)) {
					if (i < input.length() - 1 && seven.contains(nextCh)) {
						counter += 2;
					}
					counter += seven.indexOf(ch) + 1;
				} else if (eight.contains(ch)) {
					if (i < input.length() - 1 && eight.contains(nextCh)) {
						counter += 2;
					}
					counter += eight.indexOf(ch) + 1;
				}
			}
			System.out.println(counter);
			input = in.readLine();
		}
	}
}
