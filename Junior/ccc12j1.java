import java.util.Scanner;

public class ccc12j1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int speedLimit = in.nextInt();
		int currentSpeed = in.nextInt();

		if (currentSpeed <= speedLimit) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		else {
			if (currentSpeed <= speedLimit + 20) {
				System.out.println("You are speeding and your fine is $100.");
			}
			else if (currentSpeed <= speedLimit + 30) {
				System.out.println("You are speeding and your fine is $270.");
			}
			else {
				System.out.println("You are speeding and your fine is $500.");
			}

		}
		in.close();

	}
}