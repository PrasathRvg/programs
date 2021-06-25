#include<stdio.h>
int binarysearch(int arr[],int x,int low,int high)
{
	while(low<=high)
	{
		int mid=low+(high-low)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		if(x<arr[mid])
		{
			high=mid-1;
		}
		else
		{
			low=mid+1;
		}	
	}
	if(arr[low]-x<x-arr[high])
	{
		return arr[low];
	}
	else
	{
		return arr[high];
	}
}
int main()
{
	int temp=0,s,x,arr[]={10,20,30,40,50};
	printf("enter the value");
	scanf("%d",&x);
	// for(int i=0;i<5;i++)
	// {
	// 	for(int j=0;i<5;j++)
	// 	{
	// 		if(arr[i]==arr[j])
	// 		{
	// 			temp=arr[i];
	// 			arr[i]=arr[j];
	// 			arr[j]=temp;
	// 			// printf("\n");
	// 		}
	// 	}
	// }
	// for(int i=0;i<5;i++)
	// {
	// 	printf("%d",arr[i]);
	// }
	int n=sizeof(arr)/sizeof(arr[0]);
	int result=binarysearch(arr,x,0,n-1);
	printf("%d",result);
	return 0;
}
