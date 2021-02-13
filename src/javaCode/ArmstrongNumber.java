package javaCode;
import java.util.*;

public class ArmstrongNumber {

	static void armstrong(int n) {		
		int count = 0;
		int p = n, a = n;
		while(n != 0) {
			n=n/10;
			count++;
		}

		int q;
		int t =0;
		while(p != 0) {
			q = p%10;
			p = p/10;
			t = t + (int)Math.pow(q, count);
			
		}
		if(t == a) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
	}
	
	public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n = scn.nextInt();
           armstrong(n);
	}

}
