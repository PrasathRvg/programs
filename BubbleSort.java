//BubbleSort in java;

import java.util.*;
public class BubbleSort
{
	public static void main(String[]args)
	{
		int arr[]={5,3,2,1,4};
		int n=arr.length;
		sort(arr,n);
	}
	public static void sort(int arr[],int n)
	{
		int temp=0;
		for(int i=0;i<n;i++)
		{								//comparisons
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];		//swapping
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}

			}
		}
		for(int a:arr)
			System.out.print(a);
	}
}