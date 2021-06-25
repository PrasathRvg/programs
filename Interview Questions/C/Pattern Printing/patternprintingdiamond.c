#include<stdio.h>
int main()
{
	int i,j,n,s=n,k;
	printf("Enter the n value:");
	scanf("%d",&n);
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<(n-2)-i;j++)
		{
			printf(" ");
		}
		for(j=0;j<i+1;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
	for(i=0;i<n-1;i++)
	{
		//printf("*");
		for(j=0;j<i;j++)
		{
			printf(" ");
		}
		for(j=0;j<n-i-1;j++)
		{
			printf("* ");
		}
		printf("\n");
	}
	return 0;
}


