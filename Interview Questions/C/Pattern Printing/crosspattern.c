//output:
//   5       1
//     4   2 
//       3
//     2   4
//   1       5
#include<stdio.h>
int main()
{
	int n;
	printf("enter the n value:");
	scanf("%d",&n);
	int m=(n+1)/2;
	for (int i = 1;i<=n; i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==j)
			{
				if(i<m)                  
				{                        
					printf("%d",n-i+1);	 
				}                        
				else                    
				{
					printf("%d",i);
				}
				
			   
			}
			else if(i+j==n+1)				
			{
				if(i<m)
				{
					printf("%d",i);

				}
				else
				{
					printf("%d",j);
				}



			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
}
