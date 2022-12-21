import java.util.Scanner;
class MatrixMul{
	public static void main(String [] args)
	{	
		Scanner sc = new Scanner(System.in);
		// Input First Matrix from user
		System.out.println("Enter no. of rows of first matrix");
		int m1 = sc.nextInt();
		System.out.println("Enter no. of columns of first matrix");
		int n1 = sc.nextInt();
		int A[][] = new int[m1][n1];
		for(int i=0; i<m1; i++)
		{
			for(int j=0; j<n1; j++)
			{
				System.out.print("A["+i+"]["+j+"]"+"=");
				A[i][j] = sc.nextInt();
			}
		}
		// Input Second Matrix from user
		System.out.println("Enter no. of rows of Second matrix");
		int m2 = sc.nextInt();
		System.out.println("Enter no. of columns of Second matrix");
		int n2 = sc.nextInt();
		int B[][] = new int[m2][n2];
		for(int i=0; i<m2; i++)
		{
			for(int j=0; j<n2; j++)
			{
				System.out.print("B["+i+"]["+j+"]"+"=");
				B[i][j] = sc.nextInt();
			}
		}
		// m2!=n1 , matrix multiplication not possible
		if(m2==n1){
		int C[][] = new int[m1][n2];
		for(int i=0; i<m1; i++)
		{
			for(int j=0; j<n2; j++)
			{
				C[i][j] = 0;
				for(int k=0; k<m2; k++)
				{
					C[i][j] += A[i][k]*B[k][j];
				}
			}
		}
		// Display the resultant matrix
		for(int i=0; i<m1; i++)
		{
			for(int j=0; j<n2; j++)
			{
				System.out.print(C[i][j] + "\t");
			}
			System.out.println("");
		}
		}else{
			System.out.println("Matrix Multiplication is not possible");
		}
	}
}
