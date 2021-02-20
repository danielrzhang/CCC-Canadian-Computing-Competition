import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc02s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int pinkPrice = Integer.parseInt(in.readLine());
		int greenPrice = Integer.parseInt(in.readLine());
		int redPrice = Integer.parseInt(in.readLine());
		int orangePrice = Integer.parseInt(in.readLine());
		int totalPrice = Integer.parseInt(in.readLine());

		int minTicketNum = Integer.MAX_VALUE;
		int ticketCount = 0;

		for (int i = 0; i <= totalPrice; i++) {
			for (int j = 0; j <= totalPrice; j++) {
				for (int k = 0; k <= totalPrice; k++) {
					for (int l = 0; l <= totalPrice; l++) {
						if ((i * pinkPrice) + (j * greenPrice) + (k * redPrice) + (l * orangePrice) == totalPrice) {
							if (i + j + k + l < minTicketNum) {
								minTicketNum = i + j + k + l;
							}
							ticketCount++;
							System.out.println("# of PINK is " + i + " # of GREEN is " + j + " # of RED is " + k+ " # of ORANGE is " + l);
						}
					}
				}
			}
		}
		System.out.println("Total combinations is " + ticketCount + ".");
		System.out.println("Minimum number of tickets to print is " + minTicketNum + ".");
	}
}