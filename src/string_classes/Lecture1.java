 package string_classes;

public class Lecture1 {

	public static void main(String[] args) {
		String s="akshay";
		String s1=s.concat(" khedkar");
		String s3="akshay";
		String s4="Akshay";
		System.out.println("1:)"+s.length());
		System.out.println("2:)"+s.indexOf('a'));
		System.out.println("3:)"+s.lastIndexOf('a'));
		System.out.println("4:)"
				+ ""+s.charAt(3));
		System.out.println("5:)"+s.toUpperCase());
		System.out.println("6:)"+s4.toLowerCase());
		boolean Result=s.equals(s3);
		boolean Result3=s1.equals(s4);
		boolean Result1=s.equalsIgnoreCase(s4);
		System.out.println("7:)"+Result +Result1 +Result3);
		System.out.println("8:)"+s.contains("z"));
		System.out.println("9:)"+s.isEmpty());
		//to merge 2 strings 
		String ss=s.concat(s4);
		System.out.println("10"+ss);
		String sss=s4.concat("  Khedkar");
		System.out.println("11"+sss);
		System.out.println(s.startsWith("a"));
		System.out.println(s.endsWith("y"));
		
		

	}

}
