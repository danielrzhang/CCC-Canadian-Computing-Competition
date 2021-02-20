import java.util.Scanner;
public class ccc98s1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String emptyString = "";
			String line = in.nextLine();
			String [] sentence = line.split(" ");
			for (int j = 0; j < sentence.length; j++) {
				if (sentence[j].length() == 4) {
					sentence[j] = "****";
				}
				emptyString += sentence[j] + " ";
			}
			System.out.println(emptyString.trim());
		}
		in.close();

	}
}