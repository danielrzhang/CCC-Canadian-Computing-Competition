import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc05s2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int y = 0;

		String[] size = in.readLine().split(" ");
		int maxHorizontal = Integer.parseInt(size[0]);
		int maxVertical = Integer.parseInt(size[1]);

		String[] input = {"", ""};
		int currentHorizontal;
		int currentVertical;

		input = in.readLine().split(" ");
		currentHorizontal = Integer.parseInt(input[0]);
		currentVertical = Integer.parseInt(input[1]);

		while (!input[0].equals("0") || !input[1].equals("0")) {
			if (x + currentHorizontal > maxHorizontal) {
				x = maxHorizontal;
			}
			else if (x + currentHorizontal < 0) {
				x = 0;
			}
			else if (x + currentHorizontal <= maxHorizontal) {
				x += currentHorizontal;
			}

			if (y + currentVertical > maxVertical) {
				y = maxVertical;
			}
			else if (y + currentVertical < 0) {
				y = 0;
			}
			else if (y + currentVertical <= maxVertical) {
				y += currentVertical;
			}
			System.out.println(x + " " + y);

			input = in.readLine().split(" ");
			currentHorizontal = Integer.parseInt(input[0]);
			currentVertical = Integer.parseInt(input[1]);
		}
	}
}
