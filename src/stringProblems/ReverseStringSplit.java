package stringProblems;

public class ReverseStringSplit {

	public static void main(String[] args) {
		String str="I Love India";
		String[] str1=str.split(" ");
		
		for(int i=0;i<=str1.length-1;i++)
		{
			String str2=str1[i];
			
			String rev=" "; 
			for(int j=str2.length()-1;j>=0;j--)
			{
				char ch=str2.charAt(j);
				rev=rev+ch;
			}
			System.out.print(rev);
		}
			
	}

}
