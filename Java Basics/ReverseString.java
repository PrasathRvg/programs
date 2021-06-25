import java.util.Scanner;
public class ReverseString  //reverse the given input and string
{
	public static void main(String []args)
	{
		System.out.println("Enter the string to be reversed:");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		for(int i=n.length()-1;i>=0;i--)
			System.out.print(n.charAt(i));
	}
}
