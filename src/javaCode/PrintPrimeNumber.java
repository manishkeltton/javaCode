package javaCode;
import java.util.*;

public class PrintPrimeNumber {
    //Function check whether a number is prime or not
	static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		
		//check from 2 to n-1
		for(int i=2; i<n;i++)
			if(n%i == 0)
				return false;
		return true;
	}
	static void printPrime(int n) {
		for(int i=2;i<=n;i++) {
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

//T.C. = O(N*N)
