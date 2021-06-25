//input:1 2 0 0 0 4
//output:1 2 4 0 0 0
#include<stdio.h>
int main()
{
	int arr1[100],arr2[100];
	int n=0,count=0;
    char ch;
    printf("Enter the integers:");
	while(scanf("%d%c",&arr1[n],&ch)>0 && ch!='\n')
	{
		n++;
	}
	n=n+1;
	for(int i=0;i<n;i++)
	{
		if(arr1[i]!=0)
		{
			arr2[count++]=arr1[i];
			// printf("%d",arr2[i]);
		}					
	}
	while(count<n)
		{
			arr2[count++]=0;
		}
	for(int j=0;j<n;j++)
	{
		printf("%d",arr2[j]);
	}
	return 0;
}  
