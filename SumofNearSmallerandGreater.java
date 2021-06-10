import java.util.*;
public class SumofNearSmallerandGreater
{
	public static void main(String[]args)
	{
		System.out.println("Enter the N value:");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int [] arr={1,5,2,3,8};
		int sum;
	    for(int i=0;i<arr.length;i++)
		{
		    sum=sum(arr[i],arr);
			System.out.print(sum +" ");
		}   
	}


	public static int sum(int x,int [] arr)
	{
		int min=0,max=0;
		ArrayList<Integer> arr2=new ArrayList<>();
		ArrayList<Integer> arr3=new ArrayList<>();
		arr2.clear();
		arr3.clear();
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]>x)
			{
				arr2.add(arr[i]);
				Collections.sort(arr2);
				max=arr2.get(0);
			}
		}
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]<x)
			{
				arr3.add(arr[i]);
				Collections.sort(arr3);
				min=arr3.get(arr3.size()-1);
			}
		}
		return max+min;
	}
}