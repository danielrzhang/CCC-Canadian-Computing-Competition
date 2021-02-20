import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc16j2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for (int i = 0; i < n; i++) {
			if (i != n - 1) {
				in.readLine();
			}

		}
	}
}