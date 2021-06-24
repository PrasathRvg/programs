//output:
//p             h
//  r         t
//    a    a
//      s
//    a    a
//  r        t
//p            h

#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
	int n;
	// printf("Enter the n value:");
	// scanf("%d",&n);
    char str[8]={'p','r','a','s','a','t','h','\0'};
    // printf("Enter the string:");
    // scanf("%s",&str);
    printf("%d",strlen(str) );
    for(int i=0;i<strlen(str);i++)
    {
    	for(int j=0;j<strlen(str);j++)      
    	{                                   
             if(i==j)                       
             {                              
             	printf("%c",str[i]);        
             }
             else if(i+j==strlen(str)-1)
             {
             	printf("%c",str[j]);
             }
             else
             {
             	printf(" ");
             }

    	}
    	printf("\n");
    }
}
