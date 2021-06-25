import java.util.Scanner;
public class StringSpace
{
	public static void main(String[]args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=0;i<n.length();i++)
		{
			System.out.print(n.charAt(i)+" ");
		}
	}
}
