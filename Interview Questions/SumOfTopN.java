import java.util.*;
public class SumOfTopN
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no. of participants");
		int N=sc.nextInt();
		System.out.println("enter the no.top values:");
		int K=sc.nextInt();
		int [] arr=new int[N];
		int b=0;
		for(int i=0;i<N;i++)
		{
			System.out.println("enter the array value:");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=N-1;i>K-1;i--)
		{
			b+=arr[i];
		}
		System.out.print(b);
	}
}
