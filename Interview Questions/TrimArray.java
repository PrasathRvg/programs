//zoho question
//your are given an array that contains 1 or more integers and a numbers and a number k.
//Here is a little visualisation of the process:
//step1: [1,2,5,7,2,3,5,7,8]
//         /          \
//   [1,2,5,7] [2,3,5,7,8] 
// step2:put the arrays on top of each other
//   [1,2,5,7]
// [2,3,5,7,8]
// step3:Add them together
// [2,4,7,12,15]
// Repeat the above steps K number of times or until there is only one number left,and-
// then return the array.
// Example: 
// I/P:[1,2,3,4,5]:K=2
// O/P: [5,10]
// I/P:[0,1,2,3,4,5,6,7]:K=0
// O/P:[0,1,2,3,4,5,6,7]

import java.util.*;
public class TrimArray
{
	public static void main(String [] args)
	{
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<Integer>arr2=new ArrayList<>();
		ArrayList<Integer>arr3=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(7);
		arr.add(2);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(8);
		System.out.println("enter the k value:");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        Boolean b=true;
        arraySplitAndAdd(arr,arr2,arr3); //calling the arraySplitAndAdd method

        while(b)
        {
            if(k==(arr3.size())) //check the given value and list element are equal
            {
                System.out.println(arr3); //printing the final ArrayList value
                System.out.println("Successfully splitted");
            }
            else if(k==0) //if given k value is 0,then it prints the Arraylist and exits
            {
                System.out.println(arr);
                b=false;
            }
            else
            {
                arr.clear();
                for(int i=0;i<arr3.size();i++)
                    arr.add(arr3.get(i));    //copying the element from arr3 to arr
                arr3.clear();
                arr2.clear();
                arraySplitAndAdd(arr,arr2,arr3);   //again calling arraySplitAndAdd method to split and add the ArrayList
            }
        }
    }


    public static void arraySplitAndAdd(ArrayList<Integer> arr,ArrayList<Integer> arr2,ArrayList<Integer> arr3)
    {
    	int mid=arr.size()/2;	//mid value of arr
    	for(int i=0;i<arr.size();i++)
        {
        	if(i<mid)
        	{
        		arr2.add(i,arr.get(i));  //adding values to arr2
        	}
        	else
        	{
        		arr3.add(i-mid,arr.get(i)); //adding values to arr3
        	}
        }
        for(int i=1;i<arr3.size();i++)
        {
        	arr3.set(i,arr2.get(i-1)+arr3.get(i)); //combining the two ArrayList values
        }
    }
}
