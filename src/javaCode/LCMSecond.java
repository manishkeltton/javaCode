package javaCode;
import java.util.*;
public class LCMSecond {

	public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int n1 = scn.nextInt();
           int n2 = scn.nextInt();
           int i , gcd = 1;
           for(i=1; i<=n1 && i<=n2 ; ++i) {
        	   if(n1%i == 0 && n2%i == 0) {
        		   gcd = i;
        	   }
           }
           int lcm = (n1*n2)/gcd;
           System.out.println();
	}

}
