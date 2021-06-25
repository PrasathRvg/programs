//hackerRank Question
//merge the two arrays and print them in an ascending order;
// input1	:a=[1,5,7,7],b=[0,1,2,3]
// output1	:0 1 1 2 3 5 7 7
// input2	:a=[1,2,3],b=[2,5,5]
//output2	:1 2 2 3 5 5

//without using any inbuild functions in this program;
public class MergeArray
{
	public static void main(String []args)
	{
		int []a={1,5,7,7};
		int []b={0,1,2,3};
		int []arr2=merge(a,b);
		for(int k:arr2)
			System.out.println(k);
	}
	public static int[] merge(int []a,int[]b)
	{
		int temp=0;
		int []arr=new int[a.length+b.length];

		for(int i=0;i<arr.length;i++)   		//merging the two arrays;
		{
			if(i>3)
			{
				arr[i]=b[i-a.length];
			}
			else
			{
				arr[i]=a[i];
			}
		}

		for(int i=0;i<arr.length;i++)			//sorting the array in ascending order;
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}


//another type of program;
// merge array using List in java(this programs contains more inbuild functions);

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class MergeArray
{
	public static void main(String []args)
	{
		List <Integer>a =new ArrayList<>();
		a.add(1);a.add(5);a.add(7);a.add(7);
		List <Integer>b=new ArrayList<>();
		b.add(0);b.add(1);b.add(2);b.add(3);
		List <Integer> arr=merge(a,b);
		System.out.print(arr);
	}
	public static List<Integer> merge(List <Integer>a,List <Integer>b)
	{
		int temp=0;
		List <Integer> li=new ArrayList<>();
		for(int i=0;i<(a.size()+b.size());i++)			//merging the two arrays;
		{
			if(i>3)
			{
				li.add(b.get(i-a.size()));
			}
			else
			{
				li.add(a.get(i));
			}
		}
		Collections.sort(li);				//sorting the array in ascending order
		return li;
	}
}
