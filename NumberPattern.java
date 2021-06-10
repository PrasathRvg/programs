import java.util.*;
public class NumberPattern //pyramid pattern with empty inside
{
	public static void main(String []args)
	{
		System.out.println("Enter the no.:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				
				if(j==1 || j==2*i-1)
					System.out.print("*");
				else if(i==n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}