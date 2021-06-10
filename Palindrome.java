import java.util.Scanner;
public class Palindrome
{
	public static void main(String []args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		//String rev="";
		boolean palindrome=true;
		for(int i=0,j=n.length()-1;i<j;i++,j--)
		{
				if(n.charAt(i)==n.charAt(j))
				{
					continue;
				}
				palindrome=false;
				break;
		}
		System.out.println(palindrome?"palindrome":"not palindrome");
	}
}