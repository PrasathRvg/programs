import java.util.*;
public class calcJava
{
	public static void main(String [] args)
	{
		double total;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the equation");
		double num1=sc.nextDouble();
		char op=sc.next().charAt(0);
		double num2=sc.nextDouble();
		switch(op)
		{
			case '+':
				total=(num1+num2);
				System.out.println((int)total);	
				break;

			case '-':
				total=(num1-num2);
				System.out.println((int)total);
				break;

			case '*':
				total=(num1*num2);
				System.out.println((int)total);
				break;

			case '/':
				total=num1/num2;
				System.out.println(total);
				break;

			case '%':
				total=num1%num2;
				System.out.println(total);
				break;
			
			default:
				System.out.println("doesn't match");

		}
		

	}
}
