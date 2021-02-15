//Ques 11. Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks

class Bank{  
int getDetails(){
	int rateofinterest = 0;	
	return rateofinterest;
}  
}  

//Creating child classes.  
class SBI extends Bank{  
int getDetails(){
	int rateofinterest = 8;
	//System.out.println("Interest rate is:" +rateofinterest);
	return rateofinterest;
	
}  
}  
class BOI extends Bank{  
int getDetails(){
	int rateofinterest = 9;
	//System.out.println("Interest rate is:" +rateofinterest);
	return rateofinterest;
}  
}
class ICICI extends Bank{  
int getDetails(){
	int rateofinterest = 7;
	//System.out.println("Interest rate is:" +rateofinterest);
	return rateofinterest;
}  
} 
class Bank_11{  
public static void main(String args[]){  
SBI s=new SBI(); 
BOI b = new BOI();
ICICI i=new ICICI();  
  
System.out.println("SBI Details: "+s.getDetails() +"%interest");  
System.out.println("ICICI Details: "+i.getDetails() +"%interest");  
System.out.println("BOI Details: "+b.getDetails() +"%interest");  
}  
}  