import java.util.Scanner;
public class Fibonacci
{
	public static void main(String []args)
	{
		System.out.print("enter the n value:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num1=1,num2=1;
		int sum=num1+num2;
		int i=0;
		while(i<n)
		{
			num1=num2;
        	num2=sum;
        	sum=num1+num2;
        	// if(sum>n) //if you want between n no.'s
        	// 	break;
        	System.out.print(" "+sum);
        	i++;
		}
	}
}