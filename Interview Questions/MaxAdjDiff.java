/*
Interview Question:
	write a program to find the maximum difference betweeen two adjacent
numbers in an array of positive integers.
sample input:
	input1 : 5				//size of the array
	input2 : 10 11 7 12 14	//array of integers
sample output:
   	4
output Explanation:
	The difference between the integers 11 and 7 is 4 which is maximum compared to
any other adjacent numbers in the list as follows:
	10-11=-1
	11-7=4
	7-12=-5
	12-14=-2
*/


public class MaxAdjDiff
{
	public static void main(String []args)
	{
		int arr[]={10,11,7,12,14};
		//int arr[]={1,2,3,5};
		int n=arr.length;
		findMaxDifference(n,arr);
	}
	public static void findMaxDifference(int n,int arr[])
	{
		if(n<2)
		{
			System.out.println("can't find difference using one value");
			return;
		}
		int max=arr[0]-arr[1];
		for(int i=1;i<n;i++)
		{
			int count=0;
			count=arr[i-1]-arr[i];
			//System.out.println(" count="+count);
			if(count>max)
			{
				max=count;
			}	

		}
		System.out.println(max);
	}

}