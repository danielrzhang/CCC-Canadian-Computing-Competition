import java.util.*;
import java.io.*;

public class ccc07s2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Box> boxes = new ArrayList<Box>();
    ArrayList<Item> items = new ArrayList<Item>();
    
    int numBoxes = Integer.parseInt(in.readLine());
    String[] input;
    int volume = 0;
    boolean canFit = false;
    
    for (int i = 0; i < numBoxes; i++) {
      input = in.readLine().split(" ");
      boxes.add(new Box(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
    }
    
    Collections.sort(boxes);
    int numItems = Integer.parseInt(in.readLine());
    
    for (int i = 0; i < numItems; i++) {
      input = in.readLine().split(" ");
      items.add(new Item(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
    }
    
    
    for (int i = 0; i < numItems; i++) {
      for (int j = 0; j < numBoxes; j++) {
        if (items.get(i).l <= boxes.get(j).l &&
            items.get(i).w <= boxes.get(j).w &&
            items.get(i).h <= boxes.get(j).h) {
          volume = boxes.get(j).volume;
          canFit = true;
          break;
        }
        else {
          if (j == numBoxes - 1) {
            canFit = false;
            break;
          }
        }
      }
      if (canFit) {
        System.out.println(volume);
      }
      else {
        System.out.println("Item does not fit.");
      }
    }
  }
}

class Box implements Comparable<Box> {
  int l;
  int w;
  int h;
  int volume;
  
  Box(int l, int w, int h) {
    int[] list = {l, w, h};
    Arrays.sort(list);
    this.l = list[0];
    this.w = list[1];
    this.h = list[2];
    this.volume = l * w * h;
  }
  
  public int compareTo(Box box) {
    return this.volume - box.volume;
  }
}

class Item {
  int l;
  int w;
  int h;
  
  Item(int l, int w, int h) {
    int[] list = {l, w, h};
    Arrays.sort(list);
    this.l = list[0];
    this.w = list[1];
    this.h = list[2];
  }
}