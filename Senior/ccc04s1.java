import java.util.*;
import java.io.*;

public class ccc04s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    ArrayList<String> wordList;
    String result;
    
    for (int i = 0; i < n; i++) {
      result = "";
      wordList = new ArrayList<String>();
      for (int j = 0; j < 3; j++) {
        wordList.add(in.readLine());
      }
      
      if (wordList.get(0).startsWith(wordList.get(1)) || wordList.get(0).startsWith(wordList.get(2)) || 
          wordList.get(1).startsWith(wordList.get(0)) || wordList.get(1).startsWith(wordList.get(2)) || 
          wordList.get(2).startsWith(wordList.get(0)) || wordList.get(2).startsWith(wordList.get(1)) ||
          wordList.get(0).endsWith(wordList.get(1)) || wordList.get(0).endsWith(wordList.get(2)) || 
          wordList.get(1).endsWith(wordList.get(0)) || wordList.get(1).endsWith(wordList.get(2)) || 
          wordList.get(2).endsWith(wordList.get(0)) || wordList.get(2).endsWith(wordList.get(1))) {
        result = "No";
      }
      else {
        result = "Yes";
      }
      System.out.println(result);
    }
  }
}