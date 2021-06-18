public class MergeSort
{
	public static void main(String []args)
	{
		int arr[]={9,5,7,8,3,4,1};
		int n=arr.length;
		sort(arr,0,n-1);
		for(int a:arr)
			System.out.println(a);			
	}


	public static void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}


	public static void merge(int arr[],int low,int mid,int high)
	{
		int p=low,q=mid+1,k=0;
		int arr2 []=new int [arr.length];
		for(int i=low;i<=high;i++)
		{
			if(p>mid)
				arr2[k++]=arr[q++];
			else if(q>high)
				arr2[k++]=arr[p++];
			else if(arr[p]>arr[q])
				arr2[k++]=arr[q++];
			else
				arr2[k++]=arr[p++];
		}
		for(int j=0;j<k;j++)
		{
			arr[low++]=arr2[j];
		}
	}
}