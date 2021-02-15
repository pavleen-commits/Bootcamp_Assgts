// Queestion 3: Write a program to find the number of occurrences of a character in a string without using loop?

public class Count_3
{
    public static void main(String[] args)
    {
        String str = "Java is java again java again";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in the given string is = "+count);
    }
}