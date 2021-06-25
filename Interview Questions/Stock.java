//stock value interview program
//example:
// input:
// 5	#first line of input is contains n is no. of array size
// 10 5 7 88 19 	#the 2nd line of input conatains integers of stock values 
// 3	#the 3rd line of input consists of integer value,represents the value which to find the stock price
// output:
// 10   #explanation:the sorted input values are [5,7,10,19,88].so the 3rd smallest stock price is 10



public class Stock
{
	public static void main(String[]args)
	{
		int n=5;
		int []stock={10,5,7,88,19};
		int K=3;
		System.out.println(answer(stock,K));
	}
	public static int answer(int []stock,int K)
	{
		int answer;
		int temp=0;
		for(int i=0;i<stock.length;i++)	//sorting the array in ascending order
		{
			for(int j=i+1;j<stock.length;j++)
			{
				if(stock[i]>stock[j])
				{
					temp=stock[i];
					stock[i]=stock[j];
				    stock[j]=temp;
				}
			}
		}
		answer=stock[K-1];	
		return answer;
	}
}
