import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc08s2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int input = Integer.parseInt(in.readLine());
		int counter;
		while (input != 0) {
			counter = 0;
			for (int i = 0; i <= input; i++) {
				for (int j = 0; j <= input; j++) {
					if (i * i + j * j <= input * input) {
						counter++;
					} else {
						break;
					}
				}
			}
			counter = (4 * counter) - (4 * input) - 3;
			System.out.println(counter);
			input = Integer.parseInt(in.readLine());
		}
	}
}
