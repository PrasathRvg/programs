// Selection Sort in java;

public class SelectionSort
{
	public static void main(String []args)
	{
		int arr[]={5,3,2,1,4};
		int n=arr.length;
		select(arr,n);
	}
	public static void select(int arr[],int n)
	{
		int temp=0,min=0;
		for(int i=0;i<n-1;i++)
		{
			min=i;						//intial min value
			for(int j=i;j<n-1;j++)
			{
				if(arr[min]>arr[j+1])
					min=j+1;			//final min value
			}
			temp=arr[i];				//swapping
			arr[i]=arr[min];
			arr[min]=temp;

		}
			for(int a:arr)
				System.out.print(a);
	}
}