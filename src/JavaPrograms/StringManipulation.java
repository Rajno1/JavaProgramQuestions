package JavaPrograms;

public class StringManipulation {

	public static void main(String[] args) {
		String text = "This is my first iphone";
		String text1 = "This is my first Iphone";
		
		System.out.println(text.length());
		
		System.out.println(text.charAt(12));
		
		System.out.println(text.indexOf('s')); // 1st occurance of 's'
		
		System.out.println(text.indexOf('s',text.indexOf('s')+1));  // 2nd occurance of 's'
		
		System.out.println(text.indexOf('s', text.indexOf('s',text.indexOf('s')+1)+1)); //3rd occurance of 's'
		
		System.out.println(text.indexOf("iphone"));
		
		System.out.println(text.indexOf("Raj")); // it will throw -1
		
		//string comparision
		
		System.out.println(text.equals(text1));
		
		System.out.println(text.equalsIgnoreCase(text1));
		
		//substring
		
		System.out.println(text.substring(0, 18)); 
		//Note: 18 th index it cannot print
		
		//trim
		String s = "  Hello World  ";
		System.out.println(s.trim());  
		//Note: trim can remove only before space and after space not the middle one.
		
		System.out.println(s.replace(" ", ""));  
		//Note: with replace method we can remove middle space as well 
		
		String date = "27-07-2019";
		System.out.println(date.replace('-','/'));
		
		
		//spliting 
		
		String msg = "This_is_My_First_Laptop";
		String msg1[]= msg.split("_"); 
		//Note: .split() returns 'string[]' so we store the value in string array variable
		for (int i = 0; i < msg1.length; i++) {
			System.out.println(msg1[i]);
		}
		
		//concatinate
		
		String s2 ="iphon";  
		//Note: by using concatinate we can add a char and word to the current string 
		System.out.println(s2.concat("e"));
		System.out.println(s2.concat(" world"));
		
		
		
	}
	/**
	 * 1. length() - To get length of a string (NOT .size() is for ArrayList (or ) for list objects)
2. charAt() -  To get the value located at particular/specific index.
3. indexOf() - To get the index of specific value/character
 	 If we have same multiple characters in a string ‘.indexOf()’ will print the -1st occurrence of the value. learn how to get 2nd & 3rd occurrence also
	Note: by using ‘indexOf()’ if you want to print index of a string “iphone” it will print index of starting of letter i.e index of ‘i’.
	Note: if you try to print a word , which is not listed in sting you declared, it WON’T through an exception and will print “-1” on console 
4. equal/equalsIgnoreCase() – To do String Comparison.
5. SubString() – subSting() method will take ‘starting index & ending index’ values as arguments and will print that portion of string 
Note: ‘subSting()’ WON’T print the value of ending index.
6. trim() – By using ‘trim()’ we can remove the white spaces before and after the string.
Note: NOT the space between the strings.
7. replace() – we can remove the space between the stings by using ‘replace()’
8. split() – it is used to split the string 
9. concat() – this method is used to add char (or) string
10. String Concatenation using + operator

	 */

}
