package javaCode;
import java.util.*;
public class Fibonacci {
	static void fibonacci(int n) {
		int p=0, a1 = 0, a2 = 1;
		n = n-2;
		System.out.print(a1 + " " + a2 + " ");
		while(n != 0) {
			n--;
			p=a2+a1;
			a1=a2;
			a2=p;
			System.out.print(p + " ");
			
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		fibonacci(n);
	}
}
