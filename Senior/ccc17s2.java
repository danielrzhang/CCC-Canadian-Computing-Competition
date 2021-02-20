import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ccc17s2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String[] input = in.readLine().split(" ");
		ArrayList<Integer> heights = new ArrayList<Integer>();

		int[] list = new int[n];
		int middle = (n - 1) / 2;

		for (int i = 0; i < input.length; i++) {
			heights.add(Integer.parseInt(input[0]));
		}

		Collections.sort(heights);
		System.out.println(list);
		System.out.println(middle);
	}
}
