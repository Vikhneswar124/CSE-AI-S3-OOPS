import java.util.*;
import java.lang.*;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str,rev="";
		System.out.println("enter the word:");
		str=sc.nextLine();
		int length=str.length();
		for(int i=length-1; i>=0; i--)
		{	
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println(str+ " is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrome");
		}
		sc.close();
	}
}
