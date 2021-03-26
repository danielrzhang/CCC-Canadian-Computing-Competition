package Junior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc21j4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = in.readLine().split("");

		int swapCounter = 0;
		int minIndex;
		String temp;
		for (int i = 0; i < input.length - 1; i++) {
			minIndex = i;
			temp = input[i];
			for (int j = i; j < input.length; j++) {
				if (input[j].compareTo(input[minIndex]) < 0) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				temp = input[minIndex];
				input[minIndex] = input[i];
				input[i] = temp;
				swapCounter++;
			}
		}
		System.out.println(swapCounter);
	}
}
