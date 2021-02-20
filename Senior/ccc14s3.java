import java.util.*;
import java.io.*;

public class ccc14s3 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(in.readLine());
    
    for (int i = 0; i < n; i++) {
      Stack<Integer> mountain = new Stack<Integer>();
      Stack<Integer> branch = new Stack<Integer>();
      ArrayList<Integer> lake = new ArrayList<Integer>();
      ArrayList<Integer> lakeCopy = new ArrayList<Integer>();
      
      int carNum;
      int mountainPop = 0;
      int mountainPeek = 0;
      int branchPop = 0;
      int branchPeek = 0;
      int nextNum = 1;
      boolean shiftToBranch = true;
      boolean shiftToLake = true;
      int branchSize;
      int mountainSize;
      
      int numCars = Integer.parseInt(in.readLine());
      
      for (int j = 0; j < numCars; j++) {
        carNum = Integer.parseInt(in.readLine());
        mountain.push(carNum);
        lakeCopy.add(carNum);
      }
      
      Collections.sort(lakeCopy);
      
      while (shiftToBranch) {
        mountainPop = mountain.pop();
        if (mountainPop == 1) {
          nextNum++;
          lake.add(mountainPop);
          shiftToBranch = false;
        }
        
        else {
          branch.push(mountainPop);
        }
      }
      
      while (shiftToLake) {
        if (mountain.size() >= 1 && branch.size() >= 1) {
          mountainPeek = mountain.peek();
          branchPeek = branch.peek();
          
          if (mountainPeek == nextNum) {
            mountainPop = mountain.pop();
            lake.add(mountainPop);
            nextNum++;
          }
          
          else if (branchPeek == nextNum) {
            branchPop = branch.pop();
            lake.add(branchPop);
            nextNum++;
          }
          
          else if (mountainPeek != nextNum) {
            mountainPop = mountain.pop();
            branch.push(mountainPop);
          }
          
          else if (branchPeek != nextNum) {
            branchPop = branch.pop();
            lake.add(branchPop);
          }
        }
        
        else {
          mountainSize = mountain.size();
          branchSize = branch.size();

          if (branch.empty()) {
            for (int k = 0; k < mountainSize; k++) {
              mountainPop = mountain.pop();
              mountainPeek = mountain.peek();
              
              if (mountainPop > mountainPeek) {
                branch.push(mountainPop);
                mountainSize--;
              }
              
              else {
                lake.add(mountainPop);
              }
            }
          }
          
          else if (mountain.empty()) {
            for (int k = 0; k < branchSize; k++) {
              branchPop = branch.pop();
              lake.add(branchPop);
            }
          }
          
          if (branch.empty()) {
            shiftToLake = false;
          }
        }
      }
      if (lake.equals(lakeCopy)) {
        System.out.println("Y");
      }
      
      else {
        System.out.println("N");
      }
    }
  }
}