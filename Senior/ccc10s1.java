import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc10s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		String[] input;

		String bestComputer1 = "";
		String bestComputer2 = "";
		int bestRank1 = 0;
		int bestRank2 = 0;

		int currentRank;

		for (int i = 0; i < n; i++) {
			input = in.readLine().split(" ");
			currentRank = 2 * Integer.parseInt(input[1]) + 3 * Integer.parseInt(input[2]) + Integer.parseInt(input[3]);

			if ((currentRank > bestRank1) || ((currentRank == bestRank1) && (input[0].compareTo(bestComputer1) < 0))) {
				bestComputer2 = bestComputer1;
				bestComputer1 = input[0];
				bestRank2 = bestRank1;
				bestRank1 = currentRank;
			}

			else if ((currentRank > bestRank2) || ((currentRank == bestRank2) && (input[0].compareTo(bestComputer2)) < 0)) {
				bestComputer2 = input[0];
				bestRank2 = currentRank;
			}
		}

		if (n == 1) {
			System.out.println(bestComputer1);
		}
		else {
			System.out.println(bestComputer1);
			System.out.println(bestComputer2);
		}
	}
}