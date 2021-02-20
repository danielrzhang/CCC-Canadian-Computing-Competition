import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc19s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int[][] array = new int[][] {{1, 2}, {3, 4}};
		String flips = in.readLine();

		int temp1;
		int temp2;

		for (int i = 0; i < flips.length(); i++) {
			if (flips.charAt(i) == 'H') {
				temp1 = array[0][0];
				temp2 = array[0][1];
				array[0][0] = array[1][0];
				array[0][1] = array[1][1];
				array[1][0] = temp1;
				array[1][1] = temp2;
			}

			else {
				temp1 = array[0][0];
				temp2 = array[1][0];
				array[0][0] = array[0][1];
				array[1][0] = array[1][1];
				array[0][1] = temp1;
				array[1][1] = temp2;
			}
		}

		System.out.println(array[0][0] + " " + array[0][1]);
		System.out.println(array[1][0] + " " + array[1][1]);
	}
}