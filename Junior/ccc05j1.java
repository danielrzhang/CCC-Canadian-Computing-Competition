import java.util.Scanner;
public class ccc05j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int dayTime = in.nextInt();
		int eveningTime = in.nextInt();
		int weekendTime = in.nextInt();

		int aDayTime = dayTime - 100;
		int bDayTime = dayTime - 250;
		String result;

		if (dayTime <= 100) {
			aDayTime = 0;
		}

		if (dayTime <= 250) {
			bDayTime = 0;
		}

		double aTotal = aDayTime * 0.25 + eveningTime * 0.15 + weekendTime * 0.2;
		double bTotal = bDayTime * 0.45 + eveningTime * 0.35 + weekendTime * 0.25;

		System.out.printf("Plan A costs %.2f" , aTotal);
		System.out.printf("\nPlan B costs %.2f" , bTotal);

		if (bTotal < aTotal) {
			result = "Plan B is cheapest.";
		}

		else if (aTotal < bTotal) {
			result = "Plan A is cheapest.";
		}

		else {
			result = "Plan A and B are the same price.";
		}

		System.out.println("\n" + result);
		in.close();

	}
}