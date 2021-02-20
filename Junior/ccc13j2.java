import java.util.Scanner;
public class ccc13j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String letters = in.nextLine();
		String result = "";

		for (int i = 0; i < letters.length(); i++) {
			if (letters.charAt(i) != 'I' && letters.charAt(i) != 'O' && letters.charAt(i) != 'S' && letters.charAt(i) != 'H' &&  letters.charAt(i) != 'Z' && letters.charAt(i) != 'X' && letters.charAt(i) != 'N') {
				result = "NO";
				break;
			}

			else {
				result = "YES";
			}
		}

		System.out.println(result);

		in.close();

	}
}