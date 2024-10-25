package test;

public class Strings {

	public static void main(String[] args) {
		
		String s = "  Java is programming language  ";
		
		System.out.println("startsWith() = " + s.startsWith("Java"));
		System.out.println("endsWith() = " + s.endsWith("language"));
		System.out.println("substring() = " + s.substring(8));
		System.out.println("indexOf() = " + s.indexOf("programming"));
		System.out.println("length before = " + s.length());
		System.out.println("length after trim() = " + s.trim().length());
		System.out.println("charAt() = " + s.charAt(8));
		System.out.println("toLowerCase() = " + s.toLowerCase());
		System.out.println("toUpperCase() = " + s.toUpperCase());
		System.out.println("John.equals(John) = " + "John".equals("John"));
		System.out.println("John.equalsIgnoreCase(JOHN) = " + "John".equalsIgnoreCase("JOHN"));
		System.out.println("Apple.compareTo(Banana) = " + "Apple".compareTo("Banana"));
		
		String[] strArr = s.split(" ");
		for(String str: strArr) {
			System.out.println(str);
		}
		System.out.println("String Arr Length = " + strArr.length);
		System.out.println("replace() = " + s.replace('g', 'G'));
	}
}
