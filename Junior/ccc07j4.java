import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ccc07j4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = in.readLine().replaceAll("\\s+","");
		String str2 = in.readLine().replaceAll("\\s+","");
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		String ch1, ch2;
		if (str1.length() != str2.length()) {
			System.out.println("Is not an anagram.");
		} else {
			for (int i = 0; i < str1.length(); i++) {
				ch1 = Character.toString(str1.charAt(i));
				ch2 = Character.toString(str2.charAt(i));

				if (map1.containsKey(ch1)) {
					map1.put(ch1, map1.get(ch1) + 1);
				} else {
					map1.put(ch1, 1);
				}
				
				if (map2.containsKey(ch2)) {
					map2.put(ch2, map2.get(ch2) + 1);
				} else {
					map2.put(ch2, 1);
				}
			}
			
			if (map1.equals(map2)) {
				System.out.println("Is an anagram.");
			} else {
				System.out.println("Is not an anagram.");
			}
		}
	}
}
