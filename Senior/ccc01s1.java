import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc01s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));

		String cards = in.readLine();
		int clubCounter = 0;
		int diamondCounter = 0;
		int heartCounter = 0;
		int spadeCounter = 0;

		String clubString = cards.substring(cards.indexOf("C") + 1, cards.indexOf("D"));;
		String diamondString = cards.substring(cards.indexOf("D") + 1, cards.indexOf("H"));
		String heartString = cards.substring(cards.indexOf("H") + 1, cards.indexOf("S"));
		String spadeString = cards.substring(cards.indexOf("S") + 1);

		String clubResult = "Clubs ";
		String diamondResult = "Diamonds ";
		String heartResult = "Hearts ";
		String spadeResult = "Spades ";

		if (clubString.length() == 0) {
			clubCounter += 3;
		}
		else if (clubString.length() == 1) {
			clubCounter += 2;
		}
		else if (clubString.length() == 2) {
			clubCounter++;
		}
		for (int i = 0; i < clubString.length(); i++) {
			clubResult += clubString.charAt(i) + " ";
			if (clubString.charAt(i) == 'A') {
				clubCounter += 4;
			}
			else if (clubString.charAt(i) == 'K') {
				clubCounter += 3;
			}
			else if (clubString.charAt(i) == 'Q') {
				clubCounter += 2;
			}
			else if (clubString.charAt(i) == 'J') {
				clubCounter++;
			}
		}


		if (diamondString.length() == 0) {
			diamondCounter += 3;
		}
		else if (diamondString.length() == 1) {
			diamondCounter += 2;
		}
		else if (diamondString.length() == 2) {
			diamondCounter++;
		}
		for (int i = 0; i < diamondString.length(); i++) {
			diamondResult += diamondString.charAt(i) + " ";
			if (diamondString.charAt(i) == 'A') {
				diamondCounter += 4;
			}
			else if (diamondString.charAt(i) == 'K') {
				diamondCounter += 3;
			}
			else if (diamondString.charAt(i) == 'Q') {
				diamondCounter += 2;
			}
			else if (diamondString.charAt(i) == 'J') {
				diamondCounter++;
			}
		}


		if (heartString.length() == 0) {
			heartCounter += 3;
		}
		else if (heartString.length() == 1) {
			heartCounter += 2;
		}
		else if (heartString.length() == 2) {
			heartCounter++;
		}
		for (int i = 0; i < heartString.length(); i++) {
			heartResult += heartString.charAt(i) + " ";
			if (heartString.charAt(i) == 'A') {
				heartCounter += 4;
			}
			else if (heartString.charAt(i) == 'K') {
				heartCounter += 3;
			}
			else if (heartString.charAt(i) == 'Q') {
				heartCounter += 2;
			}
			else if (heartString.charAt(i) == 'J') {
				heartCounter++;
			}
		}

		if (spadeString.length() == 0) {
			spadeCounter += 3;
		}
		else if (spadeString.length() == 1) {
			spadeCounter += 2;
		}
		else if (spadeString.length() == 2) {
			spadeCounter++;
		}
		for (int i = 0; i < spadeString.length(); i++) {
			spadeResult += spadeString.charAt(i) + " ";
			if (spadeString.charAt(i) == 'A') {
				spadeCounter += 4;
			}
			else if (spadeString.charAt(i) == 'K') {
				spadeCounter += 3;
			}
			else if (spadeString.charAt(i) == 'Q') {
				spadeCounter += 2;
			}
			else if (spadeString.charAt(i) == 'J') {
				spadeCounter++;
			}
		}
		System.out.println("Cards Dealt Points");
		System.out.println(clubResult + " " + clubCounter);
		System.out.println(diamondResult + " " + diamondCounter);
		System.out.println(heartResult + " " + heartCounter);
		System.out.println(spadeResult + " " + spadeCounter);
		System.out.println("Total " + (clubCounter + diamondCounter + heartCounter + spadeCounter));
	}
}