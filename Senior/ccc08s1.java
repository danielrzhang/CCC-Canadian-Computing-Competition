import java.util.Scanner;
public class ccc08s1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String [] cityArray = new String [10000];
		int [] temperatureArray = new int [10000];

		boolean running = true;
		int indexCounter = 0;
		int coldestIndex = 0;
		int coldestTemp = 200;
		String temperatureAndCity = "";

		do {
			temperatureAndCity = in.nextLine();
			String [] tempCity = temperatureAndCity.split(" ");

			cityArray[indexCounter] = tempCity[0];
			temperatureArray[indexCounter] = Integer.parseInt(tempCity[1]);

			if (tempCity[0].equals("Waterloo")) {
				running = false;
			}

			indexCounter++;
		} while (running);

		for (int i = 0; i < indexCounter; i++) {
			if (temperatureArray[i] <= coldestTemp) {
				coldestIndex = i;
				coldestTemp = temperatureArray[i];
			}
		}
		System.out.println(cityArray[coldestIndex]);
		in.close();

	}
}