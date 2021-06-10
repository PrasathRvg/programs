public class CandySpecialValue
{
	public static void main(String []args)
	{
		// int [] no={100,20,40,20,50,50};
		// int n=4;
		int [] no={26,20,23};
		int n=2;
		System.out.println(maxValue(no,n));
	}
	public static int maxValue(int [] no,int n)
	{
		int temp=0;
		int [] arr=new int[100];
		for(int i=0;i<no.length;i++)
		{
			for(int j=i+1;j<no.length;j++)
			{
				if(no[i]<no[j])
				{
					temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
			}
		}
		return no[n-1];
	}
}