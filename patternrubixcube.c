#include<stdio.h>
int main()
{
	int i,j,n,c=1,s,a[100][100];
	printf("enter the n value:");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		if(i%2==0)
		{
			for(j=n-1;j>=0;j--)
			{
				a[j][i]=c++;
				//printf(" %d ",a[j][i]);
			}
		}
		else
		{
			for(j=0;j<n;j++)
			{
				a[j][i]=c++;
				//printf(" %d ",a[j][i]);
			}
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("  %d  ",a[i][j]);
		}
		printf("\n");
	}
	return 0;
}