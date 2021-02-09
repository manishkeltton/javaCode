package javaCode;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
           Scanner scn = new Scanner(System.in);
           int num1 = scn.nextInt();
           int num2 = scn.nextInt();
           int lcm;
           lcm = (num1 > num2) ? num1 : num2;
           while(true) {
        	   if(lcm%num1 == 0 && lcm%num2 == 0) {
        		   System.out.printf("The lcm of %d and %d is %d.",num1,num2,lcm);
        		   break;
        	   }
        	   ++lcm;
           }   
	}

}
