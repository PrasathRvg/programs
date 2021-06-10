//input:abcdefghij output:
//a	  b	   c   d
//
//         e
//
//    f
//
//g   h    i   j

#include<stdio.h>
int main()
{
	int n,f;
	char str[100];
	printf("enter the string:");
	scanf("%s",&str);	
	for(n=0;str[n];n++);
		f=n%3==1;
	    if(f)
	     {
	     	//printf("yes")
	     	for(int i=0;i<=n/3;i++)
	     	{
	     		for(int j=0;j<=n/3;j++)
	     		{
	     
	     			printf("%c ",((i==0)||(i==n/3)||(i+j==n/3))? str[i+j+i]:' ');
	     			
	     		}
	     		printf("\n");
	     	}
	     }
	    else
	     {
	     	printf("no");
	     }





	return 0;

}