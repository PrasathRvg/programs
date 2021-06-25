import java.util.*;
public class PlayingWithDates
{
	public static void main(String []args)
	{
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		showDate(str);
	}
	public static void showDate(String str)
	{
		String []splitted=str.split(" ");   //used a single space to split the string when single space occurs;
		String date=(splitted[0]).replaceAll("\\D+","");
		String month=splitted[1];
		String year=splitted[2];
		HashMap<String,String> mon=new HashMap<String,String>();
		mon.put("Jan","01");
		mon.put("Feb","02");
		mon.put("Mar","03");
		mon.put("Apr","04");
		mon.put("May","05");
		mon.put("Jun","06");
		mon.put("Jul","07");
		mon.put("Aug","08");
		mon.put("Sep","09");
		mon.put("Oct","10");
		mon.put("Nov","11");
		mon.put("Dec","12");
		System.out.println(year+"-"+mon.get(month)+"-"+date);
	}
}
