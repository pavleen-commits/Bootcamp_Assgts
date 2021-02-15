//Ques 7: Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively

class Static_7{
    
   static String firstname;
   //static block	
   static{
      firstname = "Pavleen";
   }
   
   //static method
   static String lastname = "Kaur";
   static void display()
   {
  	System.out.println("Value of LastName is " +lastname);
   }
   //static variable
   static int age = 21;
   public static void main(String args[])
   {
      //Static_7 obj = new Static_7();
      System.out.println("Value of FirstName is: " +firstname);
      display();
      System.out.println("Value of My Age is: "+age);
   }
}