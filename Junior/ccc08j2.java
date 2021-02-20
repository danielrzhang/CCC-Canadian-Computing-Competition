import java.util.*;
import java.io.*;

public class ccc08j2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Character> songs = new ArrayList<Character>();
    boolean running = true;
    int b, n;
    songs.add('A');
    songs.add('B');
    songs.add('C');
    songs.add('D');
    songs.add('E');
    char song;
    char secondSong;
    
    while (running) {
      b = Integer.parseInt(in.readLine());
      n = Integer.parseInt(in.readLine());
      
      if (b == 4 && n == 1) {
        running = false;
      }
      
      else {
        if (b == 1) {
          for (int i = 0; i < n; i++) {
            song = songs.remove(0);
            songs.add(4, song);
          }
        }
        
        else if (b == 2) {
          for (int i = 0; i < n; i++) {
            song = songs.remove(4);
            songs.add(0, song);
          }
        }
        
        else if (b == 3) {
          for (int i = 0; i < n; i++) {
            song = songs.remove(0);
            secondSong = songs.remove(0);
            songs.add(0, secondSong);
            songs.add(1, song);
          }
        }
        
      }
    }
    for (int i = 0; i < 5; i++) {
      if (i == 4) {
        System.out.print(songs.get(i) + "\n");
      }
      else {
        System.out.print(songs.get(i) + " ");
      }
    }
  }
}