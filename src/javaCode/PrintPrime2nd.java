package javaCode;
import java.util.*;
public class PrintPrime2nd {
       static boolean isPrime(int n) {
    	   if(n<=1)
    		   return false;
    	   if(n<=3)
    		   return true;
    	   //This is checked so that we can skip middle five numbers in below loop
    	   if(n%2 == 0 || n%3 == 0)
    		   return false;
    	   for(int i=5; i*i<n; i=i+6)
    		   if(n%i==0 || n%(i+2)==0)
    			   return false;
    	   return true;
       }
       static void printPrime(int n) {
    	   for(int i=2; i<=n;i++) {
    		   if(isPrime(i))
    			   System.out.print(i + " ");
    	   }
       }
	public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           printPrime(n);
	}

}

//T.C. = O(N^3/2)

