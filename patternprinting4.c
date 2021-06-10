//output:
//4444
//4334
//4334
//4444
#include<stdio.h>
int main()
{
	int n;
	printf("enter the n value:");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
		printf("%d",n);
		for(int j=1;j<n-1;j++)
		{
			if(i==0)
			{                    
				printf("%d",n);  
			}                    
			else if(i==n-1)      
			{
				printf("%d",n);
			}
			else
			{
				printf("%d",n-1);
			}
		}
		printf("%d",n);
		printf("\n");
	}
}