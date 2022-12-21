import java.util.Scanner;
public class Palindrome{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int flag=0;
    String str;
	System.out.println("Enter the String:");
    str = sc.nextLine();
    int len = str.length();
    for(int i=0; i<len/2 ; i++){
      if(str.charAt(i) != str.charAt(len-i-1)){
        flag =1;
        break;
      }
    }
    if(flag==1){
        System.out.println("Not A Palindrome");
    }
    else{
        System.out.println("Palindrome String");
    }
  }	
}
