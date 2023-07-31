package stringPractice;

public class ReverseStringDemo {

	public static void main(String[] args)
	{
		String st1="AkshayKhedkar";
		int n=st1.length();
		String rev="";
		for (int i=n-1;i>=0;i--)
		{
			char ch=st1.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}

}
