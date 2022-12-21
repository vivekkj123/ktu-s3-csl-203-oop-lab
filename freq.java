import java.util.*;

public class freq {
  public static void main(String args[]) {
    int len, freq = 0;
    char letter;
    String s1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");
    s1 = sc.nextLine();
    System.out.println("Enter the character");
    letter = sc.nextLine().charAt(0);
    len = s1.length();
    for (int i = 0; i < len; i++) {
      if (s1.charAt(i) == letter) {
        freq++;
      }
    }
    System.out.println("The frequency of the character is " + freq);
  }
}
