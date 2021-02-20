import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ccc06s1 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String mother = in.readLine();
		String father = in.readLine();
		int n = Integer.parseInt(in.readLine());
		String result = "";
		String baby;
		boolean hasGene;

		for (int i = 0; i < father.length(); i++) {
			if (father.charAt(i) == mother.charAt(i)) {
				result += father.charAt(i);
			}
			else {
				result += father.toUpperCase().charAt(i);
			}
		}

		for (int i = 0; i < n; i++) {
			baby = in.readLine();
			hasGene = true;
			for (int j = 0; j < result.length() - 1; j++) {
				if (!baby.contains(result.substring(j, j + 1))) {
					j++;

					if (!baby.contains(result.substring(j, j + 1))) {
						hasGene = false;
						break;
					}
				}
				else {
					j++;
				}
			}

			if (hasGene) {
				System.out.println("Possible baby.");
			}
			else {
				System.out.println("Not their baby!");
			}
		}
	}
}