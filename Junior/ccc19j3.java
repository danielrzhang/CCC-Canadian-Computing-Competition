import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc19j3 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String str;
		int counter;
		String result;

		for (int i = 0; i < n; i++) {
			str = in.readLine();
			counter = 1;
			result = "";
			for (int j = 0; j < str.length(); j++) {
				if (j + 1 < str.length()) {
					if (str.charAt(j) == str.charAt(j + 1)) {
						counter++;
					}

					else if (str.charAt(j) != str.charAt(j + 1)) {
						result += counter + " " + str.charAt(j) + " ";
						counter = 1;
					}
				}

				else {
					result += counter + " " + str.charAt(j) + " ";
					counter++;
				}
			}
			System.out.println(result.trim());
		}
	}
}