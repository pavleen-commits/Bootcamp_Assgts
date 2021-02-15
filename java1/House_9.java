//Ques 9: Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

enum House {
   LuthraMansion(900), MalhotraProperties(2), DiyaApartments(50);
   private int price;
   House(int p) {
      price = p;
   }
   int getPrice() {
      return price;
   } 
}
public class House_9 {
   public static void main(String args[]){
      System.out.println("All car prices:");
      for (House h : House.values()) System.out.println(
         h + " costs " + h.getPrice() + " thousand dollars.");
   }
}