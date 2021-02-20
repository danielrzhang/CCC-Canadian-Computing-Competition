import java.util.*;
import java.io.*;

public class ccc15s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    Stack<Integer> stack = new Stack<Integer>();
    int n = Integer.parseInt(in.readLine());
    int number;
    int result = 0;
    
    for (int i = 0; i < n; i++) {
      number = Integer.parseInt(in.readLine());
      if (number == 0) {
        stack.pop();
      }
      else {
        stack.push(number);
      }
    }
    for (int i = 0; i < stack.size(); i++) {
      result += stack.get(i);
    }
    System.out.println(result);
  }
}