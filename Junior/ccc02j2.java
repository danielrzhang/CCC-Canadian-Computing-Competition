import java.io.*;

public class ccc02j2 {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str;
    String strOr;
    String letterBeforeOr;
    int length;
    
    do {
      str = in.readLine().toLowerCase();
      if (str.equals("quit!")) {
        break;
      }
      
      length = str.length();
      try {
        strOr = str.substring(length - 2, length);
        letterBeforeOr = str.substring(length - 3, length - 2);
        if (strOr.equals("or") && length >= 4 && (!letterBeforeOr.equals("a") && !letterBeforeOr.equals("e") && !letterBeforeOr.equals("i") && !letterBeforeOr.equals("o") && !letterBeforeOr.equals("u") && !letterBeforeOr.equals("y"))) {
          str = str.substring(0, length - 1) + "ur";
        }
      } catch (Exception e) {
      }
      
      System.out.println(str);
      
    } while (!str.equals("quit!"));
  }
}