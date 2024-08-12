import java.util.Scanner;
class frequency
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string");
		String str =s1.nextLine();
		int[] freq=new int[256];
		for(char c:str.toCharArray())
		{		
			freq[c]++;
		}
		for(int i=0;i<256;i++)
		{
			if(freq[i]>0)
			{
				System.out.println((char)i+": "+freq[i]);
			}	
		}
		s1.close();
	}
}
