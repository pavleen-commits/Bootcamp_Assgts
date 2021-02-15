//Question 1: Write a program to replace a substring inside a string with other string ?

public class ReplaceString_1 {
	public static void main(String args[]) {
		String str="Hello World";
		//Java String replace() method replaces every occurrence of a given character with a new character and returns a new string. 
		System.out.println( str.replace( 'H','W' ) );
		//Java String replaceFirst() method replaces ONLY the first substring which matches a given regular expression.
		System.out.println( str.replaceFirst("He", "Wa") );
		//Java String replaceAll() method finds all occurrences of sequence of characters matching a regular expression and replaces them with the replacement string
		System.out.println( str.replaceAll("He", "Ha") );
	}
}