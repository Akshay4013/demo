package stringPractice;

public class StringPalindram {

	public static void main(String[] args) {
		String str="madm";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindram");
		}else System.out.println("Not Palindram");
	}

}
