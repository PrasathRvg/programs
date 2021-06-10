import java.util.*;
public class PrimeNumber
{
	public static void main(String []args)
	{
		System.out.println("enter the n value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int low=5;
		while(low<n)
		for(int i=2;i<low/2;i++)
		{
			if(low%i==0)
			{
				System.out.println(low+"");
			}
			low++;
		}
	}
}