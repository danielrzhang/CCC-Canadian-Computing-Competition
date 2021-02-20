import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc00s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int quarters = Integer.parseInt(in.readLine());
		int firstMachine = Integer.parseInt(in.readLine());
		int secondMachine = Integer.parseInt(in.readLine());
		int thirdMachine = Integer.parseInt(in.readLine());

		int counter = 0;

		while (quarters > 0) {
			if (quarters <= 0) {
				break;
			}
			quarters--;
			firstMachine++;
			if (firstMachine % 35 == 0) {
				quarters += 30;
			}
			counter++;


			quarters--;
			secondMachine++;
			if (secondMachine % 100 == 0) {
				quarters += 60;
			}
			counter++;

			if (quarters <= 0) {
				break;
			}
			quarters--;
			thirdMachine++;
			if (thirdMachine % 10 == 0) {
				quarters += 9;
			}
			counter++;
		}
		System.out.println("Martha plays " + counter + " times before going broke.");
	}
}