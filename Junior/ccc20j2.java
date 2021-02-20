import java.io.*;
import java.util.*;

public class ccc20j2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int maxInfect = in.nextInt();
        int startNum = in.nextInt();
        int multiplyNum = in.nextInt();
        
        int infectCounter = 0;
        int dayCounter = -1;
        
        while (infectCounter <= maxInfect) {
          infectCounter += startNum;
          startNum *= multiplyNum;
          dayCounter++;
        }
        System.out.println(dayCounter);

    }
}