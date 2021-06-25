//you are given a number.find the largest two digit number consisting of two different digits containing withthin with the given numbers. 
// input1	:64998434 	//the output of the integer digits in even no. size 
// output1	:84 		//the output is given logically from the input,think and get the output;
// input2	:3001213 	//the output of the integer digits in odd no. size
// output2	:30
public class LargestTwoDigit
{
	public static void main(String []args)
	{
		int n=64998434;
		Large(n);
	}
	public static void Large(int n)
	{
		int [] arr=new int[4];
		int a,b=n,c,temp=0,len;
		len=(""+n).length()/2;		//tip:here i used <""+n.length()> [n->varible name]  to find the length of the digits in the integer value.
		if(len%2!=0)
			len+=1;


		for(int i=len-1;i>=0;i--)	//its works when the given input integer is in odd no. size;
		{
			if(((""+n).length()/2)%2!=0)
			{
				if(i==3)
				{
					a=b%10;
					arr[i]=a;
					b=b/10;
					continue;
				}
			}
			a=b%100;	//splitting the given input integers by two digits if it is in even no. size;
			arr[i]=a;
			b=b/100;
		}


		for(int i=0;i<len;i++)	//sorting the integer array
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}


		for(int i=0;i<len;i++)	
		{
			if(arr[i]/10==arr[i]%10)	//checking the largest two digits where having equal digit no.'s;
			{
				continue;
			}
			else
			{
				System.out.print(arr[i]);	//printing the largest two digit no. ;
				break;
			}
		}
	}
}
