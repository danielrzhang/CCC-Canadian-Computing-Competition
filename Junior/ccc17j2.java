import java.util.Scanner;
public class ccc17j2 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		int termValue = in.nextInt();
		int term = in.nextInt();
		int total = 0;
		int thing = termValue;

		for (int i = 0; i < term; i++) {
			termValue *= 10;
			total += termValue;
		}
		System.out.println(total + thing);
		in.close();

	}
}