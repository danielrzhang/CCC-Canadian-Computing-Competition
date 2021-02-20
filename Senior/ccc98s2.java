public class ccc98s2 {
  public static void main(String[] args) {
    for (int i = 1000; i <= 9999; i++) {
      int multiplier = 0;
      for (int j = 1; j < i; j++) {
        if (i % j == 0) {
          multiplier += j;
        }
      }
      
      if (i == multiplier) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
    for (int k = 100; k <= 999; k++) {
      int sum = 0;
      int copyK = k;
      int doubleCopyK = k;
      while (copyK > 0) {
        int digit = copyK % 10;
        int powerThree = (int) (Math.pow(digit, 3));
        sum += powerThree;
        copyK /= 10;
      }
      if (sum == doubleCopyK) {
        System.out.print(doubleCopyK + " ");
      }
    }
    System.out.println();
  }
}