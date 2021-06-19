/*
Interview Question:

	write a function that will take a string as input,for every 3rd character,
it should convert it to uppercase if the previous character is NOT a vowel.it 
should return converted string.

sample input :"stay home stay safe";
sample output:"stAy HomE sTay safe";

*/

public class StringVowel
{
	public static void main(String []args)
	{
		String str="stay home stay safe";
		int n=3;
		convert(str,n);
	}
	public static void convert(String str,int n)
	{
		int len=str.length();
		StringBuffer s=new StringBuffer(str);
		for(int i=n;i<=len;i=i+n)
		{
			char c=str.charAt(i-2);
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')	
			{
				s.setCharAt((i-1),((char)(s.charAt(i-1)^32)));	//a tip at end of the program;
			}
		}
		System.out.println(s);
	}
}

//ref for ^32:https://stackoverflow.com/a/61975140