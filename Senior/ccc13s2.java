import java.util.*;
import java.io.*;

public class ccc13s2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    int max = Integer.parseInt(in.readLine());
    int n = Integer.parseInt(in.readLine());
    Queue<Integer> cars = new LinkedList<Integer>();
    
    int car1 = 0;
    int car2 = 0;
    int car3 = 0;
    int car4 = 0;
    int total = 0;
    
    for (int i = 0; i < n; i++) {
      cars.add(Integer.parseInt(in.readLine()));
    }
    
    car1 = cars.remove();
    car2 = cars.remove();
    car3 = cars.remove();
    car4 = cars.remove();
    
    if (car1 + car2 + car3 + car4 > max) {
      if (car1 <= max) {
        total = 1;
      }
      if (car1 + car2 <= max) {
        total = 2;
      }
      if (car1 + car2 + car3 <= max) {
        total = 3;
      }
      if (car1 + car2 + car3 + car4 <= max) {
        total = 4;
      }
    }
    
    else {
      total = 3;
      while (car1 + car2 + car3 + car4 <= max) {
        car1 = car2;
        car2 = car3;
        car3 = car4;
        car4 = cars.remove();
        total++;
      }
    }
    System.out.println(total);
  }
}