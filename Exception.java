import java.util.Scanner;
class Exception{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Program to perform Division");
			System.out.println("Enter Number 1: ");
			int a = sc.nextInt();
			System.out.println("Enter Number 2: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Result = "+ c);
		
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		
		}
		finally{
			System.out.println("End of Operation");
		}
	}


}
