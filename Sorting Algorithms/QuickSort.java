public class QuickSort
{
	public static void main(String []args)
	{
		int arr[]={5,7,8,3,2,1};
		int n=arr.length;
		quickSort(arr,0,n-1);
		for(int a:arr)
			System.out.print(a);
	}
	public static int partition(int arr[],int start,int end)
	{
		int pivot=arr[start];
		int i=start+1;
		for(int j=start+1;j<=end;j++)
		{
			if(arr[j]<pivot)
			{
				swap(arr,i,j);
				i++;
			}
		}
		swap(arr,start,i-1);
		return i-1;
	}
	public static void quickSort(int arr[],int start,int end)
	{
		if(start<end)
		{
			int partitionval=partition(arr,start,end);
			quickSort(arr,start,partitionval-1);
			quickSort(arr,partitionval+1,end);
		}
	}
	public static void swap(int arr[],int a,int b)
	{
		int temp=0;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
}
