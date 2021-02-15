// Ques 10: Write a single program for following operation using overloading
// A) Adding 2 integer number
// B) Adding 2 double
// C) multiplying 2 float
// D) multiplying 2 int
// E) concate 2 string
// F) Concate 3 String

class Overloading_10{

//A. addition method for 2 integers

void addition(int a,int b){

int sum=a+b;

System.out.println("Sum of two numbers is "+sum);

}

//B. addition method for 2 doubles

void addition(double a,double b){

double sum=a+b;

System.out.println("Sum of two numbers is "+sum);

}

//C. multiplication method for 2 floats

void multiply(float a,float b){

float prod=a*b;

System.out.println("Product of two numbers is "+prod);

}

//D. multiplication method for 2 integers

void multiply(int a,int b){

int prod=a*b;

System.out.println("Product of two numbers is "+prod);

}

//E. Concat 2 strings

void concat_str( String s1, String s2){

String result = s1+s2;

System.out.println("Concatenation of two strings is "+result);

}


//F. Concat 3 strings

void concat_str( String s1, String s2, String s3){

String result = s1+s2+s3;

System.out.println("Concatenation of two strings is "+result);

}


public static void main(String args[]){

Overloading_10 OV=new Overloading_10();

OV.addition(2,10);
OV.addition(15.2,10.6);


OV.multiply(23.5f, 33.0f);
OV.multiply(2, 3);

OV.concat_str("Pavleen", "Kaur");
OV.concat_str("Hello","Pavleen","Kaur");
}

}