import java.util.*;
import java.io.*;

public class ccc13j4 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue<Integer> chores = new PriorityQueue<Integer>();
      
    int maxTime = Integer.parseInt(in.readLine());
    int numChores = Integer.parseInt(in.readLine());
    int counter = 0;
    int number;
    
    for (int i = 0; i < numChores; i++) {
      chores.add(Integer.parseInt(in.readLine()));
    }
    
    while (maxTime >= 0) {
      number = chores.remove();
      if (maxTime - number >= 0) {
        maxTime -= number;
        counter++;
      }
      else {
        break;
      }
    }
    System.out.println(counter);
  }
}