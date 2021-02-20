import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ccc06s2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String plainText1 = in.readLine();
		String cipherText1 = in.readLine();
		String cipherText2 = in.readLine();
		String plainText2 = "";

		HashMap<String, String> code = new HashMap<String, String>();
		for (int i = 0; i < 26; i++) {
			code.put(".", Character.toString((char) (i + 65)));
		}
		code.put(".", " ");

		for (int i = 0; i < plainText1.length(); i++) {
			code.put(Character.toString(cipherText1.charAt(i)), Character.toString(plainText1.charAt(i)));
		}

		String letterInCode;
		for (int i = 0; i < cipherText2.length(); i++) {
			letterInCode = code.get(Character.toString(cipherText2.charAt(i)));
			if (letterInCode == null) {
				letterInCode = ".";
			}
			plainText2 += letterInCode;
		}
		System.out.println(plainText2);
	}
}
