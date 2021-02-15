//Question 6:  There is an array with every element repeated twice except one. Find that element

// XOR of all array elements gives us the number with single occurrence. The idea is based on following two facts.
// a) XOR of a number with itself is 0.
// b) XOR of a number with 0 is number itself.
// c) XOR is addititive as well as commutative.  

class SingleOcc_6 
{ 
    
    static int findSingle(int ar[], int ar_size) 
    { 
        // Do XOR of all elements and return 
        int res = ar[0]; 
        for (int i = 1; i < ar_size; i++) 
            res = res ^ ar[i]; 
      
        return res; 
    } 
  
 
    public static void main (String[] args) 
    { 
        int ar[] = {7, 3, 2, 5, 4, 9, 5, 3, 4, 2, 9}; 
        int n = ar.length; 
        System.out.println("Element occurring once is " + 
                            findSingle(ar, n) + " "); 
    } 
}