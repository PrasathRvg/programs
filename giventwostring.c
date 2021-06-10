//input1:enter the first string:prasath
//input2:enter the second string:pradfth
//output:s,d
//       a,f
#include<stdio.h>
#include<string.h>
int main()
{
	char s1[100],s2[100];
	printf("enter the first string:");
	scanf("%s",&s1);
	printf("enter the second string:");
	scanf("%s",&s2);
	for(int i=0;i<strlen(s1);i++)
	{
		if(!(s1[i]==s2[i]))   //if the given two string characters are not equal
		{
			printf(" %c, %c \n",s1[i],s2[i]);
		}
	}
	return 0;
}