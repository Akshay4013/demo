package stringPractice;

public class ReverseString
{

	public static void main(String[] args)
	{
		String s1="KHEDKAR AKSHAY";
		String[] s2=s1.split(" ");
		
		for (int i=0;i<s2.length-1;i++)
		{
			String s3=s2[i];
			
			String rev=" ";
			for(int j=s3.length()-1;j>=0;j--)
			{
				char ch=s3.charAt(j);
				rev=rev+ch;
			}
			System.out.println(rev);
		}

	}
}
