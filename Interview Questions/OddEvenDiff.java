/*
Interview Question:
	write a program to return the difference between the sum of odd numbers
and even numbers from an array of positive integers.
sample input:
	input1 : 5				//size of the array
	input2 : 10 11 7 12 14	//array of integers
sample output:
	-18
output Explanation:
	 The calculation of difference between sum of odd and even numbers
is a follows:  	(11+7)-(10+12+14)=18-36=-18 .
*/

public class OddEvenDiff
{
	public static void main(String[]args)
	{
		int arr[]={10,11,7,12,14};
		int n=arr.length;
		System.out.println(findOddEvenDifference(n,arr));	
	}
	public static int findOddEvenDifference(int n,int arr[])
	{
		int odd=0,even=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
				even+=arr[i];
			else
				odd+=arr[i];
		}
		return odd-even;
	}
}