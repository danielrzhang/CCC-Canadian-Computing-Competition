import java.util.*;
import java.io.*;

public class ccc14s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int numFriends = Integer.parseInt(in.readLine());
    int removeTimes = Integer.parseInt(in.readLine());
    int removeMultiple;
    int counter;
    
    ArrayList<Integer> friendList = new ArrayList<Integer>();
    for (int i = 0; i < numFriends; i++) {
      friendList.add(i + 1);
    }
    
    for (int i = 0; i < removeTimes; i++) {
      counter = 1;
      removeMultiple = Integer.parseInt(in.readLine());
      for (int j = 0; j < friendList.size(); j++) {
        if ((j + counter) % removeMultiple == 0) {
          friendList.remove(j);
          counter++;
        }
      }
    }
    for (int num: friendList) {
      System.out.println(num);
    }
  }
}