package Strings;

public class String16functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GeeksforGeeks";
		
		//Find the length of the string and return int
		System.out.println("Length of the String:" + str.length());
		
		//Find the character at index of String and return Character
		System.out.println("Character at index:" + str.charAt(4));
		
		//Find the part of the string after the index and returns the string
		System.out.println("String after the index:" + str.substring(3));
		
		//Find the part of the string after start index until last index - 1 and returns the String
		System.out.println("Substring between the start and end index:" + str.substring(3, 5));
		
		//Do string concatenation and returns string
		String s1 = "Geeks";
		String s2 = "forGeeks";
		System.out.println("Strings after concatination:" + s1.concat(s2));
		
		//indexOf returns the start index of the string mentioned and return int
		String str_new = "Happy coding praveen";
		System.out.println("Index of string : " + str_new.indexOf("coding"));
		
		//indexOf(String s, int index) returns the index of string starts with the index and return int
		System.out.println("Index of string starts with index:" + str_new.indexOf("a", 3));
		
		//lastIndexOf returns the last index of
		System.out.println("Last Index of String with character:" + str_new.lastIndexOf('n'));
		
		//Boolean equals and returns boolean true or false
		System.out.println("Return boolean value :" + s1.equals(s2));
		
		//Boolean equals ignore case and returns boolean true or false
		System.out.println("Return boolean value :" + s1.equalsIgnoreCase(s2));
		
		//compareTo compare two strings lexicographically and returns the int value <0 if s1 comes before s2 =0 if s1 and s2 equal >0 if s1 comes after s2
		System.out.println("Returns int value:" + s1.compareTo(s2));
		
		//compareIgnorecase
		System.out.println("Returns int value:" + s1.compareToIgnoreCase(s2));
		
		//toLowerCase
		System.out.println(str.toLowerCase());
		
		//toUpperCase
		System.out.println(str.toUpperCase());
		
		//trim function
		String str_need_trim = " Geeks for Geeks   ";
		System.out.println(str_need_trim.trim());
		
		//replace function
		System.out.println(str_need_trim.replace(" ", "$"));
		System.out.println();
		
	}

}
