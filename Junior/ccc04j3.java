import java.util.*;
import java.io.*;

public class ccc04j3 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    ArrayList<String> adjectives = new ArrayList<String>();
    ArrayList<String> nouns = new ArrayList<String>();
    
    int numAdj = Integer.parseInt(in.readLine());
    int numNouns = Integer.parseInt(in.readLine());
    
    for (int i = 0; i < numAdj; i++) {
      adjectives.add(in.readLine());
    }
    for (int i = 0; i < numNouns; i++) {
      nouns.add(in.readLine());
    }
    
    for (int i = 0; i < numAdj; i++) {
      for (int j = 0; j < numNouns; j++) {
        System.out.println(adjectives.get(i) + " as " + nouns.get(j));
      }
    }
  }
}