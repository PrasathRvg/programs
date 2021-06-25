/*
Interview question:
	Given am array arr[] of size N and an integer k.Find the maximum for each and
every contiguous subarray of size k.

sample input:
			9			//value of N=9
			3 			//value of k=3
			123145236 	//value of arr[]=123145236

sample output:
			3 3 4 5 5 5 6

sample output Explanation:
	1st contiguous subarray={1,2,3} max=3
	2st contiguous subarray={2,3,1} max=3
	3st contiguous subarray={3,1,4} max=4
	4st contiguous subarray={1,4,5} max=5
	5st contiguous subarray={4,5,2} max=5
	6st contiguous subarray={5,2,3} max=5
	7st contiguous subarray={2,3,6} max=6
*/

public class MaxSize
{
	public static void main(String []args)
	{
		int arr[]={1,2,3,1,4,5,2,3,6};
		int n=arr.length;
		int k=3;
		split(arr,n,k);
	}


	public static void split(int arr[],int n,int k)
	{
		int arr2[]=new int [k];
		for(int i=0;i<n-(k-1);i++)		
		{
			int no=0;
			for(int j=i;j<k+i;j++)	//splitting the array
			{
				arr2[no++]=arr[j];
			}
			insSort(arr2,k);
		}
	}


	public static void insSort(int arr2[],int k) //insertion Sort algorithm
	{
		int temp=0;
		int n=arr2.length;
		for(int i=1;i<n;i++)
		{
			int val=i;
			for(int j=i;j>0;j--)
			{
				if(arr2[val]<arr2[j-1])
				{
					val=j-1;
					temp=arr2[j];
					arr2[j]=arr2[val];
					arr2[val]=temp;
				}
			}
		}
		getMax(arr2,k);		
	}


	public static void getMax(int arr2[],int k)
	{
		System.out.print(arr2[k-1]);	//printing the max value
	}

}
