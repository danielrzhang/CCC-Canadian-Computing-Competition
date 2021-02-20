import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc20j4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		String substr = in.readLine();
		String result = "no";

		for (int i = 0; i < substr.length(); i++) {
			if (str.contains(substr)) {
				result = "yes";
				break;
			} else {
				substr = substr.substring(1, substr.length()) + substr.charAt(0);
			}
		}
		System.out.println(result);
	}
}
