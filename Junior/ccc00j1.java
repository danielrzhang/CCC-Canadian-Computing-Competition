import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc00j1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean running = true;

		String[] input = in.readLine().split(" ");
		String[][] numbers = new String[6][7];

		int startDay = Integer.parseInt(input[0]);
		int endDay = Integer.parseInt(input[1]);

		System.out.println("Sun Mon Tue Wed Thr Fri Sat");

		int counter = 1;
		for (int i = startDay - 1; i < 7; i++) {
			numbers[0][i] = Integer.toString(counter);
			counter++;
		}

		for (int i = 1; i < numbers.length; i++) {
			if (!running) {
				break;
			}
			for (int j = 0; j < numbers[i].length; j++) {
				if (counter > endDay) {
					running = false;
					break;
				}
				numbers[i][j] = Integer.toString(counter);
				counter++;
			}
		}

		counter = 0;
		String dateString;
		running = true;
		for (int i = 0; i < numbers.length; i++) {
			dateString = "";

			if (!running) {
				break;
			}

			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == null) {
					if (counter < endDay) {
						dateString += "    ";
						//dateString += "!!!!";
					} else {
						running = false;
						break;
					}
				} else {
					if (numbers[i][j].length() == 1) {
						if (numbers[i][j].equals("1") || j == 0) {
							dateString += "  " + numbers[i][j];
							//dateString += "!!" + numbers[i][j];
						} else {
							dateString += "   " + numbers[i][j];
							//dateString += "!!!" + numbers[i][j];
						}
					} else {
						if (j == 0) {
							dateString += " " + numbers[i][j];
							//dateString += "!" + numbers[i][j];
						} else {
							dateString += "  " + numbers[i][j];
							//dateString += "!!" + numbers[i][j];
						}
					}
				}
				counter++;
			}
			dateString.stripTrailing();
			dateString.replaceFirst("\\s+$", "");
			System.out.println(dateString);
		}
	}
}
