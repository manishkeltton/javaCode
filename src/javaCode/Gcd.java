package javaCode;
import java.util.*;
public class Gcd {

	public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int a = scn.nextInt();
           int b = scn.nextInt();
           int d;
           while(true) {
        	   d = b;
        	   b = a%b;
        	   a = d;
        	   if(b == 0) {
        		   break;
        	   }
           }
           System.out.println(a);
	}

}
