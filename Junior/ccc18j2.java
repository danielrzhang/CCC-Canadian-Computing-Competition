import java.util.Scanner;
public class ccc18j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		String firstDay = in.nextLine();
		String secondDay = in.nextLine();
		int counter = 0;

		for (int i = 0; i < n; i++) {
			char ch1 = firstDay.charAt(i);
			char ch2 = secondDay.charAt(i);

			if (ch1 == 'C' && ch2 == 'C') {
				counter++;
			}
		}
		System.out.println(counter);
		in.close();

	}
}