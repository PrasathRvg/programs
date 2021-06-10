import java.util.Scanner;
public class ReverseStringAtoz   //reverse only the alphabet strings
	{
	public static void main(String []args)
	{
		System.out.println("Enter the string to be reversed:");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String str="";
		boolean string=true;
		for(int i=n.length()-1;i>=0;i--)
		{
			if(((n.charAt(i)>='a')&&(n.charAt(i)<='z'))||((n.charAt(i)>='A')&&(n.charAt(i)<='Z')))
				str+=n.charAt(i);
			else
				string=false;
		}
		if(string)
		{
			for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i));
		}
		else
			System.out.println("Enter the correct string");
	}

}