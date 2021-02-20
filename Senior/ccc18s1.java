import java.util.*;
import java.io.*;

public class ccc18s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Double> villages = new ArrayList<Double>();
    
    int n = Integer.parseInt(in.readLine());
    double minNeighbourhood = Integer.MAX_VALUE;
    double neighbourhood;
    double left, right;
    
    for (int i = 0; i < n; i++) {
      villages.add(Double.parseDouble(in.readLine()));
    }
    
    Collections.sort(villages);
    
    for (int i = 1; i < villages.size() - 1; i++) {
      left = (villages.get(i) - villages.get(i - 1)) / 2;
      right = (villages.get(i + 1) - villages.get(i)) / 2;
      neighbourhood = left + right;
      
      if (neighbourhood < minNeighbourhood) {
        minNeighbourhood = neighbourhood;
      }
    }
    System.out.printf("%.1f%n", minNeighbourhood);
  }
}