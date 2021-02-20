import java.util.*;
import java.io.*;

public class ccc99s1 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> cards = new ArrayList<String>();
    
    int aCounter = 0;
    int bCounter = 0;
    int turnCounter = 0;
    
    for (int i = 0; i < 52; i++) {
      cards.add(in.readLine());
    }
    
    for (int i = 0; i < 52; i++) {
      if (cards.get(i).equals("ace") && i <= 47) {
        for (int j = i + 1; j <= i + 4; j++) {
          if (cards.get(j).equals("ace") || cards.get(j).equals("king") || cards.get(j).equals("queen") || cards.get(j).equals("jack")) {
            break;
          }
          if (j == i + 4) {
            if (turnCounter == 0) {
              aCounter += 4;
              System.out.println("Player A scores 4 point(s).");
            }
            else {
              bCounter += 4;
              System.out.println("Player B scores 4 point(s).");
            }
          }
        }
      }
      else if (cards.get(i).equals("king") && i <= 48) {
        for (int j = i + 1; j <= i + 3; j++) {
          if (cards.get(j).equals("ace") || cards.get(j).equals("king") || cards.get(j).equals("queen") || cards.get(j).equals("jack")) {
            break;
          }
          if (j == i + 3) {
            if (turnCounter == 0) {
              aCounter += 3;
              System.out.println("Player A scores 3 point(s).");
            }
            else {
              bCounter += 3;
              System.out.println("Player B scores 3 point(s).");
            }
          }
        }
      }
      else if (cards.get(i).equals("queen") && i <= 49) {
        for (int j = i + 1; j <= i + 2; j++) {
          if (cards.get(j).equals("ace") || cards.get(j).equals("king") || cards.get(j).equals("queen") || cards.get(j).equals("jack")) {
            break;
          }
          if (j == i + 2) {
            if (turnCounter == 0) {
              aCounter += 2;
              System.out.println("Player A scores 2 point(s).");
            }
            else {
              bCounter += 2;
              System.out.println("Player B scores 2 point(s).");
            }
          }
        }
      }
      else if (cards.get(i).equals("jack") && i <= 50) {
        if (!cards.get(i + 1).equals("ace") && !cards.get(i + 1).equals("king") && !cards.get(i + 1).equals("queen") && !cards.get(i + 1).equals("jack")) {
          if (turnCounter == 0) {
            aCounter++;
            System.out.println("Player A scores 1 point(s).");
          }
          else {
            bCounter++;
            System.out.println("Player B scores 1 point(s).");
          }
        }
      }
      turnCounter = 1 - turnCounter;
    }
    System.out.println("Player A: " + aCounter + " point(s).");
    System.out.println("Player B: " + bCounter + " point(s).");
  }
}