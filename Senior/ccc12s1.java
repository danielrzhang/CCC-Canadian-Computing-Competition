import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc12s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine()) - 1;
		int result = (n * (n - 1) * (n - 2)) / 6 ;
		System.out.println(result);
	}
}