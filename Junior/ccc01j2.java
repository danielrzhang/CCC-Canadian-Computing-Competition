import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc01j2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		boolean isInverse = false;
		int m = 1;
		
		int x = Integer.parseInt(in.readLine());
		int n = Integer.parseInt(in.readLine());
		
		while (m <= 100) {
			if ((m * x) % n == 1) {
				isInverse = true;
				break;
			} else {
				m++;
			}
		}
		
		if (isInverse) {
			System.out.println(m);
		} else {
			System.out.println("No such integer exists.");
		}
	}
}
