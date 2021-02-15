//Ques 8:  Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer

public class RevString_8 {
    public static void main(String args[]) {
        //Using StringBuffer
        String word = "HelloWorld";
        String reverse = new StringBuffer(word).reverse().toString();
	//Reversing the String
        System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
	//Removing Characters from Index 4-9.
	StringBuffer del = new StringBuffer(reverse);
	System.out.println(del.delete(4,9));
 
 
    }
   
}


