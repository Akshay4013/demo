package stringProblems;

public class StringPalindram {

	public static void main(String[] args) {
		String str="MADAM";
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
		char	ch=str.charAt(i);
				rev=rev+ch;
		}
		System.out.println(rev);
		if(str.equals(rev))
			System.out.println("Palindram");
		else
			System.out.println("Not Palindram");
	}

}
