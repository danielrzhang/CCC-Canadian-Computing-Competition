import java.util.Scanner;
public class ccc07s1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = in.nextInt();
		for (int i = 0; i < number; i++) {
			int year = in.nextInt();
			int month = in.nextInt();
			int day = in.nextInt();
			String result;

			if (year > 1989) {
				result = "No";
			}

			else if (year < 1989) {
				result = "Yes";
			}

			else {
				if (month > 2) {
					result = "No";
				}
				else if (month < 2) {
					result = "Yes";
				}

				else {
					if (day > 27) {
						result = "No";
					}

					else {
						result = "Yes";
					}
				}
			}
			System.out.println(result);
		}
		in.close();

	}
}



