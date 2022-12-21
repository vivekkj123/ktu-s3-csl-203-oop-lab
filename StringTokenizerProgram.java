import java.util.*;
class StringTokenizerPrgram{
	public static void main(String [] args){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers seperated by Spaces: ");
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		while(st.hasMoreTokens()){
			String temp = st.nextToken();
			int n = Integer.parseInt(temp);
			System.out.println(n);
			sum = sum + n;
		}
		System.out.println("Sum: " + sum);
}
}
