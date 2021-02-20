import java.util.Scanner;
public class ccc04j2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int startYear = in.nextInt();
		int endYear = in.nextInt();

		for (int i = startYear; i <= endYear; i+=60) {
			System.out.println("All positions change in year " + i);
		}
		in.close();

	}
}