import java.util.Scanner;
public class ccc11s1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int n = in.nextInt();
		String fullString = "";
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			fullString += str;
		}

		int sCounter = 0;
		int tCounter = 0;
		for (int i = 0; i < fullString.length(); i++) {
			char ch = fullString.charAt(i);
			if (ch == 't' || ch == 'T') {
				tCounter++;
			}

			else if (ch == 's' || ch == 'S') {
				sCounter++;
			}
		}

		if (sCounter >= tCounter) {
			System.out.println("French");
		}

		else {
			System.out.println("English");
		}
		in.close();

	}
}


