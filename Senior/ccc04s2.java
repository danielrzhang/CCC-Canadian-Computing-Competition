import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ccc04s2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Yodeller> yodellers = new ArrayList<Yodeller>();
		ArrayList<Yodeller> topYodellers = new ArrayList<Yodeller>();
		YodellerCompare yodellerCompare = new YodellerCompare();
		ScoreCompare scoreCompare = new ScoreCompare();

		String[] input = in.readLine().split(" ");
		int numYodellers = Integer.parseInt(input[0]);
		int numRounds = Integer.parseInt(input[1]);

		for (int i = 1; i <= numYodellers; i++) {
			yodellers.add(new Yodeller(i));
		}

		String[] scoreInput;
		Yodeller tempYodeller;
		int prevScore = 0;
		for (int i = 0; i < numRounds; i++) {
			scoreInput = in.readLine().split(" ");

			for (int j = 0; j < numYodellers; j++) {
				tempYodeller = yodellers.get(j);

				for (int k = 0; k < numYodellers; k++) {
					if (k + 1 == tempYodeller.yodellerNumber) {
						tempYodeller.add(Integer.parseInt(scoreInput[k]));
						break;
					}
				}
			}
			Collections.sort(yodellers, scoreCompare);


			for (int j = 0; j < numYodellers; j++) {
				if (j != 0) {
					prevScore = yodellers.get(j - 1).totalScore;
					if (prevScore == yodellers.get(j).totalScore) {
						yodellers.get(j).setLowestRank(yodellers.get(j - 1).lowestRank);
					} else {
						yodellers.get(j).setLowestRank(j + 1);
					}
				} else {
					yodellers.get(j).setLowestRank(j + 1);
				}
			}
		}

		int highestScore = yodellers.get(0).totalScore;

		for (int i = 0; i < numYodellers; i++) {
			tempYodeller = yodellers.get(i);
			if (yodellers.get(i).totalScore == highestScore) {
				topYodellers.add(yodellers.get(i));
			}
		}
		Collections.sort(topYodellers, yodellerCompare);

		for (int i = 0; i < topYodellers.size(); i++) {
			tempYodeller = topYodellers.get(i);
			System.out.println("Yodeller " + tempYodeller.yodellerNumber + " is the TopYodeller: score " + tempYodeller.totalScore
					+ ", worst rank " + tempYodeller.lowestRank);
		}
	}
}

class Yodeller {
	int yodellerNumber;
	int totalScore;
	int lowestRank;

	public Yodeller(int yodellerNumber) {
		this.yodellerNumber = yodellerNumber;
		totalScore = 0;
		lowestRank = 0;
	}

	public void add(int roundScore) {
		totalScore += roundScore;
	}

	public void setLowestRank(int rank) {
		if (lowestRank <= rank) {
			lowestRank = rank;
		}
	}
}

class YodellerCompare implements Comparator<Yodeller> {

	@Override
	public int compare(Yodeller o1, Yodeller o2) {
		if (o1.yodellerNumber > o2.yodellerNumber) {
			return 1;
		} else if (o1.yodellerNumber < o2.yodellerNumber) {
			return -1;
		} else {
			return 0;
		}
	}
}

class ScoreCompare implements Comparator<Yodeller> {

	@Override
	public int compare(Yodeller o1, Yodeller o2) {
		if (o1.totalScore < o2.totalScore) {
			return 1;
		} else if (o1.totalScore > o2.totalScore) {
			return -1;
		} else {
			return 0;
		}
	}

}
