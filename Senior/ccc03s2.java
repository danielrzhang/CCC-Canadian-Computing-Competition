import java.io.*;
import java.util.*;

public class ccc03s2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    ArrayList<String> lastWords, lastSyllables;
    String[] input;
    String word;
    int index;
    
    for (int i = 0; i < n; i++) {
      lastWords = new ArrayList<String>();
      for (int j = 0; j < 4; j++) {
        input = in.readLine().split(" ");
        lastWords.add(input[input.length - 1]);
      }
      
      lastSyllables = new ArrayList<String>();
      for (int j = 0; j < lastWords.size(); j++) {
        word = lastWords.get(j).toLowerCase();
        index = 0;
        for (int k = 0; k < word.length(); k++) {
          if (word.charAt(k) == 'a' || word.charAt(k) == 'e' || word.charAt(k) == 'i' || word.charAt(k) == 'o' || word.charAt(k) == 'u') {
            index = k;
          }
        }
        lastSyllables.add(word.substring(index));
      }
      if (lastSyllables.get(0).equals(lastSyllables.get(1)) && lastSyllables.get(0).equals(lastSyllables.get(2)) && lastSyllables.get(0).equals(lastSyllables.get(3)) && 
          lastSyllables.get(1).equals(lastSyllables.get(2)) && lastSyllables.get(1).equals(lastSyllables.get(3)) && lastSyllables.get(2).equals(lastSyllables.get(3))) {
        System.out.println("perfect");
      }
      else if (lastSyllables.get(0).equals(lastSyllables.get(1)) && lastSyllables.get(2).equals(lastSyllables.get(3))) {
        System.out.println("even");
      }
      else if (lastSyllables.get(0).equals(lastSyllables.get(2)) && lastSyllables.get(1).equals(lastSyllables.get(3))) {
        System.out.println("cross");
      }
      else if (lastSyllables.get(0).equals(lastSyllables.get(3)) && lastSyllables.get(1).equals(lastSyllables.get(2))) {
        System.out.println("shell");
      }
      else {
        System.out.println("free");
      }
    }
  }
}