import java.util.Scanner;
class Main
{
	public static void main(String args []) 	
{
	
	int n =7;
	Scanner input= new Scanner(System.in);
	System.out.println("Enter a Number: ");
	int Number= input.nextInt();
{
	for (int i = 1; i <= 7; i++)
	{
		for( int k = 6; k >= i; k--)
		{
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++)
		{
		System.out.print(j+" ");
	}
	System.out.print("\n");
}
}
}
}